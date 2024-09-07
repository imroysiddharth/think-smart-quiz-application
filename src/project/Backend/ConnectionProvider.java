/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.backend;
import java.sql.*;

/**
 *
 * @author roysi
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
             String url = "jdbc:mysql://localhost:3306/quizApp";
            String username = "root";
            String paswd = "2003";
            Connection con  = DriverManager.getConnection(url,username,paswd);
            return con;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
}
