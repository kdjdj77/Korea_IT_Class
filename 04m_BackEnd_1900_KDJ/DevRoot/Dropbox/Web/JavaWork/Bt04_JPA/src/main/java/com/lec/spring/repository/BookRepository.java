package com.lec.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lec.spring.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
