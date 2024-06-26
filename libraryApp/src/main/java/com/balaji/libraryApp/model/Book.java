package com.balaji.libraryApp.model;

import java.util.Date;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Book {
    
    @Id
    private Integer id;
    private String title;
    private String author;
    //book number 
    private String isbn;
    private  Date publishDate;

}
