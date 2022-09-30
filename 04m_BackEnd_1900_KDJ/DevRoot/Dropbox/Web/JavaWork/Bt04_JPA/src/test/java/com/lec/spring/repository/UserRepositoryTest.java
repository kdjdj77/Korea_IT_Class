package com.lec.spring.repository;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.contains;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.transaction.annotation.Transactional;

import com.lec.spring.domain.Gender;
import com.lec.spring.domain.User;


@SpringBootTest   // 스프링 context 를 로딩하여 테스트에 사용
class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserHistoryRepository userHistoryRepository;
	
//	@Test
//	@Transactional // org.springframework.transaction.annotation.Transactional
	void crud() {
		System.out.println("\n-- TEST#crud() ----------------------------------------");
//		  userRepository.save(new User()); // INSERT, 저장
//		  System.out.println(">>> "+userRepository.findAll()); // SELECT 전체 조회
//		  userRepository.findAll().forEach(System.out::println);
		
        // 테스트에 사용할 변수들
        List<User> users = null;
        User user1 = null, user2 = null, user3 = null, user4 = null, user5 = null;
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
//        user1 = userRepository.getOne(1L); // lazyLoading(LazyPatch) 지원
//        System.out.println(user1);

// #008 findById(id)
//        Optional<User> user;
//        user = userRepository.findById(1L); // EagerPatch
//        System.out.println(user); // Optional
//        System.out.println();
//        
//        user = userRepository.findById(10L); // 없다면?
//        System.out.println(user);
//        System.out.println();
//
//        // Optional#orElse() : 찾으면 entity 리턴, 없는 경우 null 리턴하도록 처리. 
//        user1 = userRepository.findById(10L).orElse(null);
//        System.out.println(user1);
//        System.out.println();

// #009 flush(), saveAndFlush()
//        // SQL쿼리의 변화를 주는게 아니라 DB 반영 시점을 조정한다. 로그 출력으로는 변화를 확인하기 힘들다
//        userRepository.save(new User("new martin", "newmartin@redknight.com"));
//        userRepository.flush();
//        userRepository.findAll().forEach(System.out::println);
//        
//        // saveAndFlush() = save() + flush()
//        userRepository.saveAndFlush(new User("new martin", "newmartin@redknight.com"));
//        userRepository.findAll().forEach(System.out::println);
        
// #010 count()
//        long count = userRepository.count();
//        System.out.println(count);
        
// #011 existsById()
//        boolean exists = userRepository.existsById(1L);
//        System.out.println(exists);
        
// #012 delete(entity)
//        // 삭제하기
//        userRepository.delete(userRepository.findById(1L).orElse(null));
//        userRepository.findAll().forEach(System.out::println);
//        
//        // delete() 는 null 을 허용하지 않기 때문에. 차라리 예외 발생시킬수도 있다.
//        userRepository.delete(userRepository.findById(10L).orElseThrow(RuntimeException::new));
//        userRepository.findAll().forEach(System.out::println);

// #013 deleteById(id)
//        userRepository.deleteById(1L);
//        userRepository.findAll().forEach(System.out::println);
        
// #014 deleteAll()
//        userRepository.deleteAll();
//        userRepository.findAll().forEach(System.out::println);

// #015 deleteAll(Iterable)
//        userRepository.deleteAll(userRepository.findAllById(Lists.newArrayList(1L, 3L)));
//        userRepository.findAll().forEach(System.out::println);

// #016 deleteInBatch(Iterable)
//      userRepository.deleteInBatch(userRepository.findAllById(Lists.newArrayList(1L, 3L)));
//      userRepository.findAll().forEach(System.out::println);
        
// #017 deleteAllInBatch()
//      userRepository.deleteAllInBatch();
//      userRepository.findAll().forEach(System.out::println);
        
// #018 findXXX(Pageable)  페이징
//        // PageRequest 는 Pageable 의 구현체  org.springframework.data.domain.PageRequest
//        // 리턴값은 Page<T>  org.springframework.data.domain.Page
//        // 주의: page 값은 0-base 다
//        
//        Page<User> pageUsers = userRepository.findAll(PageRequest.of(1, 3));   // page 1 (두번째 페이지), size 3
//        // page 출력
//        System.out.println("page: " + pageUsers);
//        // 전체 데이터 개수 5
//        System.out.println("totalElement : " + pageUsers.getTotalElements());
//        // 전체 페이지 수 2
//        System.out.println("totalPages : " + pageUsers.getTotalPages());
//        // 현재페이지 데이터 개수 2
//        System.out.println("numberOfElements" + pageUsers.getNumberOfElements());
//        
//        System.out.println("sort : " + pageUsers.getSort());
//        // 페이징 할 때 나누는 size 3
//        System.out.println("size : " + pageUsers.getSize());
//        
//        // 페이지 내부의 User 정보
//        pageUsers.getContent().forEach(System.out::println);
        
// #019 QueryByExample 사용
//        ExampleMatcher matcher = ExampleMatcher.matching()
//        		.withIgnorePaths("name")	// name 컬럼은 매칭하지 않겠다
//        		.withMatcher("email", endsWith()) // email 컬럼은 뒷부분 매칭으로 검색
//        		// import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;
//        		;
//        //Example.of(probe, ExampleMatcher)  <-- 여기서 probe 란 실제 Entity 는 아니란 말입니다.  match 를 위해서 쓰인 객체
//        Example<User> example = Example.of(new User("ma", "knight.com"), matcher);
//        userRepository.findAll(example).forEach(System.out::println);
        		
// #020 QueryByExample 사용
//        // email 필드에 "blue" 문자열이 있는것 find
//        user1 = new User();
//        user1.setEmail("blue");
//        //email 필드에서 주어진 문자열을 포함하고 있는 것을 검색
//        ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("email", contains());
//        // import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.contains;
//        
//        Example<User> example = Example.of(user1, matcher);
//        userRepository.findAll(example).forEach(System.out::println);

// #021 UPDATE
        // save()가 INSERT 뿐만 아니라 UPDATE도 수행한다
        user1 = new User("david", "david@redknight.com"); // INSERT : @Id 값이 Null 인 경우
        System.out.println("save()전 : " + user1);
        userRepository.save(user1);
        System.out.println("save() 후: " + user1);
        
        user2 = userRepository.findById(1L).orElse(null);
        user2.setEmail("martin@mail.com");
        System.out.println("user2: " + user2);  // @Id 값이 있는 경우 save() 는 UPDATE 동작
        userRepository.save(user2);
        userRepository.findAll().forEach(System.out::println);
        
        
		System.out.println("---------------------------------------------------------");
	}
	
//    @Test
    void select() {
        System.out.println("\n-- TEST#select() ---------------------------------------------");
		// 1.
//        userRepository.findByName("martin").forEach(System.out::println);
//        userRepository.findByName("dennis").forEach(System.out::println);
//        System.out.println(userRepository.findByName("dennis"));

        // 2.
//		System.out.println("findByEmail : " + userRepository.findByEmail("martin@redknight.com"));
//		System.out.println("getByEmail : " + userRepository.getByEmail("martin@redknight.com"));
//		System.out.println("readByEmail : " + userRepository.readByEmail("martin@redknight.com"));
//		System.out.println("queryByEmail : " + userRepository.queryByEmail("martin@redknight.com"));
//		System.out.println("searchByEmail : " + userRepository.searchByEmail("martin@redknight.com"));
//		System.out.println("streamByEmail : " + userRepository.streamByEmail("martin@redknight.com"));
//		System.out.println("findUserByEmail : " + userRepository.findUserByEmail("martin@redknight.com"));

		// 3.
//		System.out.println("findSomethingByEmail : " + userRepository.findSomethingByEmail("martin@redknight.com"));

		// 4.
//		System.out.println("findByByName : " + userRepository.findByByName("martin"));

		// 5.
//		System.out.println("findTop1ByName : " + userRepository.findTop1ByName("martin"));
//		System.out.println("findTop2ByName : " + userRepository.findTop2ByName("martin"));
//		System.out.println("findFirst1ByName : " + userRepository.findFirst1ByName("martin"));
//		System.out.println("findFirst2ByName : " + userRepository.findFirst2ByName("martin"));

		// 6.
//		System.out.println("findLast1ByName : " + userRepository);

		// 7.
//        System.out.println("findByEmailAndName : " + userRepository.findByEmailAndName("martin@redknight.com", "martin"));
//        System.out.println("findByEmailAndName : " + userRepository.findByEmailAndName("martin@redknight.com", "dennis"));
//        System.out.println("findByEmailOrName : " + userRepository.findByEmailOrName("martin@redknight.com", "dennis"));

		// 8.
//        System.out.println("findByCreatedAtAfter : " 
//        		+ userRepository.findByCreatedAtAfter(LocalDateTime.now().minusDays(1L)));  // 어제 이후의 createdAt 값
//        System.out.println("findByIdAfter : " + userRepository.findByIdAfter(4L));
//        System.out.println("findByNameBefore : " + userRepository.findByNameBefore("martin")); 

		// 9.
//		System.out.println("findByCreatedAtGreaterThan : " + userRepository.findByCreatedAtGreaterThan(LocalDateTime.now().minusDays(1L)));
//		System.out.println("findByNameGreaterThanEqual : " + userRepository.findByNameGreaterThanEqual("martin"));

		// 10.
//		System.out.println("findByCreatedAtBetween : " 
//				+ userRepository.findByCreatedAtBetween(
//						LocalDateTime.now().minusDays(1L), 
//						LocalDateTime.now().plusDays(1L)));
//		System.out.println("findByIdBetween : " + userRepository.findByIdBetween(1L, 3L));
//		System.out.println("findByIdGreaterThanEqualAndIdLessThanEqual : " 
//				+ userRepository.findByIdGreaterThanEqualAndIdLessThanEqual(1L, 3L));

		// 11.
//        System.out.println("findByIdIsNotNull : " + userRepository.findByIdIsNotNull());
//        System.out.println("findByIdIsNotEmpty : " + userRepository.findByIdIsNotEmpty());     
//		System.out.println("findByAddressIsNotEmpty : " +
//		userRepository.findByAddressIsNotEmpty());

		// 12.
//		System.out.println("findByNameIn : " 
//				+ userRepository.findByNameIn(Lists.newArrayList("martin", "dennis")));

		// 13.
//		System.out.println("findByNameStartingWith : " + userRepository.findByNameStartingWith("mar"));
//		System.out.println("findByNameEndingWith : " + userRepository.findByNameEndingWith("s"));
//		System.out.println("findByEmailContains : " + userRepository.findByEmailContains("red"));

		// 14.
//		System.out.println("findByEmailLike : " + userRepository.findByEmailLike("%" + "dragon" + "%"));
        System.out.println("------------------------------------------------------------\n");
    }

//	@Test
	void pagingAndSortingTest() {
		System.out.println("\n-- TEST#pagingAndSortingTest() ---------------------------------------------");

		// 16. OrderBy
//		System.out.println("findTop1ByName : " + userRepository.findTop1ByName("martin"));
//		System.out.println("findLast1ByName : " + userRepository.findLast1ByName("martin")); // Last 없는키워드. 무시된다
//		// ↓Id 역순정렬후 가장 처음. 즉 Last1
//		System.out.println("findTopByNameOrderByIdDesc : " + userRepository.findTopByNameOrderByIdDesc("martin")); 

		// 17. 정렬기준 추가
//		System.out.println("findFirstByNameOrderByIdDesc : " + userRepository.findFirstByNameOrderByIdDesc("martin"));
//		System.out.println("findFirstByNameOrderByIdDescEmailDesc : " + userRepository.findFirstByNameOrderByIdDescEmailDesc("martin"));

		// 18. 매개변수(Sort) 기반 정렬
		// import org.springframework.data.domain.Sort;
		// import org.springframework.data.domain.Sort.Order;



//        System.out.println("findFirstByName + Sort : " 
//			+ userRepository.findFirstByName("martin", Sort.by(Order.desc("id"))));
//        System.out.println("findFirstByName + Sort : " 
//			+ userRepository.findFirstByName("martin", Sort.by(Order.desc("id"), Order.asc("email"))));
//        System.out.println("findFirstByName + Sort : " + userRepository);

		// 18-2. 코드 가독성 개선
//		System.out.println("findFirstByName + Sort : " 
//				+ userRepository.findFirstByName("martin", getSort()));

		// 19
//		// PageRequest.of(page, size, Sort) page는 0-base
//		// PageRequest 는 Pageable의 구현체
//		Page<User> users = userRepository.findByName("martin", 
//				PageRequest.of(1, 1, Sort.by(Order.desc("id"))));
//
//		System.out.println("page: " + users); // Page 를 함 찍어보자
//		System.out.println("totalElements: " + users.getTotalElements());
//		System.out.println("totalPages: " + users.getTotalPages());
//		System.out.println("numberOfElements: " + users.getNumberOfElements());
//		System.out.println("sort: " + users.getSort());
//		System.out.println("size: " + users.getSize()); // 페이징 할때 나누는 size
//		users.getContent().forEach(System.out::println);


		System.out.println("\n------------------------------------------------------------\n");
	}
	private Sort getSort() {
		return Sort.by(
				Order.desc("id"), 
				Order.asc("email").ignoreCase(),
				Order.desc("createdAt"), Order.asc("updatedAt")
				);
	}
	
//	@Test
	void insertAndUpdateTest() {
	    System.out.println("\n-- TEST#insertAndUpdateTest() ---------------------------------------------");

	    User user = new User();
	    user.setName("martin");
	    user.setEmail("martin2@blueknight.com");
	    
	    userRepository.save(user);   // INSERT 진행
	    
	    User user2 = userRepository.findById(1L).orElseThrow(RuntimeException::new);
	    user2.setName("marrrrrrrrrrtin");
	    
	    userRepository.save(user2);  // UPDATE 진행
	    
	    
	    System.out.println("\n------------------------------------------------------------\n");
	}
	
//	@Test
	void enumTest() {
	    System.out.println("\n-- TEST#enumTest() ---------------------------------------------");      

	    User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
	    user.setGender(Gender.MALE);
	    userRepository.save(user);
	    
	    userRepository.findAll().forEach(System.out::println);
	    System.out.println(userRepository.findRowRecord().get("Gender"));
	    
	    System.out.println("\n------------------------------------------------------------\n");
	}

//	@Test
	void listenerTest() {
	    System.out.println("\n-- TEST#listenerTest() ---------------------------------------------");
	   
	    User user = new User();
	    user.setEmail("martin2@reddragon.com");
	    user.setName("martin2");
	    userRepository.save(user); // INSERT
	    
	    // SELECT
	    User user2 = userRepository.findById(1L).orElseThrow(RuntimeException::new);
	    
	    user2.setName("marrrrrrrrrtin"); // SELECT, UPDATE
	    userRepository.save(user2);
	    
	    userRepository.deleteById(4L);  // SELECT, DELETE


	    System.out.println("\n------------------------------------------------------------\n");
	}
	
//	@Test
	void prePersistTest() {
	    System.out.println("\n-- TEST#prePersistTest() ---------------------------------------------");
	    User user = new User();
	    user.setEmail("martin2@redknight.com");
	    user.setName("martin2");
//	    user.setCreatedAt(LocalDateTime.now());
//	    user.setUpdatedAt(LocalDateTime.now());
	    
	    userRepository.save(user); // INSERT
	    
	    System.out.println(userRepository.findByEmail("martin2@redknight.com"));
	    
	   
	    System.out.println("\n------------------------------------------------------------\n");
	}
	
//	@Test
	void preUpdateTest() throws InterruptedException{
	    Thread.sleep(1000);
	    System.out.println("\n-- TEST#preUpdateTest() ---------------------------------------------");
	   
	    User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
	    System.out.println("as-is : " + user); // 수정전
	    user.setName("martin2");
	    userRepository.save(user); // UPDATE
	   
	    System.out.println("to-be : " + userRepository.findAll().get(0));
	    System.out.println("\n------------------------------------------------------------\n");
	}
	
	@Test
	void userHistoryTest() {
	    System.out.println("\n-- TEST#userHistoryTest() ---------------------------------------------");

	    User user = new User();
	    user.setEmail("martin-new@greendragon.com");
	    user.setName("martin-new");

	    userRepository.save(user); // INSERT
	    
	    user.setName("martin-new-new");
	    userRepository.save(user); // UPDATE
	    
	    userHistoryRepository.findAll().forEach(System.out::println);

	   
	    System.out.println("\n------------------------------------------------------------\n");
	}

}
