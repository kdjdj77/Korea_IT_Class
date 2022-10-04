package com.lec.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lec.spring.domain.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
