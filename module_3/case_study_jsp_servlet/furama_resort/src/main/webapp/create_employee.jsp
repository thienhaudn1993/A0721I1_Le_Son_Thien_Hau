<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 1/19/2022
  Time: 6:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <p style="color: red">${msg}</p>
    <%--<p>Id: </p>
    <input type="text" name="id">--%>

<%--    ID tự tăng nên k cần nhập--%>
    <p>Name: </p>
    <input type="text" name="name">
    <p>Date Of Birthday ( Y-M-D ): </p>
    <input type="date" name="dateOfBirth">
    <p>Employee ID Card: </p>
    <input type="text" name="employeeIdCard">
    <p>Salary: </p>
    <input type="text" name="salary">
    <p>Phone: </p>
    <input type="text" name="phone">
    <p>email: </p>
    <input type="text"  name="email">
    <p>address: </p>
    <input type="text" name="address">
    <p>Position: </p>
    <select name="positionId">
        <option value="">Enter Position</option>
        <option value="1">Quản lý</option>
        <option value="2">Nhân viên</option>
    </select>
<%--    <input type="text" name="positionId">--%>
    <p>Education Degree: </p>
    <select name="educationDegreeId">
        <option value="">Enter Edication Degree</option>
        <option value="1">Trung Cấp</option>
        <option value="2">Cao Đẳng</option>
        <option value="3">Đại Học</option>
        <option value="4">Sau Đại Học</option>
    </select>
<%--    <input type="text" name="educationDegreeId">--%>
    <p>Division: </p>
    <select name="divisionId"><option value="">Enter Position</option>
        <option value="">Enter Devision</option>
        <option value="1">Sale-Marketing</option>
        <option value="2">Hành chính</option>
        <option value="3">Phục vụ</option>
        <option value="4">Quản lý</option>
    </select>
    <br>
    <br>
<%--    <input type="text" name="divisionId">--%>
    <button type="submit">Create Customer</button>
</form>
</body>
</html>
