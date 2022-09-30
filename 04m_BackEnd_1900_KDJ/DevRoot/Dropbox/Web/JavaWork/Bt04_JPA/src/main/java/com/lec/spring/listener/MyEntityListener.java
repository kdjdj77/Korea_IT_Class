package com.lec.spring.listener;

import java.time.LocalDateTime;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

// Entity가 아닌 객체임에도 @PrePersist와 @PreUpdate 지정
public class MyEntityListener {
	@PrePersist
	public void prePersist(Object o) { //반드시 Object매개변수 필요
		System.out.println(">> MyEntityListener#prePersist");
		if (o instanceof Auditable) {
			((Auditable) o).setCreatedAt(LocalDateTime.now());
			((Auditable) o).setUpdatedAt(LocalDateTime.now());
		}
	}
	@PreUpdate
	public void preUpdate(Object o) { //반드시 Object매개변수 필요
		System.out.println(">> MyEntityListener#preUpdate");
		if (o instanceof Auditable) {
			((Auditable) o).setUpdatedAt(LocalDateTime.now());
		}
	}
}
