package com.volunteer.volunteermanagementsystem;

import com.mysql.jdbc.Driver;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/addAccount")
public class AddAccount  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String usr_name = req.getParameter("usr_name");
        Integer age = Integer.valueOf(req.getParameter("age"));
        String email = req.getParameter("usr_mail");
        String pass = req.getParameter("pass");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "Dsi", "1234");
            PreparedStatement statement = connection.prepareStatement("SELECT * from volunteerInfo where volunteerInfo.email=?");
            statement.setString(1,email);
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next())
            {
                resp.sendRedirect("loginPage.jsp");
            }
            PreparedStatement preState = connection.prepareStatement("Insert Into volunteerInfo VALUES (?,?,?,?,?)");
            preState.setString(3, usr_name);
            preState.setInt(4, age);
            preState.setString(1, email);
            preState.setString(2, pass);
            preState.setString(5,"");
            preState.execute();
            resp.sendRedirect("success.jsp");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
