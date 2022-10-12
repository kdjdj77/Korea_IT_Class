package com.lec.spring.controller;

import java.io.File;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lec.spring.domain.FileDTO;
import com.lec.spring.repository.FileRepository;

// 파일 다운로드를 위한 컨트롤러
// 데이터를 response 하기 위함

@RestController
public class FileController {

	@Value("${app.upload.path}")  // org.springframework.beans.factory.annotation.Value
	private String uploadDir;
	
	@Autowired
	ServletContext context;   // ServletContext 도 주입 받을수 있다.
	
	private FileRepository fileRepository;

	@Autowired
	public void setFileRepository(FileRepository fileRepository) {
		this.fileRepository = fileRepository;
	}

	
	public FileController() {
		System.out.println(getClass().getName() + "() 생성");
	}
	
	
	// 파일 다운로드
	// id: 파일의 id
	@RequestMapping("/board/download")
	public ResponseEntity<Object> download(Long id){
		if(id == null) return new ResponseEntity<Object>(null, HttpStatus.BAD_REQUEST);  // 400
		
		FileDTO file = fileRepository.findById(id).orElse(null);
		if(file == null) return new ResponseEntity<Object>(null, HttpStatus.NOT_FOUND);  // 404
		
		String sourceName = file.getSource();   // 원본 이름
		String fileName = file.getFile();      // 저장된 파일명
		String path = context.getRealPath(uploadDir) + File.separator + fileName;  // 파일의 물리적인 경로
		
		try {
			// 파일 유형 (MimeType) 추출
			String mimeType = Files.probeContentType(Paths.get(path));
			// 유형이 지정되지 않은 경우
			if(mimeType == null) {
				mimeType = "application/octet-stream";
			}
			
			Path filePath = Paths.get(path); // java.nio.file.Path, java.nio.file.Paths
			Resource resource   // org.springframework.core.io.Resource
				= new InputStreamResource(Files.newInputStream(filePath));
			
			// response header 세팅
			HttpHeaders headers = new HttpHeaders(); // org.springframework.http.HttpHeaders
			headers.setContentDisposition(ContentDisposition.builder("attachement").filename(URLEncoder.encode(sourceName, "utf-8")).build());  
			headers.setCacheControl("no-cache");
			headers.setContentType(MediaType.parseMediaType(mimeType));
			
			// ResponseEntity 에 담아서 리턴 (body, header, status)
			return new ResponseEntity<Object>(resource, headers, HttpStatus.OK);   // 200
			
		} catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Object>(null, HttpStatus.CONFLICT);  // 409
		}
		
	}
	
}













