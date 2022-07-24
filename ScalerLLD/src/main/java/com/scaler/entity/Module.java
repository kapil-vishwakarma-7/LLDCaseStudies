package com.scaler.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Module {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Date startDate;
    private Date endDate;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
