package mvc.user.ctrl;

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
	
	@Override
	public View execute() {
		System.out.println("debug >>> LoginCtrl execute() " ) ;
		service.login();
		
		View view = new View();
		view.setFlag(true) ; 
		view.setResponseJsp("./login/login.jsp");
		return view ; 
	}

}
