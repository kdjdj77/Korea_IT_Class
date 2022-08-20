package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Service;
import service.write.DeleteService;
import service.write.DetailService;
import service.write.ListService;
import service.write.SelectService;
import service.write.UpdateService;
import service.write.WriteService;

@WebServlet("/book/*")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BoardController() {
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
		String uri = request.getRequestURI();   			
		String conPath = request.getContextPath();  		
		String command = uri.substring(conPath.length());  	
		
		// request method
		String method = request.getMethod();   

		// 매 request 마다 출력 (테스트)
		System.out.println("request: " + uri + " (" + method + ")");  
		System.out.println("conPath: " + conPath);  
		System.out.println("command: " + command);
		
		
		Service service = null;	// 어떠한 Service 로직을 수행할지
		String viewPage = null; // 어떠한 페이지(view)를 보여줄지
		
		switch(command) {
			case "/book/write":
				switch(method) {
					case "GET":
						viewPage = "write.jsp";
						break;
					case "POST":
						service = new WriteService();
						service.execute(request, response);
						viewPage = "writeOK.jsp";
						break;
				}
				break;
			case "/book/list":
				service = new ListService();
				service.execute(request, response);
				viewPage = "list.jsp";
				break;
			case "/book/detail":
				service = new DetailService();
				service.execute(request, response);
				viewPage = "detail.jsp";
				break;
			case "/book/update":
				switch(method) {
					case "GET":
						service = new SelectService();
						service.execute(request, response);
						viewPage = "update.jsp";
						break;
					case "POST":
						service = new UpdateService();
						service.execute(request, response);
						viewPage = "updateOK.jsp";
						break;
				}
				break;
			case "/book/delete":
				switch(method) {
					case "POST":
						service = new DeleteService();
						service.execute(request, response);
						viewPage = "deleteOK.jsp";
						break;
				}
				break;	
			}
			//위에서 결정된 뷰 페이지(viewPage)로 forward 해줌
			if (viewPage != null) {
				RequestDispatcher dispatcher = 
					request.getRequestDispatcher("/WEB-INF/views/board/" + viewPage);
				dispatcher.forward(request, response);
		}
	}
}
