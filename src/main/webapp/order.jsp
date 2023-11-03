<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ordering food</title>
<style type = "text/css">
   form {
      text-align: center;
     padding-top : 30px;
     color : white;
     font-size : 35px;
      
   }
   form ul li {
       
         display : inline-block;
         list-style-type : none;
         color: white;
         padding-right : 35px;
         font-size : 25px;
         font-family : sans-serif;
   }
   html {
      
        background-image : url("dcd.jpg");
   }
   form h1  {
       font-size: 40px;
       color: white;
       
   }
   form h3 {
        font-size: 35px;
        color : white;
    }
    form p {
        font-size : 60px;
        color : red;
    }
</style>
</head>
<body>
   <form action = "ordering" method = "get">
       <h1>With us, you can:- Customize Your Meals, Save Time and Ensure Nutrition</h1>
       <h3>Subscribe now and transform lunchtime into an enjoyable experience!</h3>
       <p>Variety of Lunchboxs and their Price</p>
       <ul>
         <li>DIY Taco Lunchbox<br>price :200birr </li>
         <li>Pizza Roll-Up Bento Lunch<br>price : 150birr</li>
         <li>Turkey Meatball & Feta Lunchbox<br>price: 200birr</li>
         <li>Taco Salad Bento Lunchbox<br>price : 200birr</li>
         <li>Pasta Salad with Vinaigrette Lunchbox<br>price : 200birr</li>
         <li>Cucumber Sandwich<br>price : 100birr</li>
         <li>Egg Salad Lunchbox<br>price : 200birr</li>
         <li>Chicken Meatball Wrap Lunchbox<br>price : 150birr</li>
         <li>Rainbow Bento Lunchbox<br>price: 200birr</li>
         <li>Turkey & Cheese Pinwheels Bento Lunchbox<br>price: 200birr</li>
       </ul>
       your choice 
       <input type = "text" name = "foodChoosed" placeholder = "food name">
       <br><input type = "submit" value = "submit">
       
   </form>
</body>
</html>