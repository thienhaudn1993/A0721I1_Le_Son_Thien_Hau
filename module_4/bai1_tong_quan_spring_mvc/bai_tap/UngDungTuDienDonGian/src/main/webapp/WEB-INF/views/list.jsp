<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 2/22/2022
  Time: 10:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<h1> Từ điển Anh - Việt </h1>
<%--<h2>${message}</h2>--%>
<form action="/home" method="post">
    <p>Nhập English vào đây:</p>
    <input type="text" name="english" placeholder="InputEnlish">
    <input type="submit" value="Translate">
</form>
<c:if test="${result != null}"><h2>Kết quả là: </h2>${result}</c:if>
<c:if test="${result == null}"><h2>${message}</h2></c:if>
<%--<h2> Result: ${result}</h2>--%>
</body>
</html>
