package com.lec.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lec.spring.domain.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
