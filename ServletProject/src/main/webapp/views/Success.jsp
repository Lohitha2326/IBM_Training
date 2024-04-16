<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login Success Page</h1>
<!--Scriplet Tag-->
<% int a=10;
int b=20;
out.println(a+b);
%>

<!-- Declaration tag -->
<%!int a=10; %>
<%!int b=20; %>
<!-- Directive tag -->
<%=a+b %>

<!-- Can also print value from servlet code -->
<% String user=(String)session.getAttribute("userSession");
out.println("welcome "+user);
 %>

</body>
</html>