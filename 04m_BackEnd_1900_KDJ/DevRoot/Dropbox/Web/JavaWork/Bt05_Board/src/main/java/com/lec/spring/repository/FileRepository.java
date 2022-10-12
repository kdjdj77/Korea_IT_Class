package com.lec.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lec.spring.domain.FileDTO;

public interface FileRepository extends JpaRepository<FileDTO, Long> {
	// 특정 글(writeId)의 첨부파일들
	List<FileDTO> findByWrite(Long writeId);
}
