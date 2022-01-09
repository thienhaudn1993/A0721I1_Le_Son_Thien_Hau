<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 1/9/2022
  Time: 9:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Delete Product</h1>
<p>
    <a href="/products">Back Product List</a>
</p>
<form method="post">
<fieldset>
    <legend>Product Information need Delete</legend>
    <table>
        <tr>
            <td>Name: </td>
            <td><c:out value="${product.name}"></c:out></td>
        </tr>
        <tr>
            <td>Brand: </td>
            <td><c:out value="${product.brand}"></c:out></td>
        </tr>
        <tr>
            <td>Quatity: </td>
            <td><c:out value="${product.quatity}"></c:out></td>
        </tr>
        <tr>
            <td>Status: </td>
            <td><c:out value="${product.status}"></c:out></td>
        </tr>
    </table>
    <button type="submit">Delete Product</button>
</fieldset>
</form>
</body>
</html>
