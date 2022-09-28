package com.lec.spring.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lec.spring.domain.Write;
import com.lec.spring.repository.WriteRepository;

@Service	
public class BoardService {

	private WriteRepository writeRepository;

	@Autowired
	public void setWriteRepository(WriteRepository writeRepository) {
		this.writeRepository = writeRepository;
	}
	
	public BoardService() {
		System.out.println(getClass().getName() + "() 생성");
	}

	public int write(Write write) {
		// 현재 날짜 세팅
		write.setRegDate(LocalDateTime.now());
		writeRepository.saveAndFlush(write);
		return 1;
	}

	@Transactional
	public List<Write> detail(Long id) {
		// ※사실, 트랜잭션은 여기서 발생해야 한다.
		//  1. 조회수 증가
		//  2. 글 하나 읽어오기	
		
		List<Write> list = new ArrayList<>();
		
		Write write = writeRepository.findById(id).orElse(null);
		if (write != null) {
			write.setViewCnt(write.getViewCnt() + 1);
			writeRepository.saveAndFlush(write); // UPDATE
			
			list.add(write);
		}
		return list;
	}
	public List<Write> list() {
		List<Write> list = null;
		
		list = writeRepository.findAll(Sort.by(Order.desc("id")));
		
		return list;
	}

	public Object selectById(Long id) {
		List<Write> list = new ArrayList<>();
		Write write = writeRepository.findById(id).orElse(null);
		if (write != null) list.add(write);
		
		
		return list;
	}

	public int update(Write write) {
		int result = 0;
		// update하고자 하는 데이터 읽어오기
		Write w = writeRepository.findById(write.getId()).orElse(null);
		if (w != null) {
			w.setSubject(write.getSubject());
			w.setContent(write.getContent());
			writeRepository.save(w); // UPDATE
			
			result = 1;
		}
		return result;
	}

	public int deleteById(Long id) {
		int result = 0;
		
		Write write = writeRepository.findById(id).orElse(null);
		if (write != null) {
			writeRepository.delete(write);
			result = 1;
		}
		
		return result;
	}
}
