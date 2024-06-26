package com.balaji.libraryApp.service.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balaji.libraryApp.model.Book;
import com.balaji.libraryApp.repository.BookRepository;
import com.balaji.libraryApp.service.BookService;

@Service
public class BookServiceb  implements BookService{
    @Autowired
    BookRepository bookRepository;
   
    @Override
    public Book create(Book book){
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getBooks(){
        return bookRepository.findAll();
    }
   
    @Override
    public Book getBook(Integer id){
        return bookRepository.findById(id).get();
    }
   
    @Override
    public Book update(Book book){
        return bookRepository.save(book);
    }
    @Override
    public String delete(Integer id){
        bookRepository.deleteById(id);
        return "deleted memeber row id is "+id;
    }
}



