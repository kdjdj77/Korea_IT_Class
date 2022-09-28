package com.lec.spring.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lec.spring.domain.User;

//Repository 생성
//JpaRepository<Entity타입, Id타입> 상속 ← 바로 이게 Spring Data JPA 가 지원해주는 영역!
//상속받은 것만으로도 많은 JPA 메소드를 편리하게 사용 가능하게 된다.
//상속받은 것만으로도 이미 Spring Context 에 생성된다.
public interface UserRepository extends JpaRepository<User, Long> {
	
	// 만약 리턴하는 객체가 하나뿐이라면 리턴타입이 User 이어도 괜찮다.
//	User findByName(String name);

	// 복수개인경우 List<User> 로 선언해야 한다.
//	List<User> findByName(String name);

//	Optional<User> findByName(String name);
	
	Set<User> findByName(String name);
	
	// 2
	User findByEmail(String email);
	User getByEmail(String email);
	User readByEmail(String email);
	User queryByEmail(String email);
	User searchByEmail(String email);
	User streamByEmail(String email);
	User findUserByEmail(String email);
	
	// 3. find아무말..By 가능
	User findSomethingByEmail(String email);
	
	// 4. 잘못된 네이밍은 RuntimeException 발생
//	User findByByName(String email); // <- err
	
	// 5. First, Top
    // First 와 Top 은 둘다 동일 (가독성 차원에서 제공되는 것임)
	List<User> findFirst1ByName(String name); // <- 리턴타입 User 가능
	List<User> findFirst2ByName(String name);
	List<User> findTop1ByName(String name); // <- 리턴타입 User 가능
	List<User> findTop2ByName(String name);

    // 6. 혹시 Last 는 없나?
    // Last 는 없는 키워드. 없는 키워드는 무시된다.  
    List<User> findLast1ByName(String name);  // 걍 findByName() 과 동일한 동작  
    
    // 7. And, Or
    List<User> findByEmailAndName(String email, String name);
    List<User> findByEmailOrName(String email, String name);
    
    // 8. After, Before
    List<User> findByCreatedAtAfter(LocalDateTime datetime);
    List<User> findByIdAfter(Long id);
    List<User> findByNameBefore(String name);
    
    // 9. GreaterThan, GreaterThanEqual, LessThan, LessThanEqual
    List<User> findByCreatedAtGreaterThan(LocalDateTime datetime);
    List<User> findByNameGreaterThanEqual(String name);
    
    // 10. Between
    List<User> findByCreatedAtBetween(LocalDateTime datetime1, LocalDateTime datetime2);
    List<User> findByIdBetween(Long id1, Long id2);
    List<User> findByIdGreaterThanEqualAndIdLessThanEqual(Long id1, Long id2);
    
    // 11. Null, Empty
    List<User> findByIdIsNotNull();
//    List<User> findByIdIsNotEmpty();
    List<User> findByAddressIsNotEmpty();
    
}
