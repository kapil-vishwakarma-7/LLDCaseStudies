package com.scaler.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String address;
    private String email;
    private String password;

    @OneToOne
    private Module course;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
