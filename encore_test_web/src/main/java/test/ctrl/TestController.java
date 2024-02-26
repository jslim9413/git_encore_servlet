package test.ctrl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test.encore")
public class TestController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		
		System.out.println("debug >>>> TestController doGet() " ) ; 
		/*
		PrintWriter out = response.getWriter();
		out.print("<div align=\"center\">Web Application Programming(Servlet/JSP)</div>"); 
		out.close() ;
		*/
		
		// 화면분기     request                                                    jdbc , ORM   
		// browser -------------> Controller ---------> Service ---------> Dao --------------- DBMS
		
		// 분기 첫번째 방식 redirect() ; X
		// request.sendRedirect("./test.jsp");
		
		// 분기 두번째 방식 forward() : 스프링부트 권장하는 방식 
		RequestDispatcher view = request.getRequestDispatcher("./test.jsp") ; 
		view.forward(request, response) ;
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
	
	}

}


