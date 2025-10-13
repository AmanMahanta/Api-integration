package com.example.Api_Integration.service;
import com.example.Api_Integration.dto.BookRequest;
import com.example.Api_Integration.model.Book;

import java.util.List;
public interface BookService {
    List<Book> getAll();
    Book getById(Long id);
    Book create(BookRequest request);
    Book update(Long id,BookRequest request);
    void delete(Long id);
}

