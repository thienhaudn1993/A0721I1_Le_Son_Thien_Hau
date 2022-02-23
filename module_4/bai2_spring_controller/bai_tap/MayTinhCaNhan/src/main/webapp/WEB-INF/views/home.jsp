<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 2/23/2022
  Time: 11:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Caculator</h1>
<form action="/home/caculator" method="post">
    <input type="text" name="firstNumber">
    <input type="text" name="secondNumber">
    <br><br>
    <button name="calculator" value="adddition">Adddition(+)</button>
    <button name="calculator" value="subtraction">Subtraction(-)</button>
    <button name="calculator" value="multiplication">Multiplication(X)</button>
    <button name="calculator" value="division">Division(/)</button>

    <%--<input type="submit" name="adddition" value="Adddition(+)">
    <input type="submit" name="subtraction" value="Subtraction(-)">
    <input type="submit" name="multiplication" value="Multiplication(X)">
    <input type="submit" name="division" value="Division(/)">--%>
</form>
<h2>Result : ${result} </h2>
</body>
</html>
