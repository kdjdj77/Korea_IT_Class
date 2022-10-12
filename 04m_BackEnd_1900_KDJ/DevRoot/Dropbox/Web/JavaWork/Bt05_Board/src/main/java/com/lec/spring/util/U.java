package com.lec.spring.util;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.lec.spring.config.PrincipalDetails;
import com.lec.spring.domain.User;

public class U {
	// 현재 request 구하기
	public static HttpServletRequest getRequest() {
		ServletRequestAttributes attrs = (ServletRequestAttributes)RequestContextHolder.currentRequestAttributes();
		return attrs.getRequest();
	}
	
	// 현재 session 구하기
	public static HttpSession getSession() {
		return getRequest().getSession();
	}
	
	// 현재 로그인한 사용자 UserDetail 구하기
	public static User getLoggedUser() {
		// 현재 로그인한 작성자 정보
		PrincipalDetails userDetails = (PrincipalDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		User user = userDetails.getUser();
		return user;
	}

	public static void printFileInfo(MultipartFile file) {
		// TODO Auto-generated method stub
		String originalFileName = file.getOriginalFilename();   // 원본 이름
		
		if(originalFileName == null || originalFileName.length() == 0) {
			System.out.println("\t파일이 없습니다");
			return;
		}

		System.out.println("\tOriginal File Name : " + originalFileName);
		System.out.println("\tCleanPath : " + StringUtils.cleanPath(originalFileName));
		System.out.println("\tFile Size : " + file.getSize() + " bytes");  // 용량 (byte)
		System.out.println("\tMIME: " + file.getContentType());  // content type (mime type)
		
		// 이미지 파일 여부
		BufferedImage bufferedImage = null;
		try {
			bufferedImage = ImageIO.read(file.getInputStream());
			
			if(bufferedImage != null) {
				System.out.printf("\t이미지 파일입니다: %d x %d\n" 
						, bufferedImage.getWidth(), bufferedImage.getHeight());
			} else {
				System.out.println("\t이미지 파일이 아닙니다");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
