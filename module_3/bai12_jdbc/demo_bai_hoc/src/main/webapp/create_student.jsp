<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 1/2/2022
  Time: 7:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Create Student</h2>
<form method="post">
    <p>ID: </p>
    <p style="color: red">${msg}</p>
    <input type="text" name="id">
    <p>Name: </p>
    <input type="text" name="name">
    <p>Date Of Birth</p>
    <input type="date" name="dateOfBirth">
    <p>Gender: ( 1:Male | 0:Famale ) </p>
    <input type="text" name="gender">
    <p>Grade: </p>
    <input type="text" name="grade">
    <button type="submit">Create Student</button>
</form>

</body>
</html>
