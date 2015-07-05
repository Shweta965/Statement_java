/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Shweta
 */
public class PrepareState_java {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/odbc_database", "root", "");
        // This is fast, here is the precompiled query.
        // query is compiled before statement
        String str = "insert into school_record values(?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(str);
        ps.setInt(1, 4);
        ps.setString(2, "sam");
        ps.setString(3, "hayward");
        ps.setInt(4, 1237);
        ps.setString(5, "ca");
        int i = ps.executeUpdate();
        System.out.println("first table update" + i);

        ps.setInt(1, 3);
        ps.setString(2, "ami");
        ps.setString(3, "hayward");
        ps.setInt(4, 1637);
        ps.setString(5, "ca");
        int j = ps.executeUpdate();
        System.out.println("values of second column"+j);
    }

}
