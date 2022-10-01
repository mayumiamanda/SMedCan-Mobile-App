package com.example.smedcan.data.model;
// Generated Aug 24, 2021 9:50:53 PM by Hibernate Tools 3.6.0



/**
 * Patients generated by hbm2java
 */
public class Patients  implements java.io.Serializable {


     private Integer idpatients;
     private String username;
     private String email;
     private String nic;
     private String description;
     private String tel;
     private String age;
     private String password;
     private String status;
    private String imgurl;

    public Patients() {
    }

    public Patients(String username, String email, String nic, String description, String tel, String age, String password, String status) {
       this.username = username;
       this.email = email;
       this.nic = nic;
       this.description = description;
       this.tel = tel;
       this.age = age;
       this.password = password;
       this.status = status;
    }
   
    public Integer getIdpatients() {
        return this.idpatients;
    }
    
    public void setIdpatients(Integer idpatients) {
        this.idpatients = idpatients;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNic() {
        return this.nic;
    }
    
    public void setNic(String nic) {
        this.nic = nic;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getTel() {
        return this.tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getAge() {
        return this.age;
    }
    
    public void setAge(String age) {
        this.age = age;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getImgurl() {
        return this.imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }


}

