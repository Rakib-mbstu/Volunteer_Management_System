package com.volunteer.volunteermanagementsystem;

import javax.xml.crypto.dsig.spec.XPathType;
import java.sql.*;
import java.util.logging.Filter;

public class loginDao{
    public static String[] check(String usr_mail,String Pass) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "Dsi", "1234");
        PreparedStatement preState = connection.prepareStatement("select * from volunteerInfo where email=? and pass=?");
        preState.setString(1,usr_mail);
        preState.setString(2,Pass);
        ResultSet rs = preState.executeQuery();
        if(rs.next())
        {
            return new String[]{rs.getString(5), rs.getString(3)};
        }
        return new String[]{"batpar", ""};
    }

}
