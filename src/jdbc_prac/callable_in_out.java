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
import java.sql.Types;

/**
 *
 * @author Shweta
 */
public class callable_in_out {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/odbc_database", "root", "");
        CallableStatement cs = conn.prepareCall("{call procedure_out(?,?,?)}");
        cs.setInt(1, 2);
        cs.registerOutParameter(2, Types.VARCHAR);
        cs.registerOutParameter(3, Types.VARCHAR);
        
        cs.execute();
        
        System.out.println(cs.getString(2));
        System.out.println(cs.getString(3));

    }

}
