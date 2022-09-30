package com.lec.spring.domain;

import java.time.LocalDateTime;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.lec.spring.listener.Auditable;

import lombok.Data;

@Data
@MappedSuperclass // <- 이 클래스의 속성을 상속받는 쪽에 포함시킨다
@EntityListeners(value = AuditingEntityListener.class)
public class BaseEntity implements Auditable {
	@CreatedDate
	private LocalDateTime createdAt;
	@LastModifiedDate
	private LocalDateTime updatedAt;
}
