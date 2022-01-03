<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/31/2021
  Time: 10:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p style="color: blue">${msg}</p>
<p style="color: blue">${msgDelete}</p>
<h2>List Student</h2>
<a href="/student?action=create">Creat new Student</a>
<br><br><br>
<table style="width: 700px;" border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Date Of Birthday</th>
        <th>Gender</th>
        <th>Grade</th>
        <th>Degree</th>
        <th>Update</th>
        <th>Delete</th>
    </tr>
    <c:forEach var="student" items="${studentList}">
    <tr>
            <td><c:out value="${student.id}"></c:out></td>
            <td><c:out value="${student.name}"></c:out></td>
            <td><c:out value="${student.dateOfBirthday}"></c:out></td>
            <td>
                <c:if test="${student.gender == 1}">
                    Male
                </c:if>
                <c:if test="${student.gender == 0}">
                    Famale
                </c:if>
            </td>
            <td><c:out value="${student.grade}"></c:out></td>
            <td>
                <c:choose>
                    <c:when test="${student.grade < 4}">Bad</c:when>
                    <c:when test="${student.grade < 7}">Good</c:when>
                    <c:otherwise>Very Good</c:otherwise>
                </c:choose>

            </td>
        <td>
            <a href="/student?action=update&id=${student.id}">Update</a>
        </td>
        <td>
            <a href="/student?action=delete&id=${student.id}">Delete</a>
        </td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
