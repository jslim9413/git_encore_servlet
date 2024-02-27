package test.ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import test.domain.dto.TestDTO;

@WebServlet("/login.encore")
public class LoginController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		process(request, response); 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		process(request, response);
	}
	protected void process(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		System.out.println("debug >>> client uri : " + request.getRequestURI() ) ; 
		System.out.println("debug >>> client QueryString : " + request.getQueryString() ) ;
		System.out.println("debug >>> client request method : " + request.getMethod() );
		
		// 한글 인코딩 작업을하면 한글이 깨지지 않는다.
		// 아래 작업을 필터로 대체되는 것
		// request.setCharacterEncoding("UTF-8") ; 
		
		String id  = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		
		System.out.println("debug >>> params " + id ); 
		System.out.println("debug >>> params " + pwd);
		
		if( id.equals("encore") && pwd.equals("encore") ) {
			// 백엔드로부터 전달받은 데이터(가정)
			TestDTO params = new TestDTO() ; 
			params.setId("encore"); 
			params.setPwd("encore"); 
			params.setName("엔코아");
			
			// scope 는 forward 되어지는 페이지까지만 데이터를 유지할 수 있다.
			// request.setAttribute("user", params);
			
			// session 에 데이터를 심는다면?
			HttpSession session = request.getSession() ;
			session.setAttribute("user" , params ) ;
			RequestDispatcher view = request.getRequestDispatcher("./ok.jsp") ; 
			view.forward(request, response) ;
			
			// response.sendRedirect("./ok.jsp") ; 
			
		}else {
			RequestDispatcher view = request.getRequestDispatcher("./error.jsp") ; 
			view.forward(request, response) ;
		}
		
	}		
}









