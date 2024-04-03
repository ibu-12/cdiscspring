package com.example.cdisc.Model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data

@Entity
@NoArgsConstructor
public class User {
    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name="phone_number")
    private long phonenumber;
    @Column(name="customer_email")
    private String email;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private int age;
    public User(int phonenumber, String email, String name, int age) {
        this.phonenumber = phonenumber;
        this.email = email;
        this.name = name;
        this.age = age;
    }

    

    public long getphonenumber() {
        return phonenumber;
    }
    public void setphonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}

