/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboards;
import config.dbconn;
import config.session;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class changeemail extends javax.swing.JFrame {

    
    public changeemail() {
        initComponents();
    }
    private boolean emailExists(String email) {
    try {
        dbconn dc = new dbconn();
        String query = "SELECT COUNT(*) FROM tbl_users WHERE email = ?";
        PreparedStatement pstmt = dc.getConnection().prepareStatement(query);
        pstmt.setString(1, email);
        
        ResultSet rs = pstmt.executeQuery();
        
        if (rs.next()) {
            return rs.getInt(1) > 0;  // Returns true if the email exists
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}
    private boolean isEmailValid(String email) {
        // More robust regex (but still not perfect for all valid email addresses)
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        // Compile the regex pattern only ONCE (outside the function for efficiency)
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    
    
    Color orange = new Color(255,102,0);
     Color lightorange = new Color(255,204,102);
     Color white = new Color(255,255,255);
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        backg3 = new javax.swing.JPanel();
        update = new javax.swing.JButton();
        currentemail = new javax.swing.JTextField();
        lname = new javax.swing.JLabel();
        Fname = new javax.swing.JLabel();
        newemail = new javax.swing.JTextField();
        title2 = new javax.swing.JLabel();
        usertxt2 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        update1 = new javax.swing.JButton();

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
        backg3.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 120, 40));

        currentemail.setBackground(new java.awt.Color(255, 204, 102));
        currentemail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        currentemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        currentemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentemailActionPerformed(evt);
            }
        });
        backg3.add(currentemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 280, 40));

        lname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lname.setText("Current Email:");
        backg3.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 130, -1));

        Fname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Fname.setText("Current User ID:");
        backg3.add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 130, -1));

        newemail.setBackground(new java.awt.Color(255, 204, 102));
        newemail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        newemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        newemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newemailActionPerformed(evt);
            }
        });
        backg3.add(newemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 280, 40));

        title2.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("CHANGE EMAIL");
        backg3.add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 60));

        usertxt2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        usertxt2.setText("New Email:");
        backg3.add(usertxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 120, -1));

        id.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        backg3.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 280, 40));

        update1.setBackground(new java.awt.Color(255, 255, 255));
        update1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        update1.setText("BACK");
        update1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                update1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                update1MouseExited(evt);
            }
        });
        update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1ActionPerformed(evt);
            }
        });
        backg3.add(update1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 120, 40));

        jPanel2.add(backg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 460, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked

    // Retrieve the current and new emails from the fields
String currentEmailText = currentemail.getText().trim(); 
String newEmailText = newemail.getText().trim(); 

// Check if the fields are empty
if (currentEmailText.isEmpty() || newEmailText.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Both current and new email fields are required", "Missing Information", JOptionPane.WARNING_MESSAGE);
    return;
}

// Validate the new email format
if (!isEmailValid(newEmailText)) {
    JOptionPane.showMessageDialog(null, "Invalid email format", "Invalid Format", JOptionPane.WARNING_MESSAGE);
    return;
}

try {
    dbconn dc = new dbconn();
    Connection con = dc.getConnection();

    // Check if the current email exists in the database
    String checkCurrentEmailQuery = "SELECT email FROM tbl_users WHERE u_id = ?";
    PreparedStatement checkCurrentEmailStmt = con.prepareStatement(checkCurrentEmailQuery);
    checkCurrentEmailStmt.setString(1, id.getText()); 
    ResultSet rs = checkCurrentEmailStmt.executeQuery();

    if (rs.next()) {
        String actualCurrentEmail = rs.getString("email");

        // Verify if the entered current email matches the actual email
        if (!currentEmailText.equals(actualCurrentEmail)) {
            JOptionPane.showMessageDialog(null, "Incorrect current email!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    } else {
        JOptionPane.showMessageDialog(null, "User not found!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Check if the new email is already in use
    String checkNewEmailQuery = "SELECT COUNT(*) FROM tbl_users WHERE email = ?";
    PreparedStatement checkNewEmailStmt = con.prepareStatement(checkNewEmailQuery);
    checkNewEmailStmt.setString(1, newEmailText);
    ResultSet rsNewEmail = checkNewEmailStmt.executeQuery();
    
    if (rsNewEmail.next() && rsNewEmail.getInt(1) > 0) {
        JOptionPane.showMessageDialog(null, "This new email is already in use by another user", "Duplicate Email", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Proceed with updating the email in the database
    String updateQuery = "UPDATE tbl_users SET email = ? WHERE u_id = ?";
    PreparedStatement updateStmt = con.prepareStatement(updateQuery);
    updateStmt.setString(1, newEmailText);
    updateStmt.setString(2, id.getText());

    int rowsUpdated = updateStmt.executeUpdate();

    if (rowsUpdated > 0) {
        JOptionPane.showMessageDialog(null, "Email updated successfully!");

        // Update session email
        session sess = session.getInstance();
        sess.setEmail(newEmailText);

        // Refresh the user panel automatically
        Userinfo ap = new Userinfo(); 
        ap.setVisible(true);
        this.dispose(); // Close the current window

    } else {
        JOptionPane.showMessageDialog(null, "Email update failed. Please try again.", "Update Failed", JOptionPane.ERROR_MESSAGE);
    }

    // Close resources
    rs.close();
    rsNewEmail.close();
    checkCurrentEmailStmt.close();
    checkNewEmailStmt.close();
    updateStmt.close();
    con.close();

} catch (SQLException ex) {
    ex.printStackTrace();
    JOptionPane.showMessageDialog(null, "Error updating email: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
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

    private void currentemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentemailActionPerformed

    private void newemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newemailActionPerformed

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

    private void update1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update1MouseClicked
        Userinfo ui = new Userinfo();
        ui.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_update1MouseClicked

    private void update1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_update1MouseEntered

    private void update1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_update1MouseExited

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update1ActionPerformed

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
            java.util.logging.Logger.getLogger(changeemail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changeemail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changeemail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changeemail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changeemail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fname;
    private javax.swing.JPanel backg3;
    private javax.swing.JTextField currentemail;
    private javax.swing.JLabel id;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lname;
    private javax.swing.JTextField newemail;
    private javax.swing.JLabel title2;
    private javax.swing.JButton update;
    private javax.swing.JButton update1;
    private javax.swing.JLabel usertxt2;
    // End of variables declaration//GEN-END:variables
}
