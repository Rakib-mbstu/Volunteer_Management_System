<%--
  Created by IntelliJ IDEA.
  User: dsi
  Date: 12/31/23
  Time: 10:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Volunteer Management System</title>
</head>
<body>
<div style="background-color: darkseagreen" align="center">
<h1>Welcome to Volunteer Management System.</h1>
<h3>Volunteering is a great way to contribute to society.</h3>

    <form action="addAccount">
        Enter Your Name:<br><input type="text" name="usr_name"> <br>
        Enter Your Age:<br><input type="number" min="0" max="80" name="age"><br>
        Enter Your Mail:<br><input type="email" name="usr_mail"><br>
        Enter Your Password:<br><input type="password" name="pass"><br>
        <input type="submit" value="submit">
    </form>
</div>
</body>
</html>
