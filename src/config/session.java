/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author SCC-COLLEGE
 */
public class session {
    private static session instance;
    private int id;
    private String fname;
    private String lname;
    private String email;

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    private String uname;
    private String type;
    private String pass;
    private String status;
    private String image;
    private String contact;
    private session(){
    //private cons pevents intance
    }

    public static synchronized session getInstance(){
      if(instance == null){
         instance = new session();
      }
      return instance;
    }
    
    
    public static boolean isinstanceEmpty(){
      return instance == null;
    }
    
    
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

   

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public String getStatus() {
        return status;
    } 

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
}
