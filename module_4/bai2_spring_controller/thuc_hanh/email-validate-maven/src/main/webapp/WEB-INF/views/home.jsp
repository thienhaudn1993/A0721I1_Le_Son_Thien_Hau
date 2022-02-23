<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 2/22/2022
  Time: 8:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>Email Validate</h1>
<h2 style="color: red">${message}</h2>
<form action="/validate" method="post">
    <p>Email: </p>
    <input type="text" name="email">
    <input type="submit" value="Validate">
</form>
</body>
</html>
