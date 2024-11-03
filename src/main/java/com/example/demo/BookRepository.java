package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository provides built-in CRUD methods
public interface BookRepository extends JpaRepository<Book, Long> {
}
