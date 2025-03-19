<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
    <h1>Welcome, ${pageContext.request.userPrincipal.name}!</h1>
    <a href="/logout">Logout</a>
</body>
</html>
