package Dashboards;

import Dashboards.loginform;
import config.dbconn;
import config.passwordHasher;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class registrationform extends javax.swing.JFrame {

   
     
    public registrationform() {
        initComponents();
    }
    public String question = "";
    public String answer = "";
    public String destination = "";
    public static String email1,username1;
    
     public boolean duplicateChecker() {
    dbconn db = new dbconn();
    boolean isDuplicate = false;

    try {
        String query = "SELECT username, email FROM tbl_users WHERE username = ? OR email = ?";
        PreparedStatement pstmt = db.getConnection().prepareStatement(query);
        pstmt.setString(1, username.getText());
        pstmt.setString(2, email.getText());
        ResultSet resultSet = pstmt.executeQuery();

        while (resultSet.next()) { // Iterate over result set
            String existingEmail = resultSet.getString("email");
            String existingUsername = resultSet.getString("username");

            if (existingEmail.equals(email.getText())) {
                JOptionPane.showMessageDialog(null, "Email is Already Used");
                email.setText("");
                isDuplicate = true;
            }
            if (existingUsername.equals(username.getText())) {
                JOptionPane.showMessageDialog(null, "Username is Already Used");
                username.setText("");
                isDuplicate = true;
            }
        }

        resultSet.close();
        pstmt.close();
    } catch (SQLException e) {
        System.out.println("Error: " + e.getMessage());
    }

    return isDuplicate;
}
    private boolean isEmailValid(String email) {
        // More robust regex (but still not perfect for all valid email addresses)
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        // Compile the regex pattern only ONCE (outside the function for efficiency)
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    Color orange = new Color(255,204,102);
    Color lightorange = new Color(245,216,127);
    Color white = new Color(255,255,255);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        backg3 = new javax.swing.JPanel();
        registerbtm4 = new javax.swing.JButton();
        cancelbtm = new javax.swing.JButton();
        lastname = new javax.swing.JTextField();
        lname = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        Fname = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        title2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        usertxt2 = new javax.swing.JLabel();
        emailtxt = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        phonenumtxt = new javax.swing.JLabel();
        ph = new javax.swing.JTextField();
        passtxt = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(860, 610));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backg3.setBackground(new java.awt.Color(255, 102, 0));
        backg3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registerbtm4.setBackground(new java.awt.Color(255, 255, 255));
        registerbtm4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        registerbtm4.setText("REGISTER");
        registerbtm4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerbtm4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerbtm4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerbtm4MouseExited(evt);
            }
        });
        registerbtm4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbtm4ActionPerformed(evt);
            }
        });
        backg3.add(registerbtm4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 590, 120, 40));

        cancelbtm.setBackground(new java.awt.Color(255, 255, 255));
        cancelbtm.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancelbtm.setText("CANCEL");
        cancelbtm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelbtmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelbtmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelbtmMouseExited(evt);
            }
        });
        cancelbtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtmActionPerformed(evt);
            }
        });
        backg3.add(cancelbtm, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, 130, 40));

        lastname.setBackground(new java.awt.Color(255, 204, 102));
        lastname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lastname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        backg3.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 280, 40));

        lname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lname.setText("LASTNAME");
        backg3.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 80, -1));

        fname.setBackground(new java.awt.Color(255, 204, 102));
        fname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        backg3.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 280, 40));

        Fname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Fname.setText("FIRST NAME");
        backg3.add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 110, -1));

        username.setBackground(new java.awt.Color(255, 204, 102));
        username.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        backg3.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 280, 40));

        title2.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        title2.setText("REGISTRATION FORM");
        backg3.add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 350, 60));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("TYPE");
        backg3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 130, 20));

        type.setBackground(new java.awt.Color(255, 204, 102));
        type.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT TYPE OF USER", "Admin", "User" }));
        type.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        backg3.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 280, 40));

        usertxt2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        usertxt2.setText("USERNAME");
        backg3.add(usertxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 80, -1));

        emailtxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        emailtxt.setText("EMAIL");
        backg3.add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 80, -1));

        email.setBackground(new java.awt.Color(255, 204, 102));
        email.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        backg3.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 280, 40));

        phonenumtxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        phonenumtxt.setText("PHONE NUMBER");
        backg3.add(phonenumtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 120, -1));

        ph.setBackground(new java.awt.Color(255, 204, 102));
        ph.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ph.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phActionPerformed(evt);
            }
        });
        backg3.add(ph, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 280, 40));

        passtxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        passtxt.setText("PASSWORD");
        backg3.add(passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        pass.setBackground(new java.awt.Color(255, 204, 102));
        pass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        backg3.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 280, 40));

        jPanel2.add(backg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 450, 730));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 1070, 950));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, -80, 960, 850));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void phActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void cancelbtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtmActionPerformed
        loginform lf = new loginform();
            lf.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_cancelbtmActionPerformed

    private void registerbtm4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbtm4ActionPerformed
                                           
    
    }//GEN-LAST:event_registerbtm4ActionPerformed

    private void registerbtm4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerbtm4MouseEntered
            registerbtm4.setBackground(orange);

    }//GEN-LAST:event_registerbtm4MouseEntered

    private void registerbtm4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerbtm4MouseExited
            registerbtm4.setBackground(white);

    }//GEN-LAST:event_registerbtm4MouseExited

    private void cancelbtmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtmMouseEntered
            cancelbtm.setBackground(orange);

    }//GEN-LAST:event_cancelbtmMouseEntered

    private void cancelbtmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtmMouseExited
            cancelbtm.setBackground(white);
    }//GEN-LAST:event_cancelbtmMouseExited

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void registerbtm4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerbtm4MouseClicked
     try{
        dbconn db = new dbconn();
         String pass1 = passwordHasher.hashPassword(pass.getText());
          
        if(username.getText().isEmpty() || fname.getText().isEmpty() || lastname.getText().isEmpty() || email.getText().isEmpty() || ph.getText().isEmpty() 
                || pass.getText().isEmpty()){
               JOptionPane.showMessageDialog(null, "All fields required");
        }else if(duplicateChecker()){
            System.out.println("Duplicates Existed");
               }
               
        else if(!isEmailValid(email.getText())){
            JOptionPane.showMessageDialog(null, "Invalid email format");
        }else if(!ph.getText().matches("\\d+")){
            JOptionPane.showMessageDialog(null, "Contact number must only contains digit");
        }else if(ph.getText().length() > 11){
            JOptionPane.showMessageDialog(null, "Contact number exceeded");
        }else if(pass.getText().length() < 8){
            JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long");
        }else if(type.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Please select a type of user");
        }
        else if (db.insertData("INSERT INTO tbl_users (f_name, last_name, username, email, phone_number, pass, type , status_1, question, answer, image) "
                + "VALUES ('"+fname.getText()+"', '"+lastname.getText()+"', '"+username.getText()+"', '"+email.getText()+"', "
                        + "'"+ph.getText()+"', '"+pass1+"','"+type.getSelectedItem()+"' ,'Pending', '"+question+"', '"+answer+"', '"+destination+"')") == 1){
            JOptionPane.showMessageDialog(null, "Submitted Successfully");
             loginform lf = new loginform();
            lf.setVisible(true);
            this.dispose();
        }
     }catch(NoSuchAlgorithmException e){
         System.out.println(""+e);
     }
        
        
    }//GEN-LAST:event_registerbtm4MouseClicked

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void cancelbtmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtmMouseClicked
        loginform lf = new loginform();
            lf.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_cancelbtmMouseClicked

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

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
            java.util.logging.Logger.getLogger(registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrationform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fname;
    private javax.swing.JPanel backg3;
    private javax.swing.JButton cancelbtm;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailtxt;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lastname;
    private javax.swing.JLabel lname;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel passtxt;
    private javax.swing.JTextField ph;
    private javax.swing.JLabel phonenumtxt;
    private javax.swing.JButton registerbtm4;
    private javax.swing.JLabel title2;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usertxt2;
    // End of variables declaration//GEN-END:variables
}
