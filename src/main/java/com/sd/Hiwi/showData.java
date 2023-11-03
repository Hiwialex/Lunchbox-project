package com.sd.Hiwi;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class showData
 */
@WebServlet("/showData")
public class showData extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   
		    response.setContentType("text/html");
		    PrintWriter out = response.getWriter();
		
		   //retrieving data from the database
		
		try {
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataaa", "root", "me@sd");
			String sql1 = "select * from food";
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql1);
			
			
			ResultSetMetaData dd = rs.getMetaData();
			
			int columnNumber = dd.getColumnCount();
			
			 out.println("<html style = 'background-color:silver'>");
			 out.println("<table style = 'font-size: 30px'>");
			 out.println("<h1>Lunchbox Name And It's Price</h1><hr><hr>");
			 out.println("<thead>");
			 out.println("<tr style = 'background-color: brown'>");
			 out.println("<th style = 'border: 1px solid black'>"+dd.getColumnName(1)+"</th>");
			 out.println("<th style = 'border: 1px solid black'>"+ dd.getColumnName(2)+ "</th>");
			 out.println("<th colspan = '3'style = 'border: 1px solid black'>Action</th>");
			 out.println( "</tr></thead>");
			 while(rs.next()) {
				 
				 out.println("<tbody>");
				 out.println("<tr style = 'background-color: cyan'>");
			     out.println("<td style = 'border: 1px solid black'>" +rs.getString(1)+ "</td>");
				 out.println("<td style = 'border: 1px solid black'>"+rs.getDouble(2)+ "</td>");
				 out.println("<td style = 'border: 1px solid black'><a href = addFood.jsp>add</a></td>");
				 out.println( "<td style = 'border: 1px solid black'><a href = deleteFood.jsp>delete</a></td>");
				 out.println("<td style = 'border: 1px solid black'><a href = updateFood.jsp>update</a></td>");
				 out.println("</tr></tbody>");
				 
			 }
			 out.println("</table");
			 out.println("<br><p><a href = adminadata.jsp>go back</a></p>");;
			 out.println("</html>");
			
			
		}catch (Exception e) {
			out.println(e);
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
