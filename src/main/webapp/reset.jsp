<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %><%--
  Created by IntelliJ IDEA.
  User: dsi
  Date: 12/31/23
  Time: 3:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<div style="background-color: bisque" align="center">
    <form action="reset">
         Your Mail: <%= request.getAttribute("mail")%><br>
         Enter Your New Password:<br><input type="text" name="pass"> <br>
        <input type="submit" value="reset">
    </form>
</div>
</body>
</html>
