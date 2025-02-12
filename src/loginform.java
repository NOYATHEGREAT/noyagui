import java.awt.Color;
import javax.swing.JOptionPane;
public class loginform extends javax.swing.JFrame {

  
    public loginform() {
        initComponents();
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
        header = new javax.swing.JLabel();
        usertxt1 = new javax.swing.JLabel();
        userfield1 = new javax.swing.JTextField();
        passtxt1 = new javax.swing.JLabel();
        passfield1 = new javax.swing.JPasswordField();
        exitbtm = new javax.swing.JButton();
        createbtm = new javax.swing.JButton();
        loginbtm1 = new javax.swing.JButton();

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

        title1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        title1.setText("BILLS PAYMENT SYSTEM");
        bodycolor.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 380, 60));

        header.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        header.setText("PAY YOUR BILLS ON TIME!");
        bodycolor.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 260, -1));

        usertxt1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        usertxt1.setText("USERNAME");
        bodycolor.add(usertxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 80, -1));

        userfield1.setBackground(new java.awt.Color(255, 204, 102));
        userfield1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        userfield1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        userfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userfield1ActionPerformed(evt);
            }
        });
        bodycolor.add(userfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 280, 40));

        passtxt1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        passtxt1.setText("PASSWORD");
        bodycolor.add(passtxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 80, -1));

        passfield1.setBackground(new java.awt.Color(255, 204, 102));
        passfield1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        passfield1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        passfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passfield1ActionPerformed(evt);
            }
        });
        bodycolor.add(passfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 280, 40));

        exitbtm.setBackground(new java.awt.Color(255, 255, 255));
        exitbtm.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        exitbtm.setText("EXIT");
        exitbtm.setBorder(null);
        exitbtm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitbtmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitbtmMouseExited(evt);
            }
        });
        exitbtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtmActionPerformed(evt);
            }
        });
        bodycolor.add(exitbtm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 140, 40));

        createbtm.setBackground(new java.awt.Color(255, 255, 255));
        createbtm.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        createbtm.setText("CREATE ACCOUNT");
        createbtm.addMouseListener(new java.awt.event.MouseAdapter() {
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
        bodycolor.add(createbtm, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 230, 40));

        loginbtm1.setBackground(new java.awt.Color(255, 255, 255));
        loginbtm1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loginbtm1.setText("LOGIN");
        loginbtm1.setBorder(null);
        loginbtm1.addMouseListener(new java.awt.event.MouseAdapter() {
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
        bodycolor.add(loginbtm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 140, 40));

        jPanel4.add(bodycolor, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 440, 610));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userfield1ActionPerformed
    
    }//GEN-LAST:event_userfield1ActionPerformed
  
    private void exitbtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtmActionPerformed
        System.exit(0);
                                         
    
    
    }//GEN-LAST:event_exitbtmActionPerformed

    private void exitbtmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbtmMouseExited
        exitbtm.setBackground(white);
    }//GEN-LAST:event_exitbtmMouseExited

    private void exitbtmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbtmMouseEntered
        exitbtm.setBackground(orange);
    }//GEN-LAST:event_exitbtmMouseEntered

    private void createbtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtmActionPerformed
     new registrationform().setVisible(true);     
    }//GEN-LAST:event_createbtmActionPerformed

    private void createbtmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createbtmMouseEntered
        createbtm.setBackground(orange);
    }//GEN-LAST:event_createbtmMouseEntered

    private void createbtmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createbtmMouseExited
        createbtm.setBackground(white);
    }//GEN-LAST:event_createbtmMouseExited

    private void passfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passfield1ActionPerformed

    private void loginbtm1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtm1MouseEntered
        loginbtm1.setBackground(orange);
    }//GEN-LAST:event_loginbtm1MouseEntered

    private void loginbtm1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtm1MouseExited
        loginbtm1.setBackground(white);
    }//GEN-LAST:event_loginbtm1MouseExited

    private void loginbtm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtm1ActionPerformed
        String username = userfield1.getText();
    String password = passfield1.getText();

    if (username.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Username and password are required or or Create account if needed.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }         
    }//GEN-LAST:event_loginbtm1ActionPerformed

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
    private javax.swing.JPanel bodycolor;
    private javax.swing.JButton createbtm;
    private javax.swing.JButton exitbtm;
    private javax.swing.JLabel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton loginbtm1;
    private javax.swing.JPasswordField passfield1;
    private javax.swing.JLabel passtxt1;
    private javax.swing.JLabel title1;
    private javax.swing.JTextField userfield1;
    private javax.swing.JLabel usertxt1;
    // End of variables declaration//GEN-END:variables
}
