<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Cơ sở dữ liệu</title>
</head>
<body>
	<div align="center"> 
		<a href="index.jsp"> Login</a>
		<a href="logoutservlet" method="get"> Logout</a>
		<a href="profileservlet" method="get"> profile</a>
		</div>
	<form action="servlet" method="Post" align="center">
		<h2> Đăng Nhập </h2>
		<h3> ${kq }</h3>
			Username: <input type="text" name="txtusername"><br/>
			Password: <input type="password" name="txtpassword"><br/>
			<input type="submit" name="btn" value="Login">	
	</form>
</body>
</html>