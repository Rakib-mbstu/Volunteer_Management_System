package com.volunteer.volunteermanagementsystem;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
@WebServlet("/PasswordReset")
public class forgetPass extends HelloServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String usr_mail = request.getParameter("usr_mail");
        try {
            Class.forName("com.mysql.jdbc.Driver");
             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "Dsi", "1234");
            PreparedStatement preState = connection.prepareStatement("SELECT * from volunteerInfo where email=?");
            preState.setString(1,usr_mail);
            ResultSet rs = preState.executeQuery();
            if(rs.next())
            {
                try {
                    request.setAttribute("mail",usr_mail);
                    HttpSession session = request.getSession();
                    session.setAttribute("mail",usr_mail);
                    getServletContext().getRequestDispatcher("/reset.jsp").forward(request,response);
                } catch (ServletException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
