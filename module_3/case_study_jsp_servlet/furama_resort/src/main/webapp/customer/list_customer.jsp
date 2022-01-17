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
<h2>List Customer</h2>
<table style="width: 500px;" border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Date Of Birth</th>
        <th>Gender</th>
        <th>ID_Card</th>
        <th>Phone</th>
        <th>Email</th>
        <th>Address</th>
    </tr>
    <c:forEach var="customer" items="${customerList}">
        <tr>
        <td><c:out value="${customer.customer_id}"></c:out></td>
        <td><c:out value="${customer.customer_name}"></c:out></td>
        <td><c:out value="${customer.customer_birthday}"></c:out></td>
        <td><c:out value="${customer.customer_gender}"></c:out></td>
        <td><c:out value="${customer.customer_id_card}"></c:out></td>
        <td><c:out value="${customer.customer_phone}"></c:out></td>
        <td><c:out value="${customer.customer_email}"></c:out></td>
        <td><c:out value="${customer.customer_address}"></c:out></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
