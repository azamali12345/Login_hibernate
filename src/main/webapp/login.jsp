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
		<table>
			<form action="/login" method="post">
			<tr>
			<th>USER NAME:</th>
			<th><input type="text" name="username" required></th>
			</tr>
			<tr>
			<th>PASSWORD:<input type="password" name="password" required></th>
			</tr>
			<tr>
			<th><input type="submit" value="LOGin"></th>
			</tr>
			<tr>
			<th><a href="registration.jsp">REGISTRATION</a></th>
			<th><a href="forget.jsp">FORGET PASSWORD</a></th>
			</tr>	
			</form>
		</table>
	</center>
</body>
</html>
