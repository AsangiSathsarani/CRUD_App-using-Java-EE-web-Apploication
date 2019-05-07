/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Asangi
 */
public class DBUtls {
    public static PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException{
        PreparedStatement ps = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:8080;databaseName=CRUD_News";
        String user = "sa";
        String pass = "123456789";
        
        Connection con = DriverManager.getConnection(url ,user ,pass);
        ps = con.prepareStatement(sql);
        return ps;
    }
    
    //Check Connection
    
//    public static void main(String[] args) throws ClassNotFoundException, SQLException{
//        getPreparedStatement("Select *form News");
//    }
    
}
