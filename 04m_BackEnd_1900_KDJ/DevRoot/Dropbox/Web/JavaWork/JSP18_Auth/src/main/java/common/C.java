package common;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.protocol.a.authentication.CachingSha2PasswordPlugin.AuthStage;

import domain.UserDTO;

public class C {
	// redirect 에 전달할 값들을 session name에 담음
	public static final String REDIRECT_ATTR_NAME = "REDIRECT_ATTR";
	public static final String PRINCIPAL = "PRINCIPAL";  // 로그인 하면 저장되는 session name
	public static final String URL_PRIOR = "URL_PRIOR";  // 원래 가고자 했던 url 이 저장된 session name

	
    // Redirect 시 전달할 값들을 session 에 추가하기
    // Map<k,v> 형태로 session 에 저장
    public static void addRedirectAttribute(HttpServletRequest request, String name, Object value) {
    	if (request == null || name == null || value == null) return;
    	HttpSession session = request.getSession();
    	
    	HashMap<String, Object> redirectAttr = 
    		(HashMap<String, Object>)session.getAttribute(REDIRECT_ATTR_NAME);
    	// 기본에 없었으면 session에 새로 추가
    	if (redirectAttr == null) {
    		redirectAttr = new HashMap<String, Object>();
    		session.setAttribute(REDIRECT_ATTR_NAME, redirectAttr);
    	}
    	
    	// name-value 추가
    	redirectAttr.put(name, value);
    }
    
    //  Session 의 REDIRECT_ATTR 를 Request 에 옮기기
    //  옮긴뒤 Session 에선 삭제.
    public static void retrieveRedirectAttribute(HttpServletRequest request) {
    	if (request == null) return;
    	HttpSession session = request.getSession();
    	
    	// session에서 꺼내어
    	HashMap<String, Object> redirectAttr = 
        	(HashMap<String, Object>)session.getAttribute(REDIRECT_ATTR_NAME);
    	
    	// request에 담기
    	if (redirectAttr == null) return;
    	request.setAttribute(REDIRECT_ATTR_NAME, redirectAttr);
    	
    	// session에선 삭제하기
    	session.removeAttribute(REDIRECT_ATTR_NAME);
    
    }
    
	/* 현재 진입하려는 url 에 대한 권한 체크
	기본적으로 아래 메소드를 호출하는 것은 authentication(로그인) 은 되어 있어야 한다는 뜻이다
	1. 로그인은 되어 있는 상태인지 확인
	2. 로그인이 되어 있다면 필요한 권한(authority) 가 있는 상태인지 확인
	3. 특정 사용자 이어야 하는지도 확인

	'이전'으로 갈지 혹은 '특정페이지(ex : 로그인) ' 으로 갈지 동작시켜 주어야 한다.
	로그인 이후에는 '원래 가고자 했던 페이지'로 다시 request 가 될수 있도록 redirect 해주어야 한다.
	즉 '원래 가고자 했던 URL' 도 기억해야 한다는 뜻이다. → session 에 저장해두자 */
    
    // securityCheck를 통과하면 true/false 리턴
    public static boolean securityCheck(
		HttpServletRequest request,
		HttpServletResponse response,
		String [] authorities //접근에 필요한 권한
		) throws IOException {
    	
    	String conPath = request.getContextPath();
    	
    	// 원래 가고자 했던 url
    	String qry = request.getQueryString();
    	String url_prior = request.getRequestURL() + ((qry != null) ? "?" + qry : "");
    	
    	// 로그인(인증) 되었을 user 객체 가져오기
    	HttpSession session = request.getSession();
    	UserDTO user = (UserDTO)session.getAttribute(PRINCIPAL);
    	
		// 로그인이 되어 있지 않다면 
		// 로그인 페이지로 유도하고 로그인이 완료되면 URL_PRIOR 로 돌아오게 하기
		if(user == null) {
			session.setAttribute(URL_PRIOR, url_prior);
			response.sendRedirect(conPath + "/user/login");
			return false;
		}
		
		// 접근에 필요한 권한이 있는 경우
		if (authorities != null && authorities.length > 0) {
			String auths = user.getAuthorities();
			
			// 그런데 로그인한 사용자의 권한이 아예 없다면
			if (auths == null) {
				response.sendRedirect(conPath + "/user/rejectAuth");
				return false;
			}
			
			// 필요한 권한이 하나라도 있다면 ok
			for (String authority : authorities) {
				if (auths.indexOf(authority) > -1) {
					return true;
				}
			}
			
			response.sendRedirect(conPath + "/user/rejectAuth");
			return false;

		}
		return true;
    }
    
    // session에 담겨있던 '원래 가고자 했던 url' 꺼내오기
    public static String retrieveUrlPrior(HttpServletRequest request) {
    	HttpSession session = request.getSession();
    	String urlPrior = (String)session.getAttribute(URL_PRIOR); // 꺼내기
    	session.removeAttribute(URL_PRIOR); // 꺼냈으면 세션에서 제거
    	return urlPrior;
    }
    
}
