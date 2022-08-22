package common;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class C {
	// redirect 에 전달할 값들을 session name에 담음
	public static final String REDIRECT_ATTR_NAME = "REDIRECT_ATTR";

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

}
