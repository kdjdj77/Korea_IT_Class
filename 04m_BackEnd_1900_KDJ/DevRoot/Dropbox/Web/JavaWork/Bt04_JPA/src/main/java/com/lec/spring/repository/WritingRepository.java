package com.lec.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lec.spring.domain.Writing;

public interface WritingRepository extends JpaRepository<Writing, Long> {
	
}
