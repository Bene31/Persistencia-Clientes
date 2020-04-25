/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @christien rachid
 */
public class ConectionFactory {

    public Connection conecta() {

        try {
            
    return DriverManager.getConnection("jdbc:mysql://localhost:3307/prova","root","");
    //return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:unimed", "system", "sys");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);

        }

    }

}
