package com.balaji.libraryApp.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Member {
    @Id
    private Integer id;
    private String name;
    private String email;
    private Date membershipDate;

    
}
