package com.example.Api_Integration.service;

import com.example.Api_Integration.dto.BookRequest;
import com.example.Api_Integration.exception.ResourceNotFoundException;
import com.example.Api_Integration.model.Book;
import com.example.Api_Integration.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository repo;

    public BookServiceImpl(BookRepository repo){
        this.repo = repo;
    }

    @Override
    public List<Book> getAll() {
        return repo.findAll();
    }

    @Override
    public Book getById(Long id) {
        return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Book not found with id" + id));

    }

    @Override
    public Book create(BookRequest request) {
        Book book = new Book(request.getTitle(),request.getAuthor());
        return repo.save(book);
    }

    @Override
    public Book update(Long id, BookRequest request) {
        Book existing = getById(id);
        existing.setTitle(request.getTitle());
        existing.setAuthor(request.getAuthor());
        return repo.save(existing);
    }

    @Override
    public void delete(Long id) {
        Book existing = getById(id);
        repo.delete(existing);
    }
}
