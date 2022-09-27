package com.lec.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
		
	}
// /board/write
	@GetMapping("/write")
	public void write() {
		
	}
	@PostMapping("/write")
	public void writeOk(Model model) {
		
	}
// /board/detail
	@GetMapping("/detail")
	public void detail(Model model) {
		
	}
// /board/update
	@GetMapping("/update")
	public void update(Model model) {
		
	}
	@PostMapping("/update")
	public void updateOk(Model model) {
		
	}
// /board/delete
	@PostMapping("/delete")
	public void deleteOk() {
		
	}
}
