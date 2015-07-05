/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Shweta
 */
public class statement_delete_rec {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/odbc_database", "root", "");
        Statement state = conn.createStatement();
        // update records  for  cities as San francisco for all those having state as california 
        String str = "Truncate school_record ";
        int res = state.executeUpdate(str);
        // res>0 represent that record is successfully updates
        if (res > 0) {
            System.out.println("record deleted successfully");
        }
    }

}
