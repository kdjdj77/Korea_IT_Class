package com.lec.spring.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.lec.spring.domain.Authority;
import com.lec.spring.domain.Comment;
import com.lec.spring.domain.FileDTO;
import com.lec.spring.domain.User;
import com.lec.spring.domain.Write;

@SpringBootTest
class WriteRepositoryTest {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private WriteRepository writeRepository;
	@Autowired
	private AuthorityRepository authorityRepository;
	@Autowired
	private CommentRepository commentRepository;
	@Autowired
	private FileRepository fileRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Test
	void init() {
		System.out.println("[init]");
		
		// Authority 생성
		Authority auth_member = Authority.builder()
					.name("ROLE_MEMBER")
					.build();
		Authority auth_admin = Authority.builder()
				.name("ROLE_ADMIN")
				.build();
		
		auth_member = authorityRepository.saveAndFlush(auth_member);
		auth_admin = authorityRepository.saveAndFlush(auth_admin);
		
		authorityRepository.findAll().forEach(System.out::println);

		// User 생성
		User user1 = User.builder()
				.username("USER1")
//				.password("1234")  // 나중에 Security 적용하면 PasswordEncoder사용해야함.
				.password(passwordEncoder.encode("1234"))
				.name("회원1")
				.build();
		
		User user2 = User.builder()
				.username("USER2")
				.password(passwordEncoder.encode("1234"))
				.name("회원2")
				.build();
		
		User admin1 = User.builder()
				.username("ADMIN1")
				.password(passwordEncoder.encode("1234"))
				.name("관리자1")
				.build();

		user1.addAuthority(auth_member);
		admin1.addAuthority(auth_member, auth_admin);
		
		user1 = userRepository.save(user1);
		user2 = userRepository.save(user2);
		admin1 = userRepository.save(admin1);
		
		userRepository.findAll().forEach(System.out::println);

		// 글 Write 작성
		Write w1 = Write.builder()
				.subject("제목입니다1")
				.content("내용입니다1")
				.user(user1)
				.build();
		
		Write w2 = Write.builder()
				.subject("제목입니다2")
				.content("내용입니다2")
				.user(user1)
				.build();
		
		Write w3 = Write.builder()
				.subject("제목입니다3")
				.content("내용입니다3")
				.user(admin1)
				.build();
		
		Write w4 = Write.builder()
				.subject("제목입니다4")
				.content("내용입니다4")
				.user(admin1)
				.build();
		
		w1 = writeRepository.save(w1);
		w2 = writeRepository.save(w2);
		w3 = writeRepository.save(w3);
		w4 = writeRepository.save(w4);
		
		writeRepository.findAll().forEach(System.out::println);
		
		
		// 댓글 Comment
		Comment c1 = Comment.builder()
				.content("1. user1이 1번글에 댓글 작성.")
				.user(user1)  // 누가 작성
				.write(w1.getId())  // 어느글의 댓글?
				.build();
		Comment c2 = Comment.builder()
				.content("2. user1이 1번글에 댓글 작성.")
				.user(user1)
				.write(w1.getId())
				.build();
		Comment c3 = Comment.builder()
				.content("3. user1이 2번글에 댓글 작성.")
				.user(user1)
				.write(w2.getId())
				.build();
		Comment c4 = Comment.builder()
				.content("4. user1이 2번글에 댓글 작성.")
				.user(user1)
				.write(w2.getId())
				.build();
		Comment c5 = Comment.builder()
				.content("5. user1이 3번글에 댓글 작성.")
				.user(user1)
				.write(w3.getId())
				.build();
		Comment c6 = Comment.builder()
				.content("6. user1이 3번글에 댓글 작성.")
				.user(user1)
				.write(w3.getId())
				.build();
		Comment c7 = Comment.builder()
				.content("7. user1이 4번글에 댓글 작성.")
				.user(user1)
				.write(w4.getId())
				.build();
		Comment c8 = Comment.builder()
				.content("8. user1이 4번글에 댓글 작성.")
				.user(user1)
				.write(w4.getId())
				.build();
		Comment c9 = Comment.builder()
				.content("9. admin1이 1번글에 댓글 작성.")
				.user(admin1)
				.write(w1.getId())
				.build();
		Comment c10 = Comment.builder()
				.content("10. admin1이 1번글에 댓글 작성.")
				.user(admin1)
				.write(w1.getId())
				.build();
		Comment c11 = Comment.builder()
				.content("11. admin1이 2번글에 댓글 작성.")
				.user(admin1)
				.write(w2.getId())
				.build();
		Comment c12 = Comment.builder()
				.content("12. admin1이 2번글에 댓글 작성.")
				.user(admin1)
				.write(w2.getId())
				.build();
		Comment c13 = Comment.builder()
				.content("13. admin1이 3번글에 댓글 작성.")
				.user(admin1)
				.write(w3.getId())
				.build();
		Comment c14 = Comment.builder()
				.content("14. admin1이 3번글에 댓글 작성.")
				.user(admin1)
				.write(w3.getId())
				.build();
		Comment c15 = Comment.builder()
				.content("15. admin1이 4번글에 댓글 작성.")
				.user(admin1)
				.write(w4.getId())
				.build();
		Comment c16 = Comment.builder()
				.content("16. admin1이 4번글에 댓글 작성.")
				.user(admin1)
				.write(w4.getId())
				.build();
		
		
		
		c1 = commentRepository.save(c1);
		c2 = commentRepository.save(c2);
		c3 = commentRepository.save(c3);
		c4 = commentRepository.save(c4);
		c5 = commentRepository.save(c5);
		c6 = commentRepository.save(c6);
		c7 = commentRepository.save(c7);
		c8 = commentRepository.save(c8);
		c9 = commentRepository.save(c9);
		c10 = commentRepository.save(c10);
		c11 = commentRepository.save(c11);
		c12 = commentRepository.save(c12);
		c13 = commentRepository.save(c13);
		c14 = commentRepository.save(c14);
		c15 = commentRepository.save(c15);
		c16 = commentRepository.save(c16);

		commentRepository.findAll().forEach(System.out::println);

		// 첨부파일 
		FileDTO file1 = FileDTO.builder()
				.file("face01.png")
				.source("face01.png")
				.write(w1.getId())
				.build();
		FileDTO file2 = FileDTO.builder()
				.file("face02.png")
				.source("face02.png")
				.write(w1.getId())
				.build();
		FileDTO file3 = FileDTO.builder()
				.file("face03.png")
				.source("face03.png")
				.write(w2.getId())
				.build();
		FileDTO file4 = FileDTO.builder()
				.file("face04.png")
				.source("face04.png")
				.write(w2.getId())
				.build();
		FileDTO file5 = FileDTO.builder()
				.file("face05.png")
				.source("face05.png")
				.write(w3.getId())
				.build();
		FileDTO file6 = FileDTO.builder()
				.file("face06.png")
				.source("face06.png")
				.write(w3.getId())
				.build();
		FileDTO file7 = FileDTO.builder()
				.file("face07.png")
				.source("face07.png")
				.write(w4.getId())
				.build();
		FileDTO file8 = FileDTO.builder()
				.file("face08.png")
				.source("face08.png")
				.write(w4.getId())
				.build();
		
		file1 = fileRepository.save(file1);
		file2 = fileRepository.save(file2);
		file3 = fileRepository.save(file3);
		file4 = fileRepository.save(file4);		
		file5 = fileRepository.save(file5);
		file6 = fileRepository.save(file6);
		file7 = fileRepository.save(file7);
		file8 = fileRepository.save(file8);
		
		fileRepository.findAll().forEach(System.out::println);


		
	}
}
