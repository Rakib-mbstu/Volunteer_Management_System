package com.volunteer.volunteermanagementsystem;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/reset")
public class resetPass extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "Dsi", "1234");
            HttpSession session = req.getSession();
            String mail = (String) session.getAttribute("mail");
            System.out.println(mail);
            String str = req.getParameter("pass");
            System.out.println(str);
            PreparedStatement prestate = connection.prepareStatement("update volunteerInfo set pass=? where email=?");
            prestate.setString(2,mail);
            prestate.setString(1,str);
            prestate.executeUpdate();
            resp.sendRedirect("loginPage.jsp");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
