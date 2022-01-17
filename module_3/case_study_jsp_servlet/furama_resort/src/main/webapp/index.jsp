<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 1/17/2022
  Time: 4:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
    <link href="styles.css" rel="stylesheet">
  </head>
  <body>
  <header>
    <ul>
      <li><a href="#">Home</a></li>
      <li><a href="#">Employee</a></li>
      <li><a href="/customer/list_customer.jsp"">Customer</a></li>
      <li><a href="#">Service</a></li>
      <li><a href="#">Contract</a></li>
      <li><input type="search" name="search" value="search"></li>
    </ul>
  </header>
  <div class="row">
    <div>
      <div class="col-2">
        <div class="left">
          <br>
          <div><a href="#">Item One</a></div>
          <br>
          <div><a href="#">Item Two</a></div>
          <br>
          <div><a href="#">Item Three</a></div>
        </div>

      </div>
    </div>
    <div class="col-10">
      <div>
        <h2>body</h2>
      </div>
    </div>
  </div>
  <div class="col-12">
    <footer>
      <h2>Footer Text</h2>
    </footer>
  </div>
  </body>
</html>
