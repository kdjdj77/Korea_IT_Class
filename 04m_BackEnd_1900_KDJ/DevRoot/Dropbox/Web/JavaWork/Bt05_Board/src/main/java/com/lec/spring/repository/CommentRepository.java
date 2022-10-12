package com.lec.spring.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lec.spring.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
	List<Comment> findByWrite(Long write, Sort sort);
}
