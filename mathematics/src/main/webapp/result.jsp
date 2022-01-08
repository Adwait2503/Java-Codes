<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body bgcolor="black">
	<%
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	double sum = 0;
	if ("Add".equals(request.getParameter("add"))) {
		out.println("<marquee scrollamount=30 bgcolor=red><h1 align=center>Addition is ....</h1></marquee>");
		sum = num1 + num2;
	} else if ("Sub".equals(request.getParameter("sub"))) {
		out.println("<marquee scrollamount=30 bgcolor=green><h1 align=center>Substraction is ....</h1></marquee>");
		sum = num1 - num2;
	} else if ("Mult".equals(request.getParameter("mult"))) {
		out.println("<marquee scrollamount=30 bgcolor=white><h1 align=center>Multiplication is ....</h1></marquee>");
		sum = num1 * num2;
	} else if ("Div".equals(request.getParameter("div"))) {
		out.println("<marquee scrollamount=30 bgcolor=pink><h1 align=center>Division is ....</h1></marquee>");
		sum = num1 / num2;
	} else if ("Perc".equalsIgnoreCase(request.getParameter("perc"))) {
		out.println("<marquee scrollamount=30 bgcolor=blue><h1 align=center>Percentage  is ....</h1></marquee>");
		sum = (num1 * 100) / num2;
	} else if ("Fib".equalsIgnoreCase(request.getParameter("fib"))) {
		out.print("<marquee scrollamount=30 bgcolor=blue><h1 align=center>Fibonacci Series  is ....</h1></marquee>");
		sum=num1;
		double n = num2, secondTerm = 1;
		while (sum <= n) {
			double nextTerm = sum + secondTerm;
			sum = secondTerm;
			secondTerm = nextTerm;
			out.println(sum + ", ");
		}
	}
	%>
	<font color="white">
		<h2 align="center"><%=sum%></h2>
	</font>
</body>
</html>