<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 1/3/2022
  Time: 10:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Delete Student</p>
<a href="/student">Quay trở lại nếu không muốn xóa</a>
<form method="post">
    <p style="color: red">${msgDelete}</p>
    <p><b>Student bạn muốn xóa có thông tin như sau:</b> </p>
    <p>ID: ${student.id}</p>

    <p>Name:  <input name="name" value="${student.name}"></p>

    <p>Date Of Birth: <input name="dateOfBirth" value="${student.dateOfBirthday}"></p>
    <p>Gender: <input name="gender" value="${student.gender}"></p>
    <p>Grade: <input name="grade" value="${student.grade}"></p>
    <button type="submit">Xác nhận xóa</button>
</form>
</body>
</html>
