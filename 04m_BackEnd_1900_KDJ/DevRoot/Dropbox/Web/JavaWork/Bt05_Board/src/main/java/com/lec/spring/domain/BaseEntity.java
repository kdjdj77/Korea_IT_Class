package com.lec.spring.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Data
@MappedSuperclass   // <-  이 클래스의 속성을 상속 받는 Entity 쪽에 포함시켜 줌.
@EntityListeners(value = AuditingEntityListener.class)
public class BaseEntity {

	@CreatedDate   // Entity 생성시점의 시간 입력
	private LocalDateTime regDate;
	
	// String 으로 리턴하는 getter
	public String getRegDateTime() {
		if(this.regDate == null) return "";
		return this.regDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));		
	}	
}



