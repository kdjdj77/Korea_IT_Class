package com.lec.beans;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WriteDTO {
	private int id;
	private String subject;
	private String content;
	private String name;
	private int viewCnt;
	private LocalDateTime regDate;
	
	public String getRegDateTime() {
		return this.regDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));
	}
}
