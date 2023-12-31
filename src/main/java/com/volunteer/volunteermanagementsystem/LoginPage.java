package com.volunteer.volunteermanagementsystem;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
@WebServlet("/login")
public class LoginPage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String usr_mail = req.getParameter("usr_mail");
        String pass = req.getParameter("usr_pass");
        String assigned = null;
        String arr[] = new String[2];
        try {
            arr = loginDao.check(usr_mail,pass);
            assigned  = arr[0];
        } catch (Exception e) {
            System.out.println(e);
        }
        if(assigned.equals("batpar")==true)
        {
            System.out.println('1');
            resp.sendRedirect("loginPage.jsp");
        }
        else
        {
            req.setAttribute("assined", assigned);
            req.setAttribute("usr_name",arr[1]);
            getServletContext().getRequestDispatcher("/welcome.jsp").forward(req,resp);
        }
    }
}
