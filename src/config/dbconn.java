/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class dbconn {
    
    
       private Connection connect;

       // constructor to connect to our database
        public dbconn(){
            try{
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/billpayments", "root", "");
            }catch(SQLException ex){
                    System.out.println("Can't connect to database: "+ex.getMessage());
            }
        }
      public int insertData(String sql){
            int result;
            try{
                PreparedStatement pst = connect.prepareStatement(sql);
                pst.executeUpdate();
                System.out.println("Inserted Successfully!");
                pst.close();
                result =1;
            }catch(SQLException ex){
                System.out.println("Connection Error: "+ex);
                result =0;
            }
            return result;
        }
       public Connection getConnection(){
       return connect;
       
       }
       
        public void updateData(String sql){
            try{
                PreparedStatement pst = connect.prepareStatement(sql);
                    int rowsUpdated = pst.executeUpdate();
                        if(rowsUpdated > 0){
                            JOptionPane.showMessageDialog(null, "Data Updated Successfully!");
                        }else{
                            System.out.println("Data Update Failed!");
                        }
                        pst.close();
            }catch(SQLException ex){
                System.out.println("Connection Error: "+ex);
            }
        }
   
        public ResultSet getData(String sql) throws SQLException{
            Statement stmt = connect.createStatement();
            ResultSet rst = stmt.executeQuery(sql);
            return rst;
        }
                            // Function to log user activity
        public void logActivity(int userId, String action) {
            String query = "INSERT INTO tbl_logs (log_uid, log_action) VALUES (?, ?)";
            try (PreparedStatement pstmt = connect.prepareStatement(query)) {
                pstmt.setInt(1, userId);
                pstmt.setString(2, action);
                pstmt.executeUpdate();
                System.out.println("Activity logged: " + action);
            } catch (SQLException e) {
                System.out.println("Error logging activity: " + e.getMessage());
            }
        }
        
        public ResultSet getLogs() throws SQLException {
            String query = "SELECT l.log_id, u.username, l.log_action, l.log_timestamp FROM tbl_logs l " +
                           "JOIN tbl_users u ON l.log_uid = u.u_id " +
                           "ORDER BY l.log_timestamp DESC";
            return getData(query);
        }
      

}

