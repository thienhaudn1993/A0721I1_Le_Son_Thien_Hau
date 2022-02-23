<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 2/23/2022
  Time: 11:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="/save" method="post">
    <input type="checkbox" name="condiment" value="Lettuce">
    <span>Lettuce</span>
    <input type="checkbox" name="condiment" value="Tomato">
    <span>Tomato</span>
    <input type="checkbox" name="condiment" value="Mustard">
    <span>Mustard</span>
    <input type="checkbox" name="condiment" value="Sprouts">
    <span>Sprouts</span>
    <hr>
    <input type="submit" value="Save">
</form>
<h1> Gia vị bạn chọn: </h1>
<c:forEach var="c" items="${condiment}">
    <c:out value="${c}"></c:out>
    <br>
</c:forEach>
</body>
</html>
