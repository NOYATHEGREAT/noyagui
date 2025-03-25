/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboards;

import config.dbconn;
import javax.swing.JOptionPane;
import java.awt.Color;
/**
 *
 * @author SCC-COLLEGE
 */
public class Adminsettings extends javax.swing.JFrame {

    /**
     * Creates new form Adminsettings
     */
    public Adminsettings() {
        initComponents();
    }
    
    Color orange = new Color(255,204,102);
    Color lightorange = new Color(245,216,127);
    Color white = new Color(255,255,255);
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        backg3 = new javax.swing.JPanel();
        create = new javax.swing.JButton();
        cancelbtm = new javax.swing.JButton();
        lastname1 = new javax.swing.JTextField();
        lname = new javax.swing.JLabel();
        fname1 = new javax.swing.JTextField();
        Fname = new javax.swing.JLabel();
        username1 = new javax.swing.JTextField();
        title2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        type1 = new javax.swing.JComboBox<>();
        usertxt2 = new javax.swing.JLabel();
        emailtxt = new javax.swing.JLabel();
        email1 = new javax.swing.JTextField();
        phonenumtxt = new javax.swing.JLabel();
        ph1 = new javax.swing.JTextField();
        passtxt = new javax.swing.JLabel();
        pass1 = new javax.swing.JPasswordField();
        uid = new javax.swing.JTextField();
        Fname1 = new javax.swing.JLabel();
        type2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backg3.setBackground(new java.awt.Color(255, 102, 0));
        backg3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        create.setBackground(new java.awt.Color(255, 255, 255));
        create.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        create.setText("CREATE");
        create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createMouseExited(evt);
            }
        });
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        backg3.add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 710, 130, 40));

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
        backg3.add(cancelbtm, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 710, 130, 40));

        lastname1.setBackground(new java.awt.Color(255, 204, 102));
        lastname1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lastname1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lastname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastname1ActionPerformed(evt);
            }
        });
        backg3.add(lastname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 280, 40));

        lname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lname.setText("LASTNAME");
        backg3.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 80, -1));

        fname1.setBackground(new java.awt.Color(255, 204, 102));
        fname1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fname1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        fname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fname1ActionPerformed(evt);
            }
        });
        backg3.add(fname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 280, 40));

        Fname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Fname.setText("FIRST NAME");
        backg3.add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 110, -1));

        username1.setBackground(new java.awt.Color(255, 204, 102));
        username1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        username1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        username1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username1ActionPerformed(evt);
            }
        });
        backg3.add(username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 280, 40));

        title2.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("CREATE NEW USER");
        backg3.add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 340, 60));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("TYPE");
        backg3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, 130, 20));

        type1.setBackground(new java.awt.Color(255, 204, 102));
        type1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        type1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT TYPE OF USER", "Admin", "User" }));
        type1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        type1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type1ActionPerformed(evt);
            }
        });
        backg3.add(type1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 570, 280, 40));

        usertxt2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        usertxt2.setText("USERNAME");
        backg3.add(usertxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 80, -1));

        emailtxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        emailtxt.setText("EMAIL");
        backg3.add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 80, -1));

        email1.setBackground(new java.awt.Color(255, 204, 102));
        email1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        email1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        email1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email1ActionPerformed(evt);
            }
        });
        backg3.add(email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 280, 40));

        phonenumtxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        phonenumtxt.setText("PHONE NUMBER");
        backg3.add(phonenumtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 120, -1));

        ph1.setBackground(new java.awt.Color(255, 204, 102));
        ph1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ph1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ph1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ph1ActionPerformed(evt);
            }
        });
        backg3.add(ph1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 280, 40));

        passtxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        passtxt.setText("PASSWORD");
        backg3.add(passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, -1, -1));

        pass1.setBackground(new java.awt.Color(255, 204, 102));
        pass1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pass1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass1ActionPerformed(evt);
            }
        });
        backg3.add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 280, 40));

        uid.setBackground(new java.awt.Color(255, 204, 102));
        uid.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        uid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        uid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uidActionPerformed(evt);
            }
        });
        backg3.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 280, 40));

        Fname1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Fname1.setText("USER ID");
        backg3.add(Fname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 110, -1));

        type2.setBackground(new java.awt.Color(255, 204, 102));
        type2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        type2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT STATUS", "Active", "Pending" }));
        type2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        type2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type2ActionPerformed(evt);
            }
        });
        backg3.add(type2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 640, 280, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("STATUS");
        backg3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 620, 130, 20));

        jPanel2.add(backg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 610, 780));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(240, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(480, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseClicked


    }//GEN-LAST:event_createMouseClicked

    private void createMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseEntered
        create.setBackground(orange);
    }//GEN-LAST:event_createMouseEntered

    private void createMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseExited
        create.setBackground(white);
    }//GEN-LAST:event_createMouseExited

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed

    }//GEN-LAST:event_createActionPerformed

    private void cancelbtmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtmMouseClicked
        loginform lf = new loginform();
        lf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelbtmMouseClicked

    private void cancelbtmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtmMouseEntered
        cancelbtm.setBackground(orange);
    }//GEN-LAST:event_cancelbtmMouseEntered

    private void cancelbtmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtmMouseExited
        cancelbtm.setBackground(white);
    }//GEN-LAST:event_cancelbtmMouseExited

    private void cancelbtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtmActionPerformed
        loginform lf = new loginform();
        lf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelbtmActionPerformed

    private void lastname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastname1ActionPerformed

    private void fname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fname1ActionPerformed

    private void username1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username1ActionPerformed

    private void type1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_type1ActionPerformed

    private void email1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email1ActionPerformed

    private void ph1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ph1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ph1ActionPerformed

    private void pass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass1ActionPerformed

    private void uidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uidActionPerformed

    private void type2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_type2ActionPerformed

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
            java.util.logging.Logger.getLogger(Adminsettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adminsettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adminsettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adminsettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adminsettings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fname;
    private javax.swing.JLabel Fname1;
    private javax.swing.JPanel backg3;
    private javax.swing.JButton cancelbtm;
    private javax.swing.JButton create;
    private javax.swing.JTextField email1;
    private javax.swing.JLabel emailtxt;
    private javax.swing.JTextField fname1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lastname1;
    private javax.swing.JLabel lname;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JLabel passtxt;
    private javax.swing.JTextField ph1;
    private javax.swing.JLabel phonenumtxt;
    private javax.swing.JLabel title2;
    private javax.swing.JComboBox<String> type1;
    private javax.swing.JComboBox<String> type2;
    private javax.swing.JTextField uid;
    private javax.swing.JTextField username1;
    private javax.swing.JLabel usertxt2;
    // End of variables declaration//GEN-END:variables
}
