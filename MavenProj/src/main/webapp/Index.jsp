<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>
    <div style="border: 2px solid black; text-align: center; width: 55%; margin-left: 1rem; background-color: rgb(89, 161, 233);">
        <h1>Player Details</h1>

    </div>
    <form style="border: 2px solid black; width: 55%; margin-left: 1rem; margin-top: 0.2rem; background-color:rgb(154, 210, 231) ;" action="Login.jsp" method="post">
      <table style="margin-left: 15%;">
       <tr><td>Email ID</td><td><input type="text"style="margin: 1rem;border-style:groove;" name="uname" placeholder="Enter your id"></td></tr>
       <tr> <td>Password </td> <td><input type="password" style="margin: 1rem; border-style:groove;" name="password" placeholder="Enter your password"></td></tr>
       
            
      </table> 
      <div>
        <div style="border: 2px solid black; text-align: center; margin: 1rem; background-color: rgb(89, 161, 233); padding: 1 rem;">
            <input type="submit" name="Submit" style="margin: 1rem;border-style:groove;">
    
        </div>
      </div>


    </form>
</body>
</html>