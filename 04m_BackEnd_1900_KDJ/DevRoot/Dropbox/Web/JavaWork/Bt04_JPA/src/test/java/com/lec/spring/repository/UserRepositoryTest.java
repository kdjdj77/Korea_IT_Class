package com.lec.spring.repository;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.transaction.annotation.Transactional;

import com.lec.spring.domain.Users;


@SpringBootTest   // 스프링 context 를 로딩하여 테스트에 사용
class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;
	
	@Test
//	@Transactional // org.springframework.transaction.annotation.Transactional
	void crud() {
		System.out.println("\n-- TEST#crud() ----------------------------------------");
		userRepository.save(new Users()); // INSERT, 저장
//		  System.out.println(">>> "+userRepository.findAll()); // SELECT 전체 조회
//		  userRepository.findAll().forEach(System.out::println);
		
        // 테스트에 사용할 변수들
        List<Users> users = null;
        Users user1 = null, user2 = null, user3 = null, user4 = null, user5 = null;
        List<Long> ids = null;
		
// #002 findAll()
//        users = userRepository.findAll();
//        users.forEach(System.out::println);
        
// #003 findxx() + Sort.by()
//        // name 필드의 역순 SELECT
//        users = userRepository.findAll(Sort.by(Direction.DESC, "name"));
//        users.forEach(System.out::println);
        
// #004 findxxByxx(Iterable)
//        ids = new ArrayList<>();
//        ids.add(1L);
//        ids.add(3L);
//        ids.add(5L);
//        users = userRepository.findAllById(ids);
//        users.forEach(System.out::println);
        
// org.assertj.core.util.Lists를 사용하면 간단
//        users = userRepository.findAllById(Lists.newArrayList(1L, 3L, 5L));
//        users.forEach(System.out::println);
        
// #005 save(entity) 저장하기
//        user1 = new Users("jack", "jack@redknight.com");
//        userRepository.save(user1); // INSERT
//        userRepository.findAll().forEach(System.out::println)

// #006 saveAll(Iterable<entity>)
//        user1 = new Users("jack", "jack@redknight.com");
//        user2 = new Users("steve", "steve@redknight.com");
//        userRepository.saveAll(Lists.newArrayList(user1, user2));
//        userRepository.findAll().forEach(System.out::println);
        
// #007 getOne(id)
//        // getOne()  Entity 리턴  Deprecated
//        // findById()  Optional<> 리턴
//        // 결과는 같은것 같으나 동작이 다릅니다.
//        user1 = userRepository.getOne(1L); // lazyLoading 지원
//        System.out.println(user1);


        
		System.out.println("---------------------------------------------------------");
	}

}
