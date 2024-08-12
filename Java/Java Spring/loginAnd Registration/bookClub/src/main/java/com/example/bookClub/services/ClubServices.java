package com.example.bookClub.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookclub.bookclub.models.Book;
import com.bookclub.bookclub.repositories.BookRepository;

@Service
public class ClubServices {
    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
    
    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }
}
