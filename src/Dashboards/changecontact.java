/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboards;
import config.dbconn;
import config.session;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class changecontact extends javax.swing.JFrame {

    
    public changecontact() {
        initComponents();
    }
    private boolean phoneExists(String phoneNumber) {
    boolean exists = false;
    try {
        dbconn dc = new dbconn();
        String query = "SELECT * FROM tbl_users WHERE phone_number = ?";
        PreparedStatement pstmt = dc.getConnection().prepareStatement(query);
        pstmt.setString(1, phoneNumber);
        
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            exists = true;  // Phone number exists in the database
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return exists;
}
         Color white = new Color(255,255,255);
         Color orange = new Color(255,102,0);
         Color lightorange = new Color(255,204,102);
     
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        backg3 = new javax.swing.JPanel();
        update = new javax.swing.JButton();
        cnum = new javax.swing.JTextField();
        lname = new javax.swing.JLabel();
        Fname = new javax.swing.JLabel();
        nnum = new javax.swing.JTextField();
        title2 = new javax.swing.JLabel();
        usertxt2 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();

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

        cnum.setBackground(new java.awt.Color(255, 204, 102));
        cnum.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cnum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        cnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnumActionPerformed(evt);
            }
        });
        backg3.add(cnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 280, 40));

        lname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lname.setText("CURRENT #");
        backg3.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 110, -1));

        Fname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Fname.setText("CURRENT USER ID");
        backg3.add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 130, -1));

        nnum.setBackground(new java.awt.Color(255, 204, 102));
        nnum.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nnum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        nnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nnumActionPerformed(evt);
            }
        });
        backg3.add(nnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 280, 40));

        title2.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("CHANGE CONTACT");
        backg3.add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 60));

        usertxt2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        usertxt2.setText("NEW CONTACT");
        backg3.add(usertxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 120, -1));

        id.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        backg3.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 280, 40));

        jPanel2.add(backg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 460, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked

       // Retrieve the current and new phone numbers from the fields
String currentPhoneText = cnum.getText();  // 'cnum' is the field for the current phone number
String newPhoneText = nnum.getText();      // 'nnum' is the field for the new phone number

// Validate that the current phone number and new phone number are not empty
if (currentPhoneText.isEmpty() || newPhoneText.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Both current and new phone numbers are required.");
    return;
}

// Validate the new phone number (should only contain digits and be within a reasonable length)
if (!newPhoneText.matches("\\d+")) {
    JOptionPane.showMessageDialog(null, "Phone number must only contain digits.");
    return;
}

if (newPhoneText.length() > 15 || newPhoneText.length() < 10) {
    JOptionPane.showMessageDialog(null, "Phone number must be between 10 to 15 digits long.");
    return;
}

// Check if the current phone number exists in the database (you can implement this as per your logic)
if (!phoneExists(currentPhoneText)) {
    JOptionPane.showMessageDialog(null, "The current phone number does not exist in the database.");
    return;
}

// Proceed with updating the phone number in the database
try {
    dbconn dc = new dbconn();
    String query = "UPDATE tbl_users SET phone_number = ? WHERE u_id = ?"; // 'u_id' used as the primary key

    PreparedStatement pstmt = dc.getConnection().prepareStatement(query);
    pstmt.setString(1, newPhoneText);  // Set the new phone number
    pstmt.setString(2, id.getText());  // Use session ID to identify the logged-in user

    // Execute the update
    int rowsUpdated = pstmt.executeUpdate();

    // Check if the update was successful
    if (rowsUpdated > 0) {
        // Update session phone number if necessary
        session sess = session.getInstance();  // Get session instance
        sess.setContact(newPhoneText);  // Assuming your session class has a method to set the phone number

        JOptionPane.showMessageDialog(null, "Phone number updated successfully!");

        // Refresh the user panel automatically
        Userinfo ap = new Userinfo();  // Create the Userinfo instance
        ap.setVisible(true);  // Make Userinfo visible
        this.dispose();  // Close the current window
    } else {
        JOptionPane.showMessageDialog(null, "Phone number update failed. Please try again.");
    }

} catch (Exception e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(null, "Error updating phone number: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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

    private void cnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnumActionPerformed

    private void nnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nnumActionPerformed

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
            java.util.logging.Logger.getLogger(changecontact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changecontact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changecontact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changecontact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changecontact().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fname;
    private javax.swing.JPanel backg3;
    private javax.swing.JTextField cnum;
    private javax.swing.JLabel id;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lname;
    private javax.swing.JTextField nnum;
    private javax.swing.JLabel title2;
    private javax.swing.JButton update;
    private javax.swing.JLabel usertxt2;
    // End of variables declaration//GEN-END:variables
}
