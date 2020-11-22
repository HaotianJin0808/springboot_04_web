package com.example.config.pojo;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Communication {

    public Communication(Integer Id,String name,String Email,String address,String QQnum,String tel) {
        this.Id=Id;
        this.name = name;
        this.address=address;
        this.Email=Email;
        this.QQnum=QQnum;
        this.tel=tel;
    }
    private Integer Id;
    private String name;
    private String Email;
    private String address;
    private String QQnum;
    private String tel;

}
