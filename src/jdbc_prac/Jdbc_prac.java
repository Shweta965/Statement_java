/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Shweta
 */
public class Jdbc_prac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        // simple jdbc coding
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/odbc_database", "root", "");
        Statement state = conn.createStatement();

        String str = "select * from school_record";
        // execute the query
        // add library
        ResultSet rs = state.executeQuery(str);

        while (rs != null) {
            while (rs.next()) {
                System.out.print(rs.getInt(1)+" ");
                System.out.print(rs.getString(2)+" ");
                System.out.print(rs.getString(3)+ " ");
                System.out.print(rs.getInt(4)+ " ");
                System.out.println(rs.getString(5)+ " ");
            }
        }
    }

}
