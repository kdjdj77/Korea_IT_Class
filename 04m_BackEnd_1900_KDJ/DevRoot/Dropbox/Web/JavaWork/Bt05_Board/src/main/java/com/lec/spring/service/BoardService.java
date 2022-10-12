package com.lec.spring.service;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
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
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.lec.spring.domain.FileDTO;
import com.lec.spring.domain.User;
import com.lec.spring.domain.Write;
import com.lec.spring.repository.FileRepository;
import com.lec.spring.repository.UserRepository;
import com.lec.spring.repository.WriteRepository;
import com.lec.spring.util.C;
import com.lec.spring.util.U;

@Service	
public class BoardService {
	
	@Value("${app.upload.path}")  // 설정파일의 설정값 주입
	private String uploadDir;

	@Autowired
	ServletContext context;   // ServletContext 도 주입받을수 있다.
	
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

	public int write(Write write
			, Map<String, MultipartFile> files) {
		
		// 현재 로그인 한 작성자 정보
		User user = U.getLoggedUser();	
		
		// 위 User 는 그대로 쓰면 안되고, repository 에서 읽어와야 한다
		user = userRepository.findById(user.getId()).orElse(null);
		write.setUser(user);
		
		writeRepository.saveAndFlush(write);
		
		// 첨부파일 추가
		addFiles(files, write.getId());
		
		return 1;
	}
	
	
	// 특정 글(id) 에 첨부파일 추가
	private void addFiles(Map<String, MultipartFile> files, Long id) {
		if(files == null) return;
		
		for(Map.Entry<String, MultipartFile> e : files.entrySet()) {
			// 첨부파일들 정보 출력
			System.out.println("\n첨부파일 정보: " + e.getKey());  // name 값
			U.printFileInfo(e.getValue());
			System.out.println();
			
			// 물리적 파일 업로드
			FileDTO file = upload(e.getValue());
			
			// 성공하면 DB에도 저장
			if(file != null) {
				file.setWrite(id);  // FK
				file = fileRepository.save(file);  // INSERT
			}
			
		}
	} // end addFiles()
	
	// 물리적으로 파일 저장. 중복된 이름 처리
	private FileDTO upload(MultipartFile multipartFile) {
		FileDTO attachment = null;

		// 담긴 파일이 없으면 pass~
		String originalFilename = multipartFile.getOriginalFilename();
		if(originalFilename == null || originalFilename.length() == 0) return null;

		// 원본 파일 명
        String sourceName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        // 저장될 파일 명
        String fileName = sourceName;
        
        // 파일명이 중복되는지 확인
        File file = new File(context.getRealPath(uploadDir) + File.separator + sourceName);
        if(file.exists()) {  // 중복된다면, 다른 이름으로 변경하여 파일 저장한다.
        	int pos = fileName.lastIndexOf(".");
        	if(pos > -1) {  // 확장자가 있는 경우
	        	String name = fileName.substring(0, pos);  // 파일'이름' 
	        	String ext = fileName.substring(pos + 1);  // 파일'확장명' 
	        	
	        	// 중복방지를 위한 새로운 이름 (현재시간 ms) 를 파일명에 추가
	        	fileName = name + "_" + System.currentTimeMillis() + "." + ext;
        	} else {
        		fileName += "_" + System.currentTimeMillis();
        	}
        }
        
        // 저장할 피일명
        System.out.println("fileName: " + fileName);
        
		Path copyOfLocation = 
        		Paths.get(context.getRealPath(uploadDir) + File.separator + fileName);

        System.out.println(copyOfLocation);
        
        try {
            // inputStream을 가져와서
            // copyOfLocation (저장위치)로 파일을 쓴다.
            // copy의 옵션은 기존에 존재하면 REPLACE(대체한다), 오버라이딩 한다
        	
        	// java.nio.file.Files
            Files.copy(
            		multipartFile.getInputStream(), 
            		copyOfLocation, 
            		StandardCopyOption.REPLACE_EXISTING   // 기존에 존재하면 덮어쓰기
            		);
        } catch (IOException e) {
            e.printStackTrace();
            // 예외처리는 여기서.
            //throw new FileStorageException("Could not store file : " + multipartFile.getOriginalFilename());
        }	
		
        attachment = FileDTO.builder()
        		.file(fileName)      // 저장된 이름
        		.source(sourceName)  // 원본이름
        		.build()
        		;
		
		return attachment;
	}	
	

	@Transactional
	public List<Write> detail(Long id) {
		// ※사실, 트랜잭션은 여기서 발생해야 한다.
		//  1. 조회수 증가
		//  2. 글 하나 읽어오기	
		
		List<Write> list = new ArrayList<>();
		
		Write write = writeRepository.findById(id).orElse(null);
		if(write != null) {
			write.setViewCnt(write.getViewCnt() + 1);
			writeRepository.saveAndFlush(write);  // UPDATE
			
			// 첨부파일 정보 가져오기
			List<FileDTO> fileList = fileRepository.findByWrite(write.getId());
			// 이미지 파일 여부 세팅
			setImage(fileList);
			write.setFiles(fileList);
			
			list.add(write);
		}
		
		return list;
	}

	
	// [이미지 파일 여부 세팅]
	public void setImage(List<FileDTO> fileList) {
		// upload 실제 물리적인 경로
		String realPath = context.getRealPath(uploadDir);
		
		for(FileDTO fileDto : fileList) {
			BufferedImage imgData = null;
			File f = new File(realPath, fileDto.getFile());  // 첨부파일에 대한 File 객체
			try {
				imgData = ImageIO.read(f);
				// ※ ↑ 파일이 존재 하지 않으면 IOExcepion 발생한다
				//   ↑ 이미지가 아닌 경우는 null 리턴
			} catch (IOException e) {
				System.out.println("파일존재안함: " + f.getAbsolutePath() + " [" + e.getMessage() + "]");
			}					
			
			if(imgData != null) fileDto.setImage(true); // 이미지 여부 체크
		} // end for
	}
	
	
	
	
	// 전체 목록
	public List<Write> list() {
		List<Write> list = null;
		
		list = writeRepository.findAll(Sort.by(Order.desc("id")));
		
		return list;
	}
	
	// 페이징 목록
	public List<Write> list(Integer page, Model model){
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
		
		// page 의 데이터 읽어오기
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

	public List<Write> selectById(Long id) {
		List<Write> list = new ArrayList<>();
		
		Write write = writeRepository.findById(id).orElse(null);
		
		if(write != null) {
			// 첨부파일 정보 가져오기
			// TODO
			
			list.add(write);
		}
		
		return list;
	}

	public int update(Write write
			, Map<String, MultipartFile> files // 새로 추가될 첨부파일들
			, Long [] delfile   // 삭제될 첨부파일들
			) {
		int result = 0;
		
		// update 하고자 하는 데이터 읽어오기
		Write w = writeRepository.findById(write.getId()).orElse(null);
		if(w != null) {
			w.setSubject(write.getSubject());
			w.setContent(write.getContent());
			writeRepository.save(w);   // UPDATE
			
			// 첨부파일 추가
			addFiles(files, write.getId());
			
			// 삭제할 첨부파일들 삭제
			for(Long fileId : delfile) {
				FileDTO file = fileRepository.findById(fileId).orElse(null);
				if(file != null) {
					delFile(file);  // 물리적으로 삭제
					fileRepository.delete(file);  // DB 에서 삭제
				}
			}
			
			
			result = 1;
		}
		
		return result;
	}

	// 특정 글(id) 삭제
	public int deleteById(Long id) {
		int result = 0;
		
		Write write = writeRepository.findById(id).orElse(null);
		
		if(write != null) {
			
			// 물리적으로 저장된 첨부파일 삭제하기
			List<FileDTO> fileList = fileRepository.findByWrite(id);
			if(fileList != null && fileList.size() > 0) {
				for(FileDTO file : fileList) {
					delFile(file);
				}
			}
			
			// 글삭제
			writeRepository.delete(write);
			result = 1;
		}
		
		return result;
	} // end deleteById()
	
	
	// 특정 첨부파일(id)을 물리적으로 삭제
	private void delFile(FileDTO file) {
		String saveDirectory = context.getRealPath(uploadDir);
		File f = new File(saveDirectory, file.getFile()); // 물리적으로 저장된 파일들이 삭제 대상
		System.out.println("삭제시도--> " + f.getAbsolutePath());

		if (f.exists()) {
			if (f.delete()) { // 삭제!
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}
		} else {
			System.out.println("파일이 존재하지 않습니다.");
		} // end if
	}

} // end Service
