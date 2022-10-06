package com.lec.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lec.spring.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
