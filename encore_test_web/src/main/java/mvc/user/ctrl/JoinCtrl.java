package mvc.user.ctrl;

import mvc.service.util.MvcService;
import mvc.service.util.MvcServieImpl;
import mvc.user.ctrl.util.Controller;
import mvc.util.view.View;

public class JoinCtrl implements Controller {
	
	// DI(Dependency Inject - Constructor Injection)
	private MvcService service ; 
	public JoinCtrl() {
	}
	public JoinCtrl(MvcService service) {
		 this.service = service ; 
	}
	/////////////////////////////////////////////////////////
	@Override
	public View execute() {
		System.out.println("debug >>> JoinCtrl execute() " ) ;
		service.join();  
		
		View view = new View();
		view.setFlag(true) ; 
		
		view.setResponseJsp("./join/join.jsp");
		return view ; 
	}

	
}
