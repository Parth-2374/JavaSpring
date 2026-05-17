<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Login </title>
</head>
<body>
<h2 style="text-align: center; font-size: 30px">Login Form</h2>

<form action="login" method="post" style="text-align: center;">

<label style="font-size: 24px;">Email Id :- </label>
<input type="text" name="email" style="font-size: 24px; "required="required"/>

<br><br>

<label style="font-size: 24px;">Password :- </label>
<input type="password" name="password" style="font-size: 24px;"required="required"/>

<br><br>

<input style="font-size: 24px;" type="submit" value="Login"/>

</form>
<div style="border:2px solid black;text-align: center;margin-top:50px; border-radius: 10px;padding-top: 10px; padding-bottom: 10px;">
	<a href="register" style="text-decoration: none; color: blue; font-size: 20px;" > New User Register Here </a>
</div>

</body>
</html>