<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
#register{margin: -30px 40px;}
</style>
<title>用户登录</title>
</head>
<body>
<div style="border: black solid;  width: 600px; height: 300px; margin: 100px auto;">
<h1 style="margin: 30px">用户注册</h1><br><br><br>
<form action="/ShoppingCart/register" method="post" >
<table id="register">

<tr>
<td>用户名:</td>
<td><input type="text" name="username" placeholder="请输入用户名" required="required">&nbsp;*</td>
<td><span style="color: red;">${erroyMsg}</span></td>
</tr>
<tr>
<td>密&emsp;码:</td>
<td><input type="password" name="password" placeholder="请输入密码" required="required">&nbsp;*</td>
</tr>
<tr>
<td>邮&emsp;箱:</td>
<td><input type="text" name="email" placeholder="请输入邮箱" required="required">&nbsp;*</td>
</tr>
<tr>
<td><input type="submit" value="注册"></td>
</tr>
</table>
</form>
<div style="margin: 90px 210px;">版权所有 © 2018&emsp;<a href="mailto:18609933956@163.com" style="color: purple; ">bug提交点击</a></div>
</div>
</body>
</html>