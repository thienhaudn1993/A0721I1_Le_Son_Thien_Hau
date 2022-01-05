<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 1/4/2022
  Time: 8:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      h1 {
        text-align: center;
      }
      table td {
        padding: 10px;
      }
      table th {
        text-align: left;
        padding: 10px;
      }
    </style>
  </head>
  <body>
  <h1>Danh sách khách hàng</h1>
  <table style="width: 700px" border="1px">
    <tr>
      <th>Tên</th>
      <th>Ngày sinh</th>
      <th>Địa chỉ</th>
      <th>Ảnh</th>
    </tr>
    <c:forEach var="customer" items="${customerList}">
      <tr>
        <td><c:out value="${customer.name}"></c:out> </td>
        <td><c:out value="${customer.dateOfBirth}"></c:out> </td>
        <td><c:out value="${customer.address}"></c:out> </td>
        <td> <img src="<c:out value="${customer.image}"></c:out> " style="width: 50px"  </td>
      </tr>
    </c:forEach>

  </table>
  </body>
</html>
