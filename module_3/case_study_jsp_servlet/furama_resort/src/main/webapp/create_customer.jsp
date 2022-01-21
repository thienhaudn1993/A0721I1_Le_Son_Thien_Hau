<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 1/18/2022
  Time: 9:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <p style="color: red">${msg}</p>
    <p>Id: </p>
    <input type="text" name="id">
    <p>Name: </p>
    <input type="text" name="name">
    <p>Date Of Birthday ( Y-M-D ): </p>
    <input type="date" name="dateOfBirth">
    <p>Gender: </p>
    <input type="text" name="gender">
    <p>Customer ID Card: </p>
    <input type="text" name="customerIdCard">
    <p>Phone: </p>
    <input type="text" name="phone">
    <p>email: </p>
    <input type="text"  name="email">
    <p>address: </p>
    <input type="text" name="address">
    <p>Customer Type Id: </p>
    <input type="text" name="customerTypeId">
    <button type="submit">Create Customer</button>
</form>
</body>
</html>
