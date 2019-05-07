/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBUtls;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.News;

/**
 *
 * @author Asangi
 */
public class DataAccess {
   
        public void addNew(News n) throws ClassNotFoundException, SQLException{
            try{
                PreparedStatement ps = DBUtls.getPreparedStatement("insert into News values(? ,? ,? ,? ,? ,? )");
                ps.setString(1, n.getTitle());
                ps.setString(2, n.getDate());
                ps.setString(3, n.getDescription());
                ps.setString(4, n.getDetail());
                ps.setString(5, n.getCategory());
                ps.setString(6, n.getImage());
                ps.executeUpdate();
            }catch(ClassNotFoundException | SQLException ex){
                Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE , null , ex);
            }
                
        }
        public static List<News> getAll(){
            List<News> ls = new LinkedList<>();
            try{
            
            
                ResultSet rs = DBUtls.getPreparedStatement("Select *from News").executeQuery();
                while(rs.next()){
                    News n = new News(rs.getInt(1) ,rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                }
            }catch(ClassNotFoundException | SQLException ex){
                Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE , null , ex);
            }
            return ls;
        }
        
        public static List<News> getNewByI(int id){
           List<News> ls = new LinkedList<>();
           String sql = "Select * from News where id = "+id;
            try{
            
            
                ResultSet rs = DBUtls.getPreparedStatement("Select *from News").executeQuery();
                while(rs.next()){
                    News n = new News(rs.getInt(1) ,rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                }
            }catch(ClassNotFoundException | SQLException ex){
                Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE , null , ex);
            }
            return ls; 
        }
        
        public void edit(int id ,String title , String description ,String detail , String category , String image){
            String sql = "Update News set title =?,description =? ,detail =? ,category =? , image =?" + "where id =?";
            PreparedStatement ps ;
            try{
                ps = DBUtls.getPreparedStatement(sql);
                ps.setString(1, title);
                ps.setString(2, description);
                ps.setString(3, detail);
                ps.setString(4, category);
                ps.setString(5, image);
                ps.setInt(6, id);
                ps.executeUpdate();
                
            }catch(ClassNotFoundException | SQLException ex){
                Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE , null , ex);
            }
        }
        public void delete(int id){
            try{
                String sql = "delete News where id  =?";
                PreparedStatement ps = DBUtls.getPreparedStatement(sql);
                ps.setInt(1, id);
                ps.executeUpdate();
            }catch(ClassNotFoundException | SQLException ex){
                Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE , null , ex);
            }
            
        }
            
}
