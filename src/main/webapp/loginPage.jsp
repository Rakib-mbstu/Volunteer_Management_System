<%--
  Created by IntelliJ IDEA.
  User: dsi
  Date: 12/28/23
  Time: 6:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Volunteer Management System</title>
</head>
<body>
<div style="background-color: azure">
    <center>
        <h1>Welcome to Volunteer Management System</h1>
        <form action="login">
            Enter Mail:<br><input type="text" name="usr_mail"><br>
            Enter Password:<br><input type="text" name="usr_pass"><br>
            <input type="submit" value="Log in">
        </form>
<a href="forgotPass.jsp">Forgot Password?</a><br>

<a href="newAccount.jsp">Register</a>
    </center>
</div>
</body>
</html>
