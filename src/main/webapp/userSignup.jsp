<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User sign up</title>
<style type = "text/css">
     form {
     padding-top: 200px;
      text-align: center;
      color : white; 
   }
   html {
      background: silver;
      background-image: url("dd.jpg");
   }
  form h1 {
      color: blue;
      font-family: verdana;
   }
   form p {
      color: white;
      font-size: 25px;
   }
</style>

    <script>
    
    
    function  validationFunction(){

        var name = document.getElementById("name").value;
        var password = document.getElementById("pass").value;


        if (password == ""){
            document.getElementById("passd").innerHTML = "password can ot be null";
            return false;
        }

        if (password.length > 15){
            document.getElementById("passd").innerHTML = "password length must not be exceed 15 charcters";
            return false;

        }

        if (password.length  < 8){

            document.getElementById("passd").innerHTML = "password length must be atleast 8 charcters";
            return false;

        }

        if (name == ""){
            document.getElementById("blank").innerHTML = "name can not be null";
            return false;

        }
        else{

            alert("hello mr " + name + "\n" + "you are signed successfully!!");
        }


    }
        
      
    
    </script>


</head>
<body>
  <form action = "userSignup" method = "post" onsubmit="return validationFunction()">
      <h1>Full fill all information to sign up</h1>
     <p>First Name </p>
     <input type = "text" id = "name" name = "firstName" value = ""><span id = "blank" style = "color:red"></span>
     <p>Last Name</p><input type= "text" name = "lastName">
     <p>Email </p><input type = "email" name = "Email">
     <p>Password </p><input type = "password"name = "Password">
     <p>Phone Number</p><input type = "text" name = "phone">
     <p>City </p><input type = "text" name = "city"><br>
     <br>
     <input type = "submit" value = "signup">
  </form>

</body>
</html>