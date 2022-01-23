<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 1/17/2022
  Time: 8:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2><a href="/">Quay trở lại Menu</a></h2>
<h2><a href="/customer?action=create">Create new Customer</a></h2>
<form method="get" action="/customer">
    <input type="hidden" name="action" value="search">
    <input type="text" name="searchByName">
    <button type="submit">Search</button>
</form>

<p style="color: blue">${msg}</p>
<p style="color: green">${msgDelete}</p>
<h2>List Customer</h2>
<table style="width: 900px;" border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Date Of Birth</th>
        <th>Gender</th>
        <th>ID_Card</th>
        <th>Phone</th>
        <th>Email</th>
        <th>Address</th>
        <th>Customer Type</th>
        <th>Update</th>
        <th>Delete</th>
    </tr>
    <c:forEach var="customer" items="${customerList}">
        <tr>
        <td><c:out value="${customer.customer_id}"></c:out></td>
        <td><c:out value="${customer.customer_name}"></c:out></td>
        <td><c:out value="${customer.customer_birthday}"></c:out></td>
<%--        <td><c:out value="${customer.customer_gender}"></c:out></td>--%>
        <td>
            <c:if test="${customer.customer_gender == 1}">Male</c:if>
            <c:if test="${customer.customer_gender == 0}">Famale</c:if>
        </td>
        <td><c:out value="${customer.customer_id_card}"></c:out></td>
        <td><c:out value="${customer.customer_phone}"></c:out></td>
        <td><c:out value="${customer.customer_email}"></c:out></td>
        <td><c:out value="${customer.customer_address}"></c:out></td>
<%--        <td><c:out value="${customer.customer_type_id}"></c:out></td>--%>
        <td>
            <c:if test="${customer.customer_type_id == 1}">Diamond</c:if>
            <c:if test="${customer.customer_type_id == 2}">Platinium</c:if>
            <c:if test="${customer.customer_type_id == 3}">Gold</c:if>
            <c:if test="${customer.customer_type_id == 4}">Silver</c:if>
            <c:if test="${customer.customer_type_id == 5}">Member</c:if>
        </td>
        <td>
            <a href="/customer?action=update&id=${customer.customer_id}">Update</a>
        </td>
        <td>
            <a href="/customer?action=delete&id=${customer.customer_id}">Delete</a>
        </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
