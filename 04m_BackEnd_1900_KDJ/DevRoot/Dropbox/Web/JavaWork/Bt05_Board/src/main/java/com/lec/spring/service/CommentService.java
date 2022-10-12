package com.lec.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import com.lec.spring.domain.Comment;
import com.lec.spring.domain.QryCommentList;
import com.lec.spring.domain.QryResult;
import com.lec.spring.domain.User;
import com.lec.spring.repository.CommentRepository;
import com.lec.spring.repository.UserRepository;

@Service
public class CommentService {
	@Autowired
	private CommentRepository commentRepository;
	@Autowired
	private UserRepository userRepository;
	
	public CommentService() {
		System.out.println(getClass().getName() + "() 생성");
	}
	
	// 특정 글(id)의 댓글 목록들
	public QryCommentList list(Long id) {
		QryCommentList list = new QryCommentList();
		List<Comment> comments = null;
		
		// 특정 글의 댓글들을 id역순으로 comments에 저장
		comments = commentRepository.findByWrite(id, Sort.by(Order.desc("id")));
		
		list.setCount(comments.size());
		list.setList(comments);		
		list.setStatus("OK");
		return list;
	}
	
	// 특정 글(writeId)에 특정 사용자(UserId)가 댓글 작성
	public QryResult write(Long writeId, Long userId, String content) {
		User user = userRepository.findById(userId).orElse(null);
		
		Comment comment = Comment.builder()
				.user(user)
				.content(content)
				.write(writeId)
				.build()
				;
		commentRepository.save(comment); // INSERT
		QryResult result = QryResult.builder()
				.count(1)
				.status("OK")
				.build()
				;
		return result;
	}
	
	// 특정 댓글(id) 삭제
	public QryResult delete(Long id) {
		Comment comment = commentRepository.findById(id).orElse(null);
		
		int count = 0;
		String status = "FAIL";
		if (comment != null) {
			commentRepository.delete(comment);
			count = 1;
			status = "OK";
		}
		QryResult result = QryResult.builder()
				.count(count)
				.status(status)
				.build()
				;
		return result;
	}
}
