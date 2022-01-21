<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 1/19/2022
  Time: 7:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Delete Employee</p>
<a href="/employee">Quay trở lại nếu không muốn xóa</a>
<form method="post">
    <p style="color: red">${msgDelete}</p>
    <p>ID: ${employee.employee_id}</p>
    <p>Name: ${employee.employee_name}</p>
    <button>Xác nhận xóa Employee</button>
</form>
</body>
</html>
