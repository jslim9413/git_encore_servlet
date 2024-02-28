package mvc.front.ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.bean.factory.BeanFactory;
import mvc.user.ctrl.util.Controller;
import mvc.util.view.View;

@WebServlet("*.hanwha")
public class DispatcherController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		process(request, response);
	}
	public void process(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		System.out.println("debug >>> FrontController process ");
		System.out.println("client request path : " + request.getRequestURI() );
		//////////////////
		BeanFactory factory = BeanFactory.getInstance() ; 
		Controller ctrl = factory.getCtrl(request.getRequestURI()) ;
		
		//////////////////////////////// 수정된 부분 
		View view = ctrl.execute(request, response) ;  	
		
		if( view.isFlag() ) {
			RequestDispatcher rd =  request.getRequestDispatcher( view.getResponseJsp() );
			rd.forward(request, response) ;
		} else {
			response.sendRedirect( view.getResponseJsp() ); 
		}
	}
}







