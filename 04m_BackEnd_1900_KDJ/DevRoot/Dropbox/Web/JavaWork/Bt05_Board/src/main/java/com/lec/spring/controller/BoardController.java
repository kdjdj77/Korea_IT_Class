package com.lec.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lec.spring.domain.Write;
import com.lec.spring.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

	private BoardService boardService;
	
	@Autowired
	public void setBoardService(BoardService boardService) {
		this.boardService = boardService;
	}

	public BoardController() {
		System.out.println(getClass().getName() + "() 생성");
	}
	
	// /board/list
	@GetMapping("/list")
	public void list(Model model) {
		model.addAttribute("list", boardService.list());
	}
	
	// /board/write
	@GetMapping("/write")
	public void write() {}
	
	@PostMapping("/write")
	public String writeOk(@ModelAttribute("dto") Write write, Model model) {
		System.out.println("POST: /board/write " + write);		
		model.addAttribute("result", boardService.write(write));
//		model.addAttribute("dto", write);
		System.out.println("저장후: " + write);
		return "board/writeOk";
	}
		
	// /board/detail
	@GetMapping("/detail")
	public void detail(Long id, Model model){
		model.addAttribute("list", boardService.detail(id));		
	}
	
	// /board/update
	@GetMapping("/update")
	public void update(Long id, Model model) {
		model.addAttribute("list", boardService.selectById(id));
	}
	
	@PostMapping("/update")
	public String updateOk(
			@ModelAttribute("dto") Write write, 
			Model model) {
		model.addAttribute("result", boardService.update(write));
		
		return "board/updateOk";
	}
	
	// /board/delete
	@PostMapping("/delete")
	public String deleteOk(Long id, Model model) {
		model.addAttribute("result", boardService.deleteById(id));
		
		return "board/deleteOk";
	}
	
	
} // end controller
