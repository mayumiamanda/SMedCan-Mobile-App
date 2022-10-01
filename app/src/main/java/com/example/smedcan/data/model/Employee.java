package com.example.smedcan.data.model;
// Generated Aug 24, 2021 9:50:53 PM by Hibernate Tools 3.6.0



/**
 * Employee generated by hbm2java
 */
public class Employee  implements java.io.Serializable {


     private Integer eid;
     private String firstName;
     private String lastName;
     private String gender;
     private int contact;
     private String email;
     private String jobRole;
     private String username;
     private String password;
     private String confirmPassword;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String gender, int contact, String email, String jobRole, String username, String password, String confirmPassword) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.gender = gender;
       this.contact = contact;
       this.email = email;
       this.jobRole = jobRole;
       this.username = username;
       this.password = password;
       this.confirmPassword = confirmPassword;
    }
   
    public Integer getEid() {
        return this.eid;
    }
    
    public void setEid(Integer eid) {
        this.eid = eid;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getContact() {
        return this.contact;
    }
    
    public void setContact(int contact) {
        this.contact = contact;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getJobRole() {
        return this.jobRole;
    }
    
    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getConfirmPassword() {
        return this.confirmPassword;
    }
    
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }




}


