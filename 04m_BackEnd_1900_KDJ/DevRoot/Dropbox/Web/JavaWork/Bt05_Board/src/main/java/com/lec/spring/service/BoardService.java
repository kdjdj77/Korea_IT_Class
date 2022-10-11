package com.lec.spring.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.lec.spring.domain.User;
import com.lec.spring.domain.Write;
import com.lec.spring.repository.FileRepository;
import com.lec.spring.repository.UserRepository;
import com.lec.spring.repository.WriteRepository;
import com.lec.spring.util.C;
import com.lec.spring.util.U;

@Service	
public class BoardService {
	@Value("${app.upload.path}") // app.prop 설정파일의 설정값 주입
	private String uploadDir;
	
	@Autowired
	ServletContext context; // ServletContext도 주입받을 수 있다

	private WriteRepository writeRepository;
	private UserRepository userRepository;
	private FileRepository fileRepository;

	@Autowired
	public void setWriteRepository(WriteRepository writeRepository) {
		this.writeRepository = writeRepository;
	}
	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	@Autowired
	public void setFileRepository(FileRepository fileRepository) {
		this.fileRepository = fileRepository;
	}

	public BoardService() {
		System.out.println(getClass().getName() + "() 생성");
	}

	public int write(Write write) {
		// 현재 로그인한 작성자 정보
		User user = U.getLoggedUser();
		// 위 유저 객체는 그대로 쓰면 안되고, repository에서 읽어와야 한다
		userRepository.findById(user.getId()).orElse(null);
		write.setUser(user);
		
		writeRepository.saveAndFlush(write);
		
		// TODO 첨부파일 추가
		
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
			
			// TODO 첨부파일 정보 가져오기
			
			list.add(write);
		}
		return list;
	}
	
	//전체 목록
	public List<Write> list() {
		List<Write> list = null;
		
		list = writeRepository.findAll(Sort.by(Order.desc("id")));
		
		return list;
	}
	
	// 페이징 목록
	public List<Write> list(Integer page, Model model) {
		//  현재 페이지 parameter
		if(page == null) page = 1; // 디폴트는 1 page
		if(page < 1) page = 1;

		// 페이징
		// writePages: 한 [페이징] 당 몇개의 페이지가 표시되나
		// pageRows: 한 '페이지'에 몇개의 글을 리스트 할것인가?
		HttpSession session = U.getSession();
		Integer writePages = (Integer)session.getAttribute("writePages");
		if(writePages == null) writePages = C.WRITE_PAGES;  // session 에 없으면 기본값으로
		Integer pageRows = (Integer)session.getAttribute("pageRows");
		if(pageRows == null) pageRows = C.PAGE_ROWS;   // session 에 없으면 기본값으로
		session.setAttribute("page", page);  // 현재 페이지 (세션에 저장해두자)
		
		// page의 데이터 읽어오기
		Page<Write> pageWrites = writeRepository.findAll(PageRequest.of(page - 1, pageRows, Sort.by(Order.desc("id"))));
	
		long cnt = pageWrites.getTotalElements();   // 글 목록 전체의 개수
		int totalPage = pageWrites.getTotalPages(); //총 몇 '페이지' 분량인가?
		if(page > totalPage) page = totalPage;   // 페이지 보정

		// [페이징] 에 표시할 '시작페이지' 와 '마지막페이지' 계산
		int startPage = ((int)((page - 1) / writePages) * writePages) + 1;
		int endPage = startPage + writePages - 1;
		if (endPage >= totalPage) endPage = totalPage;
		
		model.addAttribute("cnt", cnt);  // 전체 글 개수
		model.addAttribute("page", page); // 현재 페이지
		model.addAttribute("totalPage", totalPage);  // 총 '페이지' 수
		model.addAttribute("pageRows", pageRows);  // 한 '페이지' 에 표시할 글 개수
		
		// [페이징]
		model.addAttribute("url", U.getRequest().getRequestURI());  // 목록 url
		model.addAttribute("writePages", writePages); // [페이징] 에 표시할 숫자 개수
		model.addAttribute("startPage", startPage);  // [페이징] 에 표시할 시작 페이지
		model.addAttribute("endPage", endPage);   // [페이징] 에 표시할 마지막 페이지
		
		List<Write> list = pageWrites.getContent();	
		model.addAttribute("list", list);
		
		return list;	
	}
	
	public Object selectById(Long id) {
		List<Write> list = new ArrayList<>();
		Write write = writeRepository.findById(id).orElse(null);
		if (write != null) {
			// TODO 첨부파일 정보 가져오기
			list.add(write);
		}
		
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
			
			// TODO 첨부파일
			
			result = 1;
		}
		return result;
	}
	
	// 특정 글(id) 삭제
	public int deleteById(Long id) {
		int result = 0;
		
		Write write = writeRepository.findById(id).orElse(null);
		if (write != null) {
			
			// TODO 첨부파일
			
			writeRepository.delete(write);
			result = 1;
		}
		
		return result;
	}
}
