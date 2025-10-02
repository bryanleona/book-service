package com.bryanleonardo.book_service.repository;

import com.bryanleonardo.book_service.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {}
