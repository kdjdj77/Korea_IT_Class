package com.lec.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lec.spring.domain.User;

//Repository 생성
//JpaRepository<Entity타입, Id타입> 상속 ← 바로 이게 Spring Data JPA 가 지원해주는 영역!
//상속받은 것만으로도 많은 JPA 메소드를 편리하게 사용 가능하게 된다.
//상속받은 것만으로도 이미 Spring Context 에 생성된다.
public interface UserRepository extends JpaRepository<User, Long> {

}
