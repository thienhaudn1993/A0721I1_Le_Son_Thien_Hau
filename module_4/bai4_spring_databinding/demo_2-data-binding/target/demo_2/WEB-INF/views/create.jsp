<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create User</h1>
<form:form method="post" action="/create" modelAttribute="user">
    <div>
        <label>Id: </label>
       <form:input path="id" />
    </div>
    <div>
        <label>Name: </label>
        <form:input path="name" />
    </div>
    <div>
        <label>Age: </label>
        <form:input path="age" />
    </div>
    <div>
        <label>address: </label>
        <form:input path="address" />
    </div>
    <div>
        <label>Email: </label>
        <form:input path="email" />
    </div>
    <input type="submit" class="btn btn-primary" value="Create">
</form:form>
</body>
</html>
