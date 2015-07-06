/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_prac;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Shweta
 */
public class callable_update {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/odbc_database", "root", "");
        CallableStatement cs = conn.prepareCall("{call update_procedure(?,?)}");

        cs.setInt(1, 2);
        cs.setInt(2, 94542);

        int k = cs.executeUpdate();
        // if we want to insert less record in the table  
        if (k > 0) {
            System.out.println("successfull");
        }

    }
}
