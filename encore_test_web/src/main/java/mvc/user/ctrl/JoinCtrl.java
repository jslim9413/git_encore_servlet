package mvc.user.ctrl;

import mvc.user.ctrl.util.Controller;
import mvc.util.view.View;

public class JoinCtrl implements Controller {

	@Override
	public View execute() {
		System.out.println("debug >>> JoinCtrl execute() " ) ;
		View view = new View();
		view.setFlag(true) ; 
		view.setResponseJsp("./join/join.jsp");
		return view ; 
	}

	
}
