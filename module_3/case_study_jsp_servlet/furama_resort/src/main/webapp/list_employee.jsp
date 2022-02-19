<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 1/19/2022
  Time: 5:23 PM
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
<h2><a href="/employee?action=create">Create new Employee</a></h2>
<p style="color: blue">${msg}</p>
<p style="color: green">${msgDelete}</p>

<h2>List Employee</h2>
<%--mess bên hàm search--%>
<c:if test="${mess!=null}">
<h3 style="color: red">${mess}</h3>
</c:if>
<form method="get" action="/employee">
    <input type="hidden" name="action" value="search">
    <input type="text" name="name" placeholder="search name">
    <input type="text" name="email" placeholder="search email">
    Division
    <select name="divisionId">
        <option value="">Chọn Division</option>
        <%--<option value="1">Sale-Marketing</option>
        <option value="2">Hành chính</option>
        <option value="3">Phục vụ</option>
        <option value="4">Quản lý</option>--%>

        <c:forEach var="devision" items="${devisionEmployeeList}">
            <option value="${devision.devision_id}">${devision.devision_name}</option>
        </c:forEach>
    </select>
    <button type="submit">Search</button>
</form>

<table style="width: 1500px;" border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Date Of Birth</th>
        <th>ID_Card</th>
        <th>Salary</th>
        <th>Phone</th>
        <th>Email</th>
        <th>Address</th>
        <th>Position</th>
        <th>Education Degree</th>
        <th>Division </th>
        <th>Update</th>
        <th>Delete</th>
    </tr>
    <c:forEach var="employee" items="${employeeList}">
        <tr>
            <td><c:out value="${employee.employee_id}"></c:out></td>
            <td><c:out value="${employee.employee_name}"></c:out></td>
            <td><c:out value="${employee.employee_birthday}"></c:out></td>
            <td><c:out value="${employee.employee_id_card}"></c:out></td>
            <td><c:out value="${employee.employee_salary}"></c:out></td>
            <td><c:out value="${employee.employee_phone}"></c:out></td>
            <td><c:out value="${employee.employee_email}"></c:out></td>
            <td><c:out value="${employee.employee_address}"></c:out></td>
            <td>
                <c:if test="${employee.position_id == 1}">Quản Lý</c:if>
                <c:if test="${employee.position_id == 2}">Nhân Viên</c:if>
            </td>
            <td>
                <c:if test="${employee.education_degree_id == 1}">Trung Cấp</c:if>
                <c:if test="${employee.education_degree_id == 2}">Cao Đẳng</c:if>
                <c:if test="${employee.education_degree_id == 3}">Đại Học</c:if>
                <c:if test="${employee.education_degree_id == 4}">Sau Đại Học</c:if>

            </td>
            <td>
                <c:if test="${employee.division_id == 1}">Sale-Marketing</c:if>
                <c:if test="${employee.division_id == 2}">Hành chính</c:if>
                <c:if test="${employee.division_id == 3}">Phục vụ</c:if>
                <c:if test="${employee.division_id == 4}">Quản lý</c:if>

            </td>
            <td>
                <a href="/employee?action=update&id=${employee.employee_id}">Update</a>
            </td>
            <td>
                <a href="/employee?action=delete&id=${employee.employee_id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
