<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 2/20/2022
  Time: 10:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> Chuyển đổi USD qua VNĐ</h1>
<p>Tỉ giá 1 USD = 23.000 VNĐ</p>
<form  action="/controller" method="post">
    <p>Nhập USD:</p>
    <input type="text" name="usd">
    <br><br>
    <button>submit</button>
    <p>VND là: ${vnd}</p>
</form>
</body>
</html>
