<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>bai 3</title>
</head>
<body>
	<form action="servlet" method="Post" align="center">
		<h2> Đăng Nhập </h2>
		<h3> ${kq }</h3>
			Username: <input type="text" name="txtusername"><br/>
			Password: <input type="password" name="txtpassword"><br/>
			<input type="submit" name="btn" value="Login">	
	</form>
</body>
</html>