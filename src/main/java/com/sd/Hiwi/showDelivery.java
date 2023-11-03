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
 * Servlet implementation class showDelivery
 */
@WebServlet("/showDelivery")
public class showDelivery extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
		
		
		    
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataaa", "root", "me@sd");
	    String sql2 = "select * from delivery";
		PreparedStatement stt = conn.prepareStatement(sql2); 
		ResultSet rs = stt.executeQuery();
		ResultSetMetaData mm = stt.getMetaData();
		
		out.println("<html style = 'background-color:silver'>");
		out.println("<table style = 'font-size:30px'>");
		out.println("<h2>delivery informatiion</h2><hr><hr>");
		out.println("<thead>");
		out.println("<tr style = 'background-color: brown'>");
	    out.println("<th style = 'border: 1px solid cyan'>"+ mm.getColumnName(1)+ "</th><th style = 'border: 1px solid cyan'>"+ mm.getColumnName(2)+ "</th><th style = 'border: 1px solid cyan'>"+ mm.getColumnName(3)+ "</th><th style = 'border: 1px solid cyan'>"+ mm.getColumnName(4)+ "</th><th style = 'border: 1px solid cyan'>"+ mm.getColumnName(5)+ "</th><th style = 'border: 1px solid cyan'>"+ mm.getColumnName(6)+ "</th><th colspan = '2' style =  'border: 1px solid cyan'>Action</th></tr></thead>");
		
		  while(rs.next()) {
			  out.println("<tbody>");
			  
			  out.println("<tr style = 'background-color: cyan'>");
			  out.println("<td style = 'border: 1px solid black'>" + rs.getString(1) +"</td>");
			  out.println("<td style = 'border: 1px solid black'>" + rs.getString(2) +"</td>");
			  out.println("<td style = 'border: 1px solid black'>" + rs.getString(3) +"</td>");
			  out.println("<td style = 'border: 1px solid black'>" + rs.getString(4) +"</td>");
			  out.println("<td style = 'border: 1px solid black'>" + rs.getString(5) +"</td>");
			  out.println("<td style = 'border: 1px solid black'>" + rs.getString(6) +"</td>");
			  out.println("<td style = 'border: 1px solid black'><a href= deleteDelivery.jsp>delete</a></td>");
			  out.println("<td style = 'border: 1px solid black'><a href= deliveryAdd.jsp>add</a></td>");
			  
			  out.println("</tr></tbody>");
			  
		  }
		out.println("</table>");
		out.println("<br><p><a href = adminadata.jsp>go back</a></p>");

		out.println("</html>");

		
		
		}catch (Exception e) {
			out.println(e);
			e.printStackTrace();
		}
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
