package com.lec.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lec.spring.domain.Write;

public interface WriteRepository extends JpaRepository<Write, Long> {

}
