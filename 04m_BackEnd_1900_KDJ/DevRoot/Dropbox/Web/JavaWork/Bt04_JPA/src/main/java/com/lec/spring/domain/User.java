package com.lec.spring.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

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
// 이 객체가 JPA 에서 관리하는 Entity 객체임을 정의
@Entity  // javax.persistence.Entity  (name= 실제로 생성될 테이블명)
@Table(name="users"  // 이 이름으로 물리적인 테이즐 생성
	, indexes = {@Index(columnList = "name")}  // 컬럼에 대한 index 생성
	, uniqueConstraints = {@UniqueConstraint(columnNames = {"email"})}  // unique 제약사항
)
@EntityListeners(value = MyEntityListener.class)
public class User {
	// 엔티티로 사용하려면 primary key가 반드시 필요
	@Id // PK. Entity는 PK가 반드시 필요 없다
	@GeneratedValue // AI
	private Long id;
	@NonNull
	private String name;
	@NonNull
	@Column(unique = true)
	private String email;
//	@Column(updatable = false)
	private LocalDateTime createdAt;
//	@Column(insertable = false)
	private LocalDateTime updatedAt;
//	@OneToMany(fetch = FetchType.EAGER)
//	private List<Address> address;
//	@Transient // db에 반영하지 않는 필드
//	private String testData;
	
	@Enumerated(value = EnumType.STRING)
	private Gender gender;
	
//	@PrePersist
//	public void prePersist() {
//	    System.out.println(">>> prePersist");
//	    this.createdAt = LocalDateTime.now();
//	    this.updatedAt = LocalDateTime.now();
//	}
//	@PreUpdate
//	public void preUpdate() {
//	    System.out.println(">>> preUpdate");
//	    this.updatedAt = LocalDateTime.now();
//	}
//	@PreRemove
//	public void preRemove() {
//	    System.out.println(">>> preRemove");
//	}
//	@PostPersist
//	public void postPersist() {
//	    System.out.println(">>> postPersist");
//	}
//	@PostUpdate
//	public void postUpdate() {
//	    System.out.println(">>> postUpdate");
//	}
//	@PostRemove
//	public void postRemove() {
//	    System.out.println(">>> postRemove");
//	}
//	
//	public void postLoad() {
//	    System.out.println(">>> postLoad");
//	}
}
