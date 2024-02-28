package mvc.user.ctrl.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.util.view.View;

public interface Controller {
	
	public View execute(HttpServletRequest request, HttpServletResponse response) ; 
	
}
