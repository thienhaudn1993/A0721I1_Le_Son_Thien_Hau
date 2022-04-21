<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 2/24/2022
  Time: 10:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Mail Box</title>
    <style>
        table tr th {
            padding-right: 50px;
            margin: 10px 0px 10px 0px;
            float: left;
        }

        table
    </style>
</head>
<body>
<h1>Settings</h1>
<form:form method="post" action="/home/save" modelAttribute="box">
    <table>
        <tr>
            <th>Language:</th>
            <th>
                <form:select path="languages">
                    <form:option value="English">English</form:option>
                    <form:option value="Vietnamese">Vietnamese</form:option>
                    <form:option value="Japanese">Japanese</form:option>
                    <form:option value="Chinese">Chinese</form:option>
                </form:select>
            </th>
        </tr>
        <tr>
            <th>Page Size:</th>
            <th>
                <label>Show</label>
                <form:select path="pageSize">
                    <form:option value="5">5</form:option>
                    <form:option value="10">10</form:option>
                    <form:option value="15">15</form:option>
                    <form:option value="25">25</form:option>
                    <form:option value="50">50</form:option>
                    <form:option value="100">100</form:option>
                </form:select>
                <label>emails per page</label>
            </th>
        </tr>
        <tr>
            <th>Spams filter:</th>
            <th><form:checkbox path="spamsFilter" value="Enable spams filter"/>Enable spams filter</th>
        </tr>
        <tr>
            <th>Signature:</th>
            <th><form:textarea path="signature"></form:textarea></th>
        </tr>
        <tr>
            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            </th>
            <th>
                <label><form:button>Update</form:button></label>
                <label><form:button><a href="/home">Cancel</a></form:button></label>
            </th>
        </tr>
    </table>
</form:form>
</body>
</html>
