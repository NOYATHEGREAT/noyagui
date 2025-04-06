package user;
import Dashboards.*;
import config.dbconn;
import config.passwordHasher;
import config.session;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class changepassword extends javax.swing.JFrame {

   
    public changepassword() {
        initComponents();
    }
    

     Color orange = new Color(255,102,0);
     Color lightorange = new Color(255,204,102);
     Color white = new Color(255,255,255);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        backg3 = new javax.swing.JPanel();
        update = new javax.swing.JButton();
        cpass = new javax.swing.JTextField();
        lname = new javax.swing.JLabel();
        Fname = new javax.swing.JLabel();
        npass = new javax.swing.JTextField();
        title2 = new javax.swing.JLabel();
        usertxt2 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        changepass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backg3.setBackground(new java.awt.Color(255, 102, 0));
        backg3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        update.setText("UPDATE");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        backg3.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 120, 40));

        cpass.setBackground(new java.awt.Color(255, 204, 102));
        cpass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        cpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpassActionPerformed(evt);
            }
        });
        backg3.add(cpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 280, 40));

        lname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lname.setText("CURRENT PASS");
        backg3.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 110, -1));

        Fname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Fname.setText("CURRENT USER ID");
        backg3.add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 130, -1));

        npass.setBackground(new java.awt.Color(255, 204, 102));
        npass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        npass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        npass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                npassActionPerformed(evt);
            }
        });
        backg3.add(npass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 280, 40));

        title2.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("CHANGE PASSWORD");
        backg3.add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 60));

        usertxt2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        usertxt2.setText("NEWPASSWORD");
        backg3.add(usertxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 120, -1));

        id.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        backg3.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 280, 40));

        changepass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        changepass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changepass.setText("Add Security Question? Click here");
        changepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changepassMouseClicked(evt);
            }
        });
        backg3.add(changepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 240, 29));

        jPanel2.add(backg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 460, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
            try {
        
        String currentPassText = cpass.getText();  
        String newPassText = npass.getText();     
        
        
        if (currentPassText.isEmpty() || newPassText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "All Fields Required!", "Missing Information", JOptionPane.WARNING_MESSAGE);
            return;
        }

       
        if (newPassText.length() < 8) {
            JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long!", "Invalid Password", JOptionPane.WARNING_MESSAGE);
            return;
        }

        dbconn dc = new dbconn();
        Connection con = dc.getConnection();

        
        String fetchQuery = "SELECT pass FROM tbl_users WHERE u_id = ?";
        PreparedStatement fetchStmt = con.prepareStatement(fetchQuery);
        fetchStmt.setInt(1, session.getInstance().getId()); 
        ResultSet rs = fetchStmt.executeQuery();

       
        if (rs.next()) {
            String actualCurrentPass = rs.getString("pass");

           
            if (!passwordHasher.checkPassword(currentPassText, actualCurrentPass)) {
                JOptionPane.showMessageDialog(null, "Incorrect Current Password!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null, "User not found!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

       
        String hashedNewPass = passwordHasher.hashPassword(newPassText);

       
        String updateQuery = "UPDATE tbl_users SET pass = ? WHERE u_id = ?";
        PreparedStatement updateStmt = con.prepareStatement(updateQuery);
        updateStmt.setString(1, hashedNewPass);  
        updateStmt.setInt(2, session.getInstance().getId());  

      
        int updatedRows = updateStmt.executeUpdate();
        if (updatedRows > 0) {
            JOptionPane.showMessageDialog(null, "Password updated successfully!");

            
            session sess = session.getInstance();
            sess.setPass(hashedNewPass);

           
            fetchStmt = con.prepareStatement("SELECT * FROM tbl_users WHERE u_id = ?");
            fetchStmt.setInt(1, session.getInstance().getId());
            rs = fetchStmt.executeQuery();

            if (rs.next()) {
                
                sess.setFname(rs.getString("f_name"));
                sess.setLname(rs.getString("last_name"));
                sess.setEmail(rs.getString("email"));
                sess.setUname(rs.getString("username"));
                sess.setType(rs.getString("type"));
                sess.setStatus(rs.getString("status_1"));
                sess.setContact(rs.getString("phone_number"));
            }

          
            Userinfo as = new Userinfo();
            as.setVisible(true);
            this.dispose();  
        } else {
            JOptionPane.showMessageDialog(null, "Failed to update password!", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Close resources
        updateStmt.close();
        fetchStmt.close();
        con.close();

    } catch (SQLException | NoSuchAlgorithmException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error updating password!", "Error", JOptionPane.ERROR_MESSAGE);
    }

        
    }//GEN-LAST:event_updateMouseClicked

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBackground(lightorange);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
       update.setBackground(white);
    }//GEN-LAST:event_updateMouseExited

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

    }//GEN-LAST:event_updateActionPerformed

    private void cpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpassActionPerformed

    private void npassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_npassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_npassActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        session sess = session.getInstance();
       if(sess.getId()== 0){
       JOptionPane.showMessageDialog(null,"No Account, Log in First");
       loginform Adminpanel = new loginform();
       Adminpanel.setVisible(true);
       this.dispose();
       }else{
           
            id.setText(""+sess.getId());
       }
    }//GEN-LAST:event_formWindowActivated

    private void changepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepassMouseClicked
        SecurityQ sq = new SecurityQ();
        sq.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_changepassMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(changepassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changepassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changepassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changepassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changepassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fname;
    private javax.swing.JPanel backg3;
    private javax.swing.JLabel changepass;
    private javax.swing.JTextField cpass;
    private javax.swing.JLabel id;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lname;
    private javax.swing.JTextField npass;
    private javax.swing.JLabel title2;
    private javax.swing.JButton update;
    private javax.swing.JLabel usertxt2;
    // End of variables declaration//GEN-END:variables
}
