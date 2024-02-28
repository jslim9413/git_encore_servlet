package test.ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.service.util.MvcService;
import mvc.user.ctrl.util.Controller;
import mvc.util.view.View;

/*
@WebServlet("/index.encore") 
public class IndexController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		
		System.out.println("debug >>>> IndexController doGet() "); 
		RequestDispatcher view = request.getRequestDispatcher("./main.jsp") ;  
		view.forward(request, response) ;
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		
	}

}
*/

public class IndexController implements Controller {
	
	private MvcService service ; 
	public IndexController() {
	}
	public IndexController(MvcService service) {
		 this.service = service ; 
	}
	
	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("debug >>> IndexController execute() " ); 
		View view = new View();
		view.setFlag(true);
		view.setResponseJsp("./main.jsp") ;
		return view ; 
	}
	
}







