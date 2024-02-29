package mvc.user.ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mvc.domain.dto.RequestUserDTO;
import mvc.domain.dto.ResponseUserDTO;
import mvc.service.util.MvcService;
import mvc.user.ctrl.util.Controller;
import mvc.util.view.View;

public class LoginCtrl implements Controller {
	
	private MvcService service ; 
	public LoginCtrl() {
	}
	public LoginCtrl(MvcService service) {
		 this.service = service ; 
	}
	
	// Controller 역할
	// 1. 파리미터가 있으면 값을 전달받고 이걸 DTO 바인딩한다.
	// 2. DTO 객체를 service 에 전달하여 특정 결과를 반환 받는다.
	// 3. 전달받은 값을 jsp 에 출력한다면 데이터를 심어(request, session) 
	// 4. View 객체를 이용해서 분기방식과 렌더링될 페이지 정보를 FrontController 전달하면 됨. 
	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("debug >>> LoginCtrl execute() " ) ;
		// 브라우저로부터 전달된 정보는 request 에 들어 있고 getParameter() 이용해서 값을 얻을 수 있다.  
		String id  = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		System.out.println("debug param id  : " + id);
		System.out.println("debug param pwd : " + pwd);
		RequestUserDTO params = new RequestUserDTO(id, pwd) ;
		//////////////// 서비스로부터 반환 받은 값 
		ResponseUserDTO user =  service.login(params) ;
		System.out.println("debug login result >>> " + user) ; 
		View view = new View();
		if( user != null ) {
			
			//request.setAttribute("user", user ) ; 
			
			HttpSession session = request.getSession() ; // session create 
			session.setAttribute("user", user) ; 
			
			view.setFlag(true) ; 
			view.setResponseJsp("./main.jsp") ; 
			return view ;
		} else {
			view.setFlag(true) ; 
			view.setResponseJsp("./error.jsp");
			return view ;
		}
	}

}

