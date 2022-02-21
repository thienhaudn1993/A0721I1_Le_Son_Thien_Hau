<%--
  Created by IntelliJ IDEA.
  User: duytr
  Date: 2/16/2022
  Time: 8:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
</head>
<body>
<h3 style="color: red">${result}</h3>
<h3>Register</h3>
<form action="/register" method="post">
    <label>Username</label>
    <input type="text" name="username">
    <br>
    <label>Password</label>
    <input type="password" name="password">
    <br>
    <input type="submit" value="Register">
</form>
</body>
</html>
