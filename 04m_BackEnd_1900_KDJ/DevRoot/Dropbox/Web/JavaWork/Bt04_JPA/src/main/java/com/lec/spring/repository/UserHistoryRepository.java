package com.lec.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lec.spring.domain.UserHistory;


public interface UserHistoryRepository extends JpaRepository<UserHistory, Long> {
	List<UserHistory> findByUserId(Long userId);
}
