package com.balaji.libraryApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balaji.libraryApp.model.Book;

public interface BookRepository extends JpaRepository <Book,Integer> {
    
}
