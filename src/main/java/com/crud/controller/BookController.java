package com.crud.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.entities.Book;
import com.lms.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController 
{
	@Autowired
	private BookService bookService;
	
    @GetMapping("/findall")
    public List<Book> getAllBooks() {
        return bookService.findAll();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id) {
        return bookService.findById(id);
    }
	
	
	
}
