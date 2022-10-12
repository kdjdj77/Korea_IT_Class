//댓글의 목록을 담기 위한 용도
package com.lec.spring.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class QryCommentList extends QryResult{
	@JsonProperty("data") //Json으로 매핑될 property name
	List<Comment> list; //목록데이터
}
