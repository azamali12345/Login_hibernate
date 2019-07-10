<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<form action="/reset" method="post">
	<tr>
	<th>Password:</th>
	<th><input type="password" name="password" required></th>
	</tr>
	<tr>
	<th>Confirm Password:</th>
	<th><input type="password" name="confirmPassword" required></th>
	</tr>
	<tr><th><input type="submit" value="SUBMIT"></th></tr>
	</form>
</table>
</body>
</html>
