<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 1/19/2022
  Time: 7:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <p>Name: </p>
    <input type="text" name="name" value="${employee.employee_name}">
    <p>Email: </p>
    <input type="text" name="email" value="${employee.employee_email}">
    <p>Address: </p>
    <input type="text" name="address" value="${employee.employee_address}">
    <button type="submit">Update</button>

</body>
</html>
