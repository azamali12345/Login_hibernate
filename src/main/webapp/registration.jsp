<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<table border="2">
	<form action="register" method="post">
	<h3>REGISTRATION</h3>
	<tr><th>First Name:</th><th><input type="text" name="firstName" required></th></tr>
	<tr><th>Last Name:</th><th><input type="text" name="lastName" required></th></tr>
	<tr><th>User Name:</th><th><input type="text" name="username" required></th></tr>
	<tr><th>Password:</th><th><input type="password" name="password" required></th></tr>
	<tr><th>Confirm Password:</th><th><input type="password" name="confirmPassword" required></th></tr>
	<tr><th>Date Of Birth:</th><th><input type="text" name="DOB" required></th></tr>
	<tr><th>Mobile Number:</th><th><input type="number" name="mobile" required></th></tr>
	<tr><th>Email ID:</th><th><input type="text" name="mail" required></th></tr>
	<tr>
	<th><input type="submit" value="REGISTER"></th>
	<th><input type="reset" value="RESET"></th>
	</tr>
	</form>
	</table>
	</center>
</body>
</html>
