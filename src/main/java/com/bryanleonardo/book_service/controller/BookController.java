package com.bryanleonardo.book_service.controller;

import com.bryanleonardo.book_service.dto.BookRequest;
import com.bryanleonardo.book_service.model.Book;
import com.bryanleonardo.book_service.service.BookService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    private final BookService service;

    public BookController(BookService service) { this.service = service; }

    @PostMapping
    public Book add(@Valid @RequestBody BookRequest req) { return service.addBook(req); }

    @GetMapping
    public List<Book> all() { return service.getAll(); }

    @GetMapping("/{id}")
    public Book one(@PathVariable Long id) { return service.getById(id); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }

    @PostMapping("/{id}/borrow")
    public Book borrow(@PathVariable Long id) { return service.borrow(id); }
}
