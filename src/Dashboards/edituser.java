
package Dashboards;
import config.dbconn;
import config.passwordHasher;
import config.session;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class edituser extends javax.swing.JFrame {

    
    public edituser() {
        initComponents();
    }
        public String destination = "";
    File selectedFile;
    public String oldpath;
    public String path;
    public String question = "";
    public String answer = "";

    public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();

        Path filePath = Paths.get("src/userImages", fileName);
        boolean fileExists = Files.exists(filePath);

        if (fileExists) {
            return 1;
        } else {
            return 0;
        }

    }
    
    public static int getHeightFromWidth(String imagePath, int desiredWidth) {
    try {
        // Read the image file
        File imageFile = new File(imagePath);
        BufferedImage image = ImageIO.read(imageFile);

        // Get the original width and height of the image
        int originalWidth = image.getWidth();
        int originalHeight = image.getHeight();

        // Calculate the new height based on the desired width and the aspect ratio
        int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);

        return newHeight;
    } catch (IOException ex) {
        System.out.println("No image found!");
    }

    return -1;
    }
    
    public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}
    
    public void imageUpdater(String existingFilePath, String newFilePath){
    File existingFile = new File(existingFilePath);
    if (existingFile.exists()) {
        String parentDirectory = existingFile.getParent();
        File newFile = new File(newFilePath);
        String newFileName = newFile.getName();
        File updatedFile = new File(parentDirectory, newFileName);
        existingFile.delete();
        try {
            Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Image updated successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred while updating the image: "+e);
        }
    } else {
        try{
            Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
        }catch(IOException e){
            System.out.println("Error on update!");
        }
    }
   }
    
     private boolean isEmailValid(String email) {
        // More robust regex (but still not perfect for all valid email addresses)
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        // Compile the regex pattern only ONCE (outside the function for efficiency)
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
     public static String email1;
     
     public boolean updatechecker(){
        dbconn db = new dbconn();
        try{
        String query = "SELECT * FROM tbl_users WHERE (email = '"+email.getText()+"') AND u_id != '"+u_id.getText()+"'";
        ResultSet resultSet = db.getData(query);
       
       
        if (resultSet.next()) { // Check if any record exists
            email1 = resultSet.getString("email");
        if(email1.equals(email.getText())){
             JOptionPane.showMessageDialog(null, "Email is Already Used");
             email.setText("");
        }
         return true;  
        }else{
            return false;
        }
        }catch(SQLException e){
            System.out.println(""+e.getMessage());
            return false;
        }
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

        jPanel2 = new javax.swing.JPanel();
        backg3 = new javax.swing.JPanel();
        updatebtm = new javax.swing.JButton();
        cancelbtm = new javax.swing.JButton();
        lastname = new javax.swing.JTextField();
        lname = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        Fname = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        title2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        usertxt2 = new javax.swing.JLabel();
        emailtxt = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        phonenumtxt = new javax.swing.JLabel();
        con = new javax.swing.JTextField();
        passtxt = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        cpasstxt = new javax.swing.JLabel();
        u_id = new javax.swing.JTextField();
        Fname1 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        Fname2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        select = new javax.swing.JButton();
        rm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backg3.setBackground(new java.awt.Color(255, 102, 0));
        backg3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updatebtm.setBackground(new java.awt.Color(255, 255, 255));
        updatebtm.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        updatebtm.setText("UPDATE");
        updatebtm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatebtmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updatebtmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updatebtmMouseExited(evt);
            }
        });
        updatebtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtmActionPerformed(evt);
            }
        });
        backg3.add(updatebtm, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 730, 120, 40));

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
        backg3.add(cancelbtm, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 730, 130, 40));

        lastname.setBackground(new java.awt.Color(255, 204, 102));
        lastname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lastname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lastname.setEnabled(false);
        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        backg3.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 280, 40));

        lname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lname.setText("LASTNAME");
        backg3.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 80, -1));

        fname.setBackground(new java.awt.Color(255, 204, 102));
        fname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        fname.setEnabled(false);
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        backg3.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 280, 40));

        Fname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Fname.setText("FIRST NAME");
        backg3.add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 110, -1));

        username.setBackground(new java.awt.Color(255, 204, 102));
        username.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        username.setEnabled(false);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        backg3.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 280, 40));

        title2.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        title2.setText("EDIT USER FORM");
        backg3.add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 260, 60));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("TYPE");
        backg3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 650, 130, 20));

        status.setBackground(new java.awt.Color(255, 204, 102));
        status.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT  STATUS", "Active", "Pending" }));
        status.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        backg3.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, 280, 40));

        usertxt2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        usertxt2.setText("USERNAME");
        backg3.add(usertxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 80, -1));

        emailtxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        emailtxt.setText("EMAIL");
        backg3.add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 80, -1));

        email.setBackground(new java.awt.Color(255, 204, 102));
        email.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        backg3.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 280, 40));

        phonenumtxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        phonenumtxt.setText("PHONE NUMBER");
        backg3.add(phonenumtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 120, -1));

        con.setBackground(new java.awt.Color(255, 204, 102));
        con.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        con.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conActionPerformed(evt);
            }
        });
        backg3.add(con, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 280, 40));

        passtxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        passtxt.setText("PASSWORD");
        backg3.add(passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, -1, -1));

        pass.setBackground(new java.awt.Color(255, 204, 102));
        pass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        backg3.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 280, 40));

        cpasstxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cpasstxt.setText("STATUS");
        backg3.add(cpasstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, 160, -1));

        u_id.setBackground(new java.awt.Color(255, 204, 102));
        u_id.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        u_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        u_id.setEnabled(false);
        u_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_idActionPerformed(evt);
            }
        });
        backg3.add(u_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 280, 40));

        Fname1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Fname1.setText("USER ID");
        backg3.add(Fname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 110, -1));

        type.setBackground(new java.awt.Color(255, 204, 102));
        type.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT TYPE OF USER", "Admin", "User" }));
        type.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        backg3.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 670, 280, 40));

        Fname2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Fname2.setText("Upload your picture");
        backg3.add(Fname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 150, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 300, 240));

        backg3.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 320, 270));

        select.setText("SELECT");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        backg3.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 80, 40));

        rm.setText("REMOVE");
        rm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmActionPerformed(evt);
            }
        });
        backg3.add(rm, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 80, 40));

        jPanel2.add(backg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 820, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updatebtmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatebtmMouseClicked
try{
        dbconn db = new dbconn();
        String pass1 = passwordHasher.hashPassword(pass.getText());
        if(username.getText().isEmpty() || fname.getText().isEmpty() || lastname.getText().isEmpty() || email.getText().isEmpty() || con.getText().isEmpty()
            || pass.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields required");
        }else if(updatechecker()){
            System.out.println("Duplicates Existed");
        }

        else if(!isEmailValid(email.getText())){
            JOptionPane.showMessageDialog(null, "Invalid email format");
        }else if(!con.getText().matches("\\d+")){
            JOptionPane.showMessageDialog(null, "Contact number must only contains digit");
        }else if(con.getText().length() > 11){
            JOptionPane.showMessageDialog(null, "Contact number exceeded");
        }else if(pass.getText().length() < 8){
            JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long");
        }else if(type.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Please select a type of user");
        }
        else{
            db.insertData("UPDATE tbl_users SET f_name = '"+fname.getText()+"', last_name = '"+lastname.getText()+"', "
                    + "username = '"+username.getText()+"', email = '"+email.getText()+"',  "
                    + "phone_number = '"+con.getText()+"', pass ='"+pass1+"', type = '"+type.getSelectedItem()+"' , "
                            + "status_1 = '"+status.getSelectedItem()+"', question = '"+question+"', answer = '"+answer+"', image = '"+destination+"' WHERE u_id = '"+u_id.getText()+"'");
            session sess = session.getInstance();
            db.logActivity(sess.getId(), "Updated a user: " + username.getText());
            JOptionPane.showMessageDialog(null, "Account Updated Successfully!"); 
            
            if(destination.isEmpty()){
                File existingFile = new File(oldpath);
                if(existingFile.exists()){
                    existingFile.delete();
                }
            }else{
                if(!(oldpath.equals(path))){    
                    imageUpdater(oldpath, path);
                }
            }
            Userinfo uf = new Userinfo();
            uf.setVisible(true);
            this.dispose();
        }
}catch(NoSuchAlgorithmException e){
    
}   
    }//GEN-LAST:event_updatebtmMouseClicked

    private void updatebtmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatebtmMouseEntered
        updatebtm.setBackground(orange);
    }//GEN-LAST:event_updatebtmMouseEntered

    private void updatebtmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatebtmMouseExited
        updatebtm.setBackground(white);
    }//GEN-LAST:event_updatebtmMouseExited

    private void updatebtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtmActionPerformed

    }//GEN-LAST:event_updatebtmActionPerformed

    private void cancelbtmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtmMouseClicked
       Userpanel up = new Userpanel();
       up.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_cancelbtmMouseClicked

    private void cancelbtmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtmMouseEntered
        cancelbtm.setBackground(orange);
    }//GEN-LAST:event_cancelbtmMouseEntered

    private void cancelbtmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtmMouseExited
        cancelbtm.setBackground(white);
    }//GEN-LAST:event_cancelbtmMouseExited

    private void cancelbtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtmActionPerformed
      Userpanel up = new Userpanel();
      up.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_cancelbtmActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void conActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void u_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u_idActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                selectedFile = fileChooser.getSelectedFile();
                destination = "src/userImages/" + selectedFile.getName();
                path  = selectedFile.getAbsolutePath();

                if(FileExistenceChecker(path) == 1){
                    JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                    destination = "";
                    path="";
                }else{
                    image.setIcon(ResizeImage(path, null, image));
                    select.setEnabled(true);
                    rm.setEnabled(false);
                }
            } catch (Exception ex) {
                System.out.println("File Error!");
            }
        }
    }//GEN-LAST:event_selectActionPerformed

    private void rmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmActionPerformed
        select.setEnabled(true);
        rm.setEnabled(false);
        image.setIcon(null);
        destination = "";
        path = "";
    }//GEN-LAST:event_rmActionPerformed

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
            java.util.logging.Logger.getLogger(edituser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edituser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edituser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edituser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edituser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fname;
    private javax.swing.JLabel Fname1;
    private javax.swing.JLabel Fname2;
    private javax.swing.JPanel backg3;
    private javax.swing.JButton cancelbtm;
    public javax.swing.JTextField con;
    private javax.swing.JLabel cpasstxt;
    public javax.swing.JTextField email;
    private javax.swing.JLabel emailtxt;
    public javax.swing.JTextField fname;
    public javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField lastname;
    private javax.swing.JLabel lname;
    public javax.swing.JPasswordField pass;
    private javax.swing.JLabel passtxt;
    private javax.swing.JLabel phonenumtxt;
    public javax.swing.JButton rm;
    public javax.swing.JButton select;
    public javax.swing.JComboBox<String> status;
    private javax.swing.JLabel title2;
    public javax.swing.JComboBox<String> type;
    public javax.swing.JTextField u_id;
    private javax.swing.JButton updatebtm;
    public javax.swing.JTextField username;
    private javax.swing.JLabel usertxt2;
    // End of variables declaration//GEN-END:variables
}
