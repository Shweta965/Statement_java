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

/**
 *
 * @author Shweta
 */
public class callable_in_jdbc {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/odbc_database", "root", "");
        CallableStatement cs = conn.prepareCall("{call procedure_callable(?,?,?,?)}");
  // Here always it will call procedure so that statement for the sql query can be accessed from procedure
        // now to insert paramenter.
        cs.setInt(1, 3);
        cs.setString(2, "enrique");
        cs.setString(3, "new york");
        cs.setString(4, "united States");
       int k = cs.executeUpdate();
        if(k>0){
            System.out.println("successfull");  
        }

    }
}
