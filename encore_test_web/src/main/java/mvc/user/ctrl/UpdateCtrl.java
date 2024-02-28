package mvc.user.ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.service.util.MvcService;
import mvc.user.ctrl.util.Controller;
import mvc.util.view.View;

public class UpdateCtrl implements Controller {
	private MvcService service ; 
	public UpdateCtrl() {
	}
	public UpdateCtrl(MvcService service) {
		 this.service = service ; 
	}
	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("debug >>> UpdateCtrl execute() " ) ;
		service.update();
		
		View view = new View();
		view.setFlag(true) ; 
		view.setResponseJsp("./update/update.jsp");
		return view ; 
	}
}
