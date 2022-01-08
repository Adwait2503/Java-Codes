<%@page import="com.te.springmvc.model.Register"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	Register ref = (Register) request.getAttribute("details");
	%>
	<h1 align="center" style="color: red">
		<b><u><em><%=ref.getName()%> Registered Successfull...</em></u></b>
	</h1>
	<h1 align="center" style="color: cyan">
		<b><u><em><%=ref%></em></u></b>
	</h1>
</body>
</html>