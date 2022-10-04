package com.lec.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lec.spring.domain.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}
