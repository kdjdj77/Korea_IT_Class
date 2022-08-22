package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.C;
import service.Service;
import service.user.LoginService;
import service.user.RegisterService;
import service.write.DeleteService;
import service.write.DetailService;
import service.write.ListService;
import service.write.SelectService;
import service.write.UpdateService;
import service.write.WriteService;

@WebServlet("/user/*")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UserController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		action(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); // 한글 인코딩
		action(request, response);
	}
	protected void action(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("\n>> " + getClass().getName() + ".action() 호출");
		
		// URL로부터 URI, ContextPath, Command 분리
		String uri = request.getRequestURI();   			// --> /JSP18_MVC/board/aaa
		String conPath = request.getContextPath();  		// --> /JSP18_MVC
		String command = uri.substring(conPath.length());  	// --> /board/aaa
		
		// request method
		String method = request.getMethod();   // GET, POST, PUT, PATCH, DELETE ...

		// 매 request 마다 출력 (테스트)
		System.out.println("request: " + uri + " (" + method + ")");  
		System.out.println("conPath: " + conPath);  
		System.out.println("command: " + command);
		
		
		// 컨트롤러는 
		// 1. 커맨드에 따라, 해당 Service 로직을 수행을 하고
		// 2. 결과를 내보낼 view를 결정한다
		Service service = null;	// 어떠한 Service 로직을 수행할지
		String viewPage = null; // 어떠한 페이지(view)를 보여줄지
		
		switch(command) {
			case "/user/register":
				switch(method) {
					case "GET":
						C.retrieveRedirectAttribute(request);
						viewPage = "/user/register.jsp";
						break;
					case "POST":
						service = new RegisterService();
						service.execute(request,  response);
		                // redirect 가 진행되면 이미 response 가 commit 됨.
		                // response 가 commit 되지 않은 경우만 jsp forward 진행
						if (!response.isCommitted())
							viewPage = "/user/registerOK.jsp";
						break;
				}
				break;
			case "/user/login":
				switch(method) {
					case "GET": // 로그인 폼
						C.retrieveRedirectAttribute(request);
						viewPage = "/user/login.jsp";
						break;
					case "POST": //로그인 진행
						service = new LoginService();
						service.execute(request, response);
						
						// Redirect가 일어나지 않고 로그인 성공했다면
						if (!response.isCommitted()) {
							// 기본적으론 home으로 redirect한다
							String redirectUrl = request.getContextPath() + "/home";
							response.sendRedirect(redirectUrl);
						}
						break;
				}
				break;
			case "/user/logout":
				break;
		}
		
		//위에서 결정된 뷰 페이지(viewPage)로 forward 해줌
		if (viewPage != null) {
			RequestDispatcher dispatcher = 
				request.getRequestDispatcher("/WEB-INF/views" + viewPage);
			dispatcher.forward(request, response);
		}
	}
}
