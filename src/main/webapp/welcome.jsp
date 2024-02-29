<%--
  Created by IntelliJ IDEA.
  User: dsi
  Date: 12/31/23
  Time: 2:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to Volunteer Management System</title>
</head>
<body>
<div style="background-color: lightblue" align="center">
        <h1 align="center" style="background-color: aqua">Welcome <%=request.getAttribute("usr_name")%></h1>
        <p style="background-color: aquamarine">You have been assigned this task <%=request.getAttribute("assigned")%></p>
</div>
</body>
</html>
