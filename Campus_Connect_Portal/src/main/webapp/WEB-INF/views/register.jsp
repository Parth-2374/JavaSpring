<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Register </title>
</head>
<body>
<h2 style="text-align: center; font-size: 30px">Registration Form</h2>

<form action="saveUser" method="post" style="text-align: center;">

<label style="font-size: 24px;"> Email Id :- </label>
<input type="text" name="email" required="required" style="font-size: 24px"/>

<br><br>

<label style="font-size: 24px;">Password :- </label>
<input type="password" name="password" required="required" style="font-size: 24px;"/>

<br><br>

<input type="submit" value="Register" style="font-size: 24px;"/>

</form>
<div style="border:2px solid black;text-align: center;margin-top:50px; border-radius: 10px;padding-top: 10px; padding-bottom: 10px;">
<a href="/Campus_Connect_Portal/" style="text-decoration: none; color: blue; font-size: 20px;" >Login Page</a>
</div>
</body>
</html>