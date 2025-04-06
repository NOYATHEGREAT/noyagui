/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboards;

import config.dbconn;
import config.session;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;


/**
 *
 * @author SCC-COLLEGE
 */
public class Userpanel extends javax.swing.JFrame {

    
    public Userpanel() {
        initComponents();
        displayUsers();
    }
     Color orange = new Color(255,102,0);
     Color lightorange = new Color(255,204,102);

    
    public void displayUsers() {
        try {
            dbconn db = new dbconn();
            ResultSet rs = db.getData(
                "SELECT u_id, f_name, last_name, username, email, phone_number, type, status_1 FROM tbl_users");
            tbl_users.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        addp = new javax.swing.JPanel();
        add = new javax.swing.JLabel();
        editp = new javax.swing.JPanel();
        edit = new javax.swing.JLabel();
        refp = new javax.swing.JPanel();
        delete = new javax.swing.JLabel();
        delp = new javax.swing.JPanel();
        delete1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        Fname3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_users = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        logpanel = new javax.swing.JPanel();
        logtxt = new javax.swing.JLabel();
        Fname1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 102, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addp.setBackground(new java.awt.Color(255, 102, 0));
        addp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addpMouseExited(evt);
            }
        });
        addp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        add.setText("         ADD");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        addp.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 170, 20));

        jPanel4.add(addp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 170, 60));

        editp.setBackground(new java.awt.Color(255, 102, 0));
        editp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editpMouseExited(evt);
            }
        });
        editp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        edit.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        edit.setText("         EDIT");
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });
        editp.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 170, 20));

        jPanel4.add(editp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 170, 60));

        refp.setBackground(new java.awt.Color(255, 102, 0));
        refp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refpMouseExited(evt);
            }
        });
        refp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        delete.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        delete.setText("     REFRESH");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        refp.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 170, -1));

        jPanel4.add(refp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 170, 60));

        delp.setBackground(new java.awt.Color(255, 102, 0));
        delp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delpMouseExited(evt);
            }
        });
        delp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        delete1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        delete1.setText("       DELETE");
        delete1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete1MouseClicked(evt);
            }
        });
        delp.add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 170, -1));

        jPanel4.add(delp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 170, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-user-50 (1).png"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 50, -1));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 130));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(" USER");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 150, -1));

        id.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id.setText(" ID");
        jPanel4.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 170, 30));

        Fname3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Fname3.setText("CURRENT ID:");
        jPanel4.add(Fname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 90, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 580));

        tbl_users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_users);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 680, 460));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logpanel.setBackground(new java.awt.Color(255, 102, 0));
        logpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logpanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logpanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logpanelMouseExited(evt);
            }
        });
        logpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logtxt.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        logtxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logtxt.setText("BACK");
        logtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logtxtMouseClicked(evt);
            }
        });
        logpanel.add(logtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 90, 20));

        jPanel2.add(logpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 140, 40));

        Fname1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Fname1.setText("USER ID");
        jPanel2.add(Fname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 60, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 680, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addpMouseEntered
    addp.setBackground(lightorange);
    }//GEN-LAST:event_addpMouseEntered

    private void logpanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logpanelMouseEntered
    logpanel.setBackground(lightorange);        
    }//GEN-LAST:event_logpanelMouseEntered

    private void logpanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logpanelMouseExited
    logpanel.setBackground(orange);
    }//GEN-LAST:event_logpanelMouseExited

    private void logtxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logtxtMouseClicked
       Adminpanel ap = new Adminpanel();
      ap.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_logtxtMouseClicked

    private void logpanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logpanelMouseClicked
      Adminpanel ap = new Adminpanel();
      ap.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_logpanelMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
      adduser au = new adduser();
      au.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_addMouseClicked

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
    int rowIndex = tbl_users.getSelectedRow();
     
     
      if(rowIndex < 0 ){
          JOptionPane.showMessageDialog(null, "Please select an item.", "Click a Item", JOptionPane.WARNING_MESSAGE);
      }else{
         
          try{
          dbconn db = new dbconn();
          TableModel tbl  = tbl_users.getModel();
        ResultSet rs = db.getData("SELECT * FROM tbl_users WHERE u_id = '" + tbl.getValueAt(rowIndex, 0) + "'");

          if(rs.next()){
               edituser uf = new edituser();
                 uf.u_id.setText(""+rs.getInt("u_id"));
                uf.username.setText(""+rs.getString("username"));
              uf.fname.setText(""+rs.getString("f_name"));
              uf.lastname.setText(""+rs.getString("last_name"));
               uf.email.setText(""+rs.getString("email"));
               uf.con.setText(""+rs.getString("phone_number"));
               uf.type.setSelectedItem(""+rs.getString("type"));
               uf.pass.setText(""+rs.getString("pass"));
                uf.status.setSelectedItem(""+rs.getString("status_1"));
                uf.image.setIcon(uf.ResizeImage(rs.getString("image"), null, uf.image));
                    uf.oldpath = rs.getString("image");
                    uf.path = rs.getString("image");
                    uf.destination = rs.getString("image");
                    
                if(rs.getString("image").isEmpty()){
                    uf.select.setEnabled(true);
                    uf.rm.setEnabled(false);
                }else{
                    uf.select.setEnabled(false);
                    uf.rm.setEnabled(true);
                }
                    uf.setVisible(true);
                    this.dispose();
          }
         }catch(SQLException e){
                       System.out.println(""+e.getMessage());
                  }
      }        
    }//GEN-LAST:event_editMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
      
    
    }//GEN-LAST:event_deleteMouseClicked

    private void delete1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete1MouseClicked
        int rowindex = tbl_users.getSelectedRow();
        if(rowindex < 0){
            JOptionPane.showMessageDialog(null, "Please Select an item!");
        } else {
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this user?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                dbconn dbc = new dbconn();
                TableModel model = tbl_users.getModel();
                String id = model.getValueAt(rowindex, 0).toString();
                dbc.updateData("DELETE FROM tbl_users WHERE u_id = '" + id + "'");
                session sess = session.getInstance();
                dbc.logActivity(sess.getId(), "Deleted user ID: " + id);
                displayUsers();
                JOptionPane.showMessageDialog(null, "User deleted successfully!");
            }
        }
    }//GEN-LAST:event_delete1MouseClicked

    private void addpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addpMouseExited
       addp.setBackground(orange);

    }//GEN-LAST:event_addpMouseExited

    private void delpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delpMouseEntered
        delp.setBackground(lightorange);
    }//GEN-LAST:event_delpMouseEntered

    private void delpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delpMouseExited
        delp.setBackground(orange);

    }//GEN-LAST:event_delpMouseExited

    private void editpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editpMouseEntered
       editp.setBackground(lightorange);
    }//GEN-LAST:event_editpMouseEntered

    private void editpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editpMouseExited
       editp.setBackground(orange);
    }//GEN-LAST:event_editpMouseExited

    private void refpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refpMouseEntered
       refp.setBackground(lightorange);

    }//GEN-LAST:event_refpMouseEntered

    private void refpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refpMouseExited
       refp.setBackground(orange);

    }//GEN-LAST:event_refpMouseExited

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       
    }//GEN-LAST:event_formMouseClicked

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
            java.util.logging.Logger.getLogger(Userpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Userpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Userpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Userpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Userpanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fname1;
    private javax.swing.JLabel Fname3;
    private javax.swing.JLabel add;
    private javax.swing.JPanel addp;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel delete1;
    private javax.swing.JPanel delp;
    private javax.swing.JLabel edit;
    private javax.swing.JPanel editp;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel logpanel;
    private javax.swing.JLabel logtxt;
    private javax.swing.JPanel refp;
    private javax.swing.JTable tbl_users;
    // End of variables declaration//GEN-END:variables
}
