<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品列表</title>
</head>
<body>
	<p style="margin: 0px 660px;">
		版权所有 © 2018&emsp;<a href="mailto:18609933956@163.com"
			style="color: purple;">bug提交点击</a>
	</p>
	<h2 style="margin: 0px 30px;">欢迎您:${sessionScope.USER_IN_SESSION.username}</h2>
	<table style="margin: 150px auto;">
		<tr>
			<td width="100px;">图片描述</td>
			<td width="100px;">商品编号</td>
			<td width="100px;">商品名称</td>
			<td width="100px;">商品种类</td>
			<td width="100px;">商品类型</td>
			<td width="100px;">商品价格</td>
			<td width="100px;">商品运费</td>
			<td width="120px;">商品生产日期</td>
			<td width="100px;">商品产地</td>
			<td width="150px;">商品描述</td>
			<td width="150px;">操作组件</td>
		</tr>
		<c:forEach items="${products}" var="p">
			<tr align="center">
				<td height="50;">
					<div style="height: 100%; width: 100%">
						<img style="max-height: 100%"
							src="/ShoppingCart/pimage/${p.pid}.jpg">
					</div>
				</td>
				<td height="50;">${p.pid}</td>
				<td height="50;">${p.name }</td>
				<td height="50;">${p.pkind }</td>
				<td height="50;">${p.ptype }</td>
				<td height="50;">${p.price }</td>
				<td height="50;">${p.pcarriage }</td>
				<td height="50;">${p.pdate }</td>
				<td height="50;">${p.paddress }</td>
				<td height="50;">${p.pdescribed }</td>
				<td height="50;"><a href="/ShoppingCart/products?cmd=delete&id=${p.pid }">删除</a>&emsp; <a href="/ShoppingCart/products?cmd=delete&id=${p.pid }">添加</a>&emsp;
					<a href="">添加购物车</a>&emsp;</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>