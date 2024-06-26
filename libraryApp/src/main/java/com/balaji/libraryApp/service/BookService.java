package com.balaji.libraryApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.balaji.libraryApp.model.Book;

@Service
public interface BookService {
 public Book create(Book book);
public Book update(Book book);
 public List<Book> getBooks();
 public Book getBook(Integer id);
 public String delete(Integer id);

    
}




