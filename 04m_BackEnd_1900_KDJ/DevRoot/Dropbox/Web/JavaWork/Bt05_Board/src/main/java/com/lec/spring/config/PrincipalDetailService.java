package com.lec.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.lec.spring.domain.User;
import com.lec.spring.service.UserService;

//UserDetailsService
//컨테이너에 등록한다.
//시큐리티 설정에서 loginProcessingUrl(url) 을 설정해 놓았기에
//로그인시 위 url 로 요청이 오면 자동으로 UserDetailsService 타입으로 IoC 되어 있는
//loadUserByUsername() 가 실행되고
//인증성공하면 결과를 UserDetails 로 리턴
@Service
public class PrincipalDetailService implements UserDetailsService{
	@Autowired
	private UserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("loadByUsername(" + username + ")");
		
		User user = userService.findByUsername(username);
		
		// 해당 username의 User가 DB에 있다면
		// UserDetails를 생성하여 리턴
		if (user != null) {
			PrincipalDetails userDetails = new PrincipalDetails(user);
			userDetails.setUserService(userService);
			return userDetails;
		} 
		
		// 해당 username 의 user 가 없다면!
        // UsernameNotFoundException을 throw 해주도록 한다
		throw new UsernameNotFoundException(username);
		
		// 여기서 null 리턴하면 예외 발생
//		return null;
	}

}
