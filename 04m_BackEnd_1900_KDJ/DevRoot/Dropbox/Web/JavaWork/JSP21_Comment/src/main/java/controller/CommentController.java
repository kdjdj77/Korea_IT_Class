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
import service.comment.CmtDeleteService;
import service.comment.CmtListService;
import service.comment.CmtWriteService;
import service.write.DeleteService;
import service.write.DetailService;
import service.write.DownloadService;
import service.write.ListService;
import service.write.SelectService;
import service.write.UpdateService;
import service.write.WriteService;

@WebServlet("/comment/*")
public class CommentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CommentController() {
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
		
		switch(command) {
			case "/comment/list":
				new CmtListService().execute(request, response);
				break;
			case "/comment/write":
				if (method.equals("POST")) {
					new CmtWriteService().execute(request, response);
				}
				break;
			case "/comment/delete":
				if (method.equals("POST")) {
					new CmtDeleteService().execute(request, response);
				}
				break;
		}
	}
}
