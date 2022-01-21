<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 1/19/2022
  Time: 11:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Delete Customer</p>
<a href="/customer">Quay trở lại nếu không muốn xóa</a>
<form method="post">
    <p style="color: red">${msgDelete}</p>
    <p>ID: ${customer.customer_id}</p>
    <p>Name: ${customer.customer_name}</p>
    <button>Xác nhận xóa Customer</button>
</form>
</body>
</html>
