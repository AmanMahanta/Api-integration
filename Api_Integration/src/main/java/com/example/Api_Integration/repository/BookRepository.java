package com.example.Api_Integration.repository;

import com.example.Api_Integration.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
