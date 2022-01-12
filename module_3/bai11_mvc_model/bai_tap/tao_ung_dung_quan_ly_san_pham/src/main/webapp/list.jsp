<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 1/7/2022
  Time: 9:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh sách sản phẩm</h1>
<p><a href="/products?action=create">Create New Product</a></p>
<table style="width: 700px" border="1">
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Brand</th>
    <th>Quatity</th>
    <th>Status</th>
    <th>Edit</th>
    <th>Delete</th>
</tr>
 <c:forEach var="product" items='${requestScope["productList"]}'>
     <tr>
      <td><c:out value="${product.id}"></c:out></td>
      <td><a href="products?action=view&id=${product.id}"><c:out value="${product.name}"></c:out></a></td>
      <td><c:out value="${product.brand}"></c:out></td>
      <td><c:out value="${product.quatity}"></c:out></td>
      <td><c:out value="${product.status}"></c:out></td>
      <td><a href="/products?action=edit&id=${product.id}">Edit</a></td>
      <td><a href="/products?action=delete&id=${product.id}">Delete</a></td>
   </tr>
 </c:forEach>

</table>
</body>
</html>
