package com.lec.spring.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Entity
public class Users {
	// 엔티티로 사용하려면 primary key가 반드시 필요
	@Id // PK
	@GeneratedValue // AI
	private Long id;
	@NonNull
	private String name;
	@NonNull
	private String email;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
}
