package com.lec.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lec.spring.domain.FileDTO;

public interface FileRepository extends JpaRepository<FileDTO, Long> {

}
