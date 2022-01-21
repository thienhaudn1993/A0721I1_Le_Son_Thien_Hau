<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 1/18/2022
  Time: 8:16 PM
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
    <input type="text" name="name" value="${customer.customer_name}">
    <p>Email: </p>
    <input type="text" name="email" value="${customer.customer_email}">
    <p>Address: </p>
    <input type="text" name="address" value="${customer.customer_address}">
    <button type="submit">Update</button>
</form>
</body>
</html>
