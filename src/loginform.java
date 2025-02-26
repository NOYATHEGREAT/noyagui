import Dashboards.Adminpanel;
import config.dbconn;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import user.userDashboard;
public class loginform extends javax.swing.JFrame {

  
    public loginform() {
        initComponents();
    }
    static String status1;
    static String type1;
    
    public static boolean loginAccount(String username, String password){
        dbconn db = new dbconn();
        try{
            String query = "SELECT * FROM tbl_users WHERE username = '"+ username +"' AND pass = '"+password+"'";
            ResultSet resultSet = db.getData(query);
           
            if(resultSet.next()){
             
                status1 = resultSet.getString("status_1");
                type1 = resultSet.getString("type");
                 
                  return true;
            }else{
                return false;
            }
        }catch(SQLException e){
           
            return false;
        }
       
    }
    Color orange = new Color(255,204,102);
    Color lightorange = new Color(245,216,127);
    Color white = new Color(255,255,255);
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bodycolor = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        usertxt1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        passtxt1 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        bgorange = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        loginbtm1 = new javax.swing.JButton();
        createbtm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/small.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -30, 500, 640));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 610));

        bodycolor.setBackground(new java.awt.Color(255, 204, 102));
        bodycolor.setForeground(new java.awt.Color(255, 204, 102));
        bodycolor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title1.setFont(new java.awt.Font("Arial Black", 1, 30)); // NOI18N
        title1.setText("        BAYAD TA!");
        bodycolor.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 390, 60));

        usertxt1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        usertxt1.setText("USERNAME");
        bodycolor.add(usertxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 80, -1));

        username.setBackground(new java.awt.Color(255, 204, 102));
        username.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        bodycolor.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 280, 40));

        passtxt1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        passtxt1.setText("PASSWORD");
        bodycolor.add(passtxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 80, -1));

        pass.setBackground(new java.awt.Color(255, 204, 102));
        pass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        bodycolor.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 280, 40));

        bgorange.setBackground(new java.awt.Color(255, 102, 0));
        bgorange.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        header.setText("PAY SMARTER NOT HARDER!");
        bgorange.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 280, -1));

        loginbtm1.setBackground(new java.awt.Color(255, 255, 255));
        loginbtm1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loginbtm1.setText("LOGIN");
        loginbtm1.setBorder(null);
        loginbtm1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbtm1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginbtm1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginbtm1MouseExited(evt);
            }
        });
        loginbtm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtm1ActionPerformed(evt);
            }
        });
        bgorange.add(loginbtm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 140, 40));

        createbtm.setBackground(new java.awt.Color(255, 255, 255));
        createbtm.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        createbtm.setText("CREATE ACCOUNT");
        createbtm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createbtmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createbtmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createbtmMouseExited(evt);
            }
        });
        createbtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbtmActionPerformed(evt);
            }
        });
        bgorange.add(createbtm, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 220, -1));

        bodycolor.add(bgorange, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 390, 560));

        jPanel4.add(bodycolor, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 440, 610));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
    
    }//GEN-LAST:event_usernameActionPerformed
  
    private void createbtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtmActionPerformed
     registrationform rf = new registrationform(); 
     rf.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_createbtmActionPerformed

    private void createbtmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createbtmMouseEntered
        createbtm.setBackground(orange);
    }//GEN-LAST:event_createbtmMouseEntered

    private void createbtmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createbtmMouseExited
        createbtm.setBackground(white);
    }//GEN-LAST:event_createbtmMouseExited

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void loginbtm1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtm1MouseEntered
        loginbtm1.setBackground(orange);
    }//GEN-LAST:event_loginbtm1MouseEntered

    private void loginbtm1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtm1MouseExited
        loginbtm1.setBackground(white);
    }//GEN-LAST:event_loginbtm1MouseExited

    private void loginbtm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtm1ActionPerformed
       
    }//GEN-LAST:event_loginbtm1ActionPerformed

    private void createbtmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createbtmMouseClicked
        registrationform rf = new registrationform();
        rf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createbtmMouseClicked

    private void loginbtm1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtm1MouseClicked
   
                    if (username.getText().isEmpty() && pass.getText().isEmpty()) {
                 JOptionPane.showMessageDialog(null, "Please put username and password");
             } else if (username.getText().isEmpty()) {
                 JOptionPane.showMessageDialog(null, "Please enter your username.");
             } else if (pass.getText().isEmpty()) {
                 JOptionPane.showMessageDialog(null, "Please enter your password.");
             } else {


                 if (loginAccount(username.getText(), pass.getText())) {
                     System.out.println("Login successful in method!");
                     if (!status1.equals("Active")) {
                         JOptionPane.showMessageDialog(null, "Your account is not active, Please wait for a minutes.....");
                     } else {
                         JOptionPane.showMessageDialog(null, "Login successful!");
                         if (type1.equals("Admin")) {
                             Adminpanel ad = new Adminpanel();
                             ad.setVisible(true);
                             this.dispose();
                         } else if (type1.equals("User")) {
                             userDashboard ad = new userDashboard();
                             ad.setVisible(true);
                             this.dispose();
                         } else {
                             JOptionPane.showMessageDialog(null, "No account type found!");
                         }
                     }
                 } else {
                     JOptionPane.showMessageDialog(null, "Invalid Account, Please Register!", "Login Failed", JOptionPane.ERROR_MESSAGE);
                 }
             }

        
    }//GEN-LAST:event_loginbtm1MouseClicked

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
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgorange;
    private javax.swing.JPanel bodycolor;
    private javax.swing.JButton createbtm;
    private javax.swing.JLabel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton loginbtm1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel passtxt1;
    private javax.swing.JLabel title1;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usertxt1;
    // End of variables declaration//GEN-END:variables
}
