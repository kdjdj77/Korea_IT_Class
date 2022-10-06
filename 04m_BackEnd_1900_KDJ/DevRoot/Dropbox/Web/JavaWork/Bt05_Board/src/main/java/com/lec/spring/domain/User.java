package com.lec.spring.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode(callSuper = true)
@Entity(name="t6_user")
public class User extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true, nullable = false)
	private String username; // 회원 아이디
	@Column(nullable = false)
	private String password; // 회원 비밀번호
	@Column(nullable = false)
	private String name; // 회원 이름
	@ManyToMany(fetch = FetchType.EAGER)
	@ToString.Exclude
	@Builder.Default
	private List<Authority> authorities = new ArrayList<>(); // NPE 방지
	
	public void addAuthority(Authority...authorities) {
		if (authorities != null) {
			Collections.addAll(this.authorities, authorities);
		}
	}

}
