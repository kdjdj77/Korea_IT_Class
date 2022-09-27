package com.lec.spring.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name="t6_write")
public class Write {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AI
	private Long id;		// 글의 id(PK)
	
	private String subject;	// 글의 제목
	private String content;	// 글 내용
	private String name;	// 작성자명
	@ColumnDefault(value = "0")
	private int viewCnt;	// 글 조회수
	
	private LocalDateTime regDate; // 글 작성일시
	
	public String getRegDateTime() {
		if(this.regDate == null) return "";
		return this.regDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));		
	}	
}
