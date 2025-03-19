/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboards;
import java.awt.Color;


public class changeemail extends javax.swing.JFrame {

    
    public changeemail() {
        initComponents();
    }
    Color orange = new Color(255,102,0);
     Color lightorange = new Color(255,204,102);
     Color white = new Color(255,255,255);
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        backg3 = new javax.swing.JPanel();
        enter = new javax.swing.JButton();
        email = new javax.swing.JTextField();
        lname = new javax.swing.JLabel();
        userid = new javax.swing.JTextField();
        Fname = new javax.swing.JLabel();
        nemail = new javax.swing.JTextField();
        title2 = new javax.swing.JLabel();
        usertxt2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backg3.setBackground(new java.awt.Color(255, 102, 0));
        backg3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enter.setBackground(new java.awt.Color(255, 255, 255));
        enter.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        enter.setText("ENTER");
        enter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enterMouseExited(evt);
            }
        });
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });
        backg3.add(enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 120, 40));

        email.setBackground(new java.awt.Color(255, 204, 102));
        email.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        backg3.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 280, 40));

        lname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lname.setText("CURRENT EMAIL");
        backg3.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 130, -1));

        userid.setBackground(new java.awt.Color(255, 204, 102));
        userid.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        userid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        userid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridActionPerformed(evt);
            }
        });
        backg3.add(userid, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 280, 40));

        Fname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Fname.setText("CURRENT USER ID");
        backg3.add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 130, -1));

        nemail.setBackground(new java.awt.Color(255, 204, 102));
        nemail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        nemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nemailActionPerformed(evt);
            }
        });
        backg3.add(nemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 280, 40));

        title2.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("CHANGE EMAIL");
        backg3.add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 60));

        usertxt2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        usertxt2.setText("NEW EMAIL");
        backg3.add(usertxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 120, -1));

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

    private void enterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterMouseClicked

    }//GEN-LAST:event_enterMouseClicked

    private void enterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterMouseEntered
        enter.setBackground(lightorange);
    }//GEN-LAST:event_enterMouseEntered

    private void enterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterMouseExited
        enter.setBackground(white);
    }//GEN-LAST:event_enterMouseExited

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed

    }//GEN-LAST:event_enterActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void useridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useridActionPerformed

    private void nemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nemailActionPerformed

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
    private javax.swing.JTextField email;
    private javax.swing.JButton enter;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lname;
    private javax.swing.JTextField nemail;
    private javax.swing.JLabel title2;
    private javax.swing.JTextField userid;
    private javax.swing.JLabel usertxt2;
    // End of variables declaration//GEN-END:variables
}
