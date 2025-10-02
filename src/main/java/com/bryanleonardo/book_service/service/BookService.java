package com.bryanleonardo.book_service.service;

import com.bryanleonardo.book_service.dto.BookRequest;
import com.bryanleonardo.book_service.model.Book;
import com.bryanleonardo.book_service.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository repo;

    public BookService(BookRepository repo) { this.repo = repo; }

    public Book addBook(BookRequest req) {
        Book book = new Book();
        book.setTitle(req.getTitle());
        book.setAuthor(req.getAuthor());
        return repo.save(book);
    }

    public List<Book> getAll() { return repo.findAll(); }

    public Book getById(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
    }

    public void delete(Long id) { repo.deleteById(id); }

    public Book borrow(Long id) {
        Book book = getById(id);
        if (book.isBorrowed()) throw new RuntimeException("Already borrowed");
        book.setBorrowed(true);
        return repo.save(book);
    }
}
