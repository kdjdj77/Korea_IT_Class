package com.lec.spring.listener;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lec.spring.domain.User;
import com.lec.spring.domain.UserHistory;
import com.lec.spring.repository.UserHistoryRepository;
import com.lec.spring.support.BeanUtils;

//@Component // <- Listener에서는 스프링 주입 불가
public class UserEntityListener {
//	@Autowired // <- Listener에서는 스프링 주입 불가
	private UserHistoryRepository userHistoryRepository;
	@PrePersist // User가 INSERT 수행하기 전
	@PreUpdate // User가 UPDATE 수행하기 전
	public void preUpdateAndPrePersist(Object o) { // User Entity를 매개변수 받음
		System.out.println(">> UserEntityListener#preUpdate&prePersist");
		
		// Listener에서 스프링 빈 주입받기
		UserHistoryRepository userHistoryRepository
			= BeanUtils.getBean(UserHistoryRepository.class);
		
		User user = (User) o;
		UserHistory userHistory = new UserHistory();
		userHistory.setUserId(user.getId());
		userHistory.setName(user.getName());
		userHistory.setEmail(user.getEmail());
		
		// userHistoryRepository가 null이다
		// Entity Listener는 Spring Bean을 주입받지 못한다
		userHistoryRepository.save(userHistory); // INSERT
	}
}
