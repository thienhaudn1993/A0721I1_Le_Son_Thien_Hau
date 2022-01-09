<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 1/9/2022
  Time: 7:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create New Product</title>
    <style>
        .message{
            color:green;
        }
    </style>
</head>
<body>
<h1>New Product</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/products">Back List Product</a>
</p>
<form method="post">
    <fieldset>
        <legend>Product Information</legend>
        <table>
            <tr>
               <td>Name: </td>
               <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>Brand: </td>
                <td><input type="text" name="brand"></td>
            </tr>
            <tr>
                <td>Quatity: </td>
                <td><input type="text" name="quatity"></td>
            </tr>
            <tr>
                <td>Status: </td>
                <td><input type="text" name="status"></td>
            </tr>
        </table>
        <button type="submit">Create Product</button>
    </fieldset>
</form>
</body>
</html>
