package com.example.config.entity;

import lombok.Data;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class people {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String name;
    private String Email;
    private String address;
    private String QQnum;
    private String tel;
    public Integer getId(){
        return Id;
    }
    public void setId(){
        this.Id=Id;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    public String getEmail(){
        return Email;
    }
    public void setEmail(){
        this.Email=Email;
    }
    public String getaddress(){
        return address;
    }
    public void setaddress(){
        this.address=address;
    }
    public String getQQnum(){
        return QQnum;
    }
    public void setQQnum(){
        this.QQnum=QQnum;
    }
    public String gettel(){
        return tel;
    }
    public void settel(){
        this.tel=tel;
    }
}
