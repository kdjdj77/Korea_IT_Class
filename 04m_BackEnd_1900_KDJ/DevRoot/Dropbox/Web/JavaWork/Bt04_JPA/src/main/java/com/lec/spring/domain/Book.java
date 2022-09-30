package com.lec.spring.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

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
public class Book extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
    private String name;
    private String category;
    private Long authorId; // NULL 허용 -> Wrapper 사용
    private Long publisherId; // NULL 허용 -> Wrapper 사용
   
//  @Column(updatable = false)
//	@CreatedDate // AuditingEntityListener가 Listener로 적용시 사용
//	private LocalDateTime createdAt;
//	@LastModifiedDate // AuditingEntityListener가 Listener로 적용시 사용
//	private LocalDateTime updatedAt;
   
//    @PrePersist
//    public void prePersist() {
//        this.createdAt = LocalDateTime.now();
//        this.updatedAt = LocalDateTime.now();
//    }
//   
//    @PreUpdate
//    public void preUpdate() {
//        this.updatedAt = LocalDateTime.now();
//    }
} 
