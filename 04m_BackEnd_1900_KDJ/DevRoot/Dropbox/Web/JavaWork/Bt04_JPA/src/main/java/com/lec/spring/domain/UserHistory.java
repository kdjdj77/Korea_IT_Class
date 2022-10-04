package com.lec.spring.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.lec.spring.listener.Auditable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true) // 상속받은 createdAt, updatedAt 출력을 위해
@EqualsAndHashCode(callSuper = true)
@Entity
//@EntityListeners(value = AuditingEntityListener.class)
public class UserHistory extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
//	@Column(name = "user_id", insertable = false, updatable = false)
//	private Long userId;
	private String name;
	private String email;
	@ManyToOne
//	@ToString.Exclude
	private User user;
//	@Column(updatable = false)
//	@CreatedDate // AuditingEntityListener가 Listener로 적용시 사용
//	private LocalDateTime createdAt;
//	@LastModifiedDate // AuditingEntityListener가 Listener로 적용시 사용
//	private LocalDateTime updatedAt;
}
