package com.balaji.libraryApp.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.balaji.libraryApp.model.Book;
import com.balaji.libraryApp.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;
 
    @GetMapping("/all")
     public List<Book> getBooks(){
        return bookService.getBooks();
     }
    @GetMapping("/{id}")
    public Book getBook(@PathVariable Integer id){
      
        return bookService.getBook(id);
    }


    
    @PutMapping("/update")
    public Book updateBook(@RequestBody Book book){
        return bookService.update(book);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable Integer id){
        return bookService.delete(id);
    }

    @PostMapping("/store")
       public Book saveStudent(@RequestBody Book book){
    
        return bookService.create(book);
    
       } 





}





