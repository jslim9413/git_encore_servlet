package mvc.bean.factory;

import java.util.HashMap;
import java.util.Map;

import mvc.user.ctrl.DeleteCtrl;
import mvc.user.ctrl.JoinCtrl;
import mvc.user.ctrl.LoginCtrl;
import mvc.user.ctrl.UpdateCtrl;
import mvc.user.ctrl.util.Controller;

/*
MVC Pattern 에서 
FrontController 와 실제 Controller 사이에서 동작한다. 
*/
public class BeanFactory {
	
	private Map<String, Controller> map ; 
	private static BeanFactory instance ; 
	
	// join.hanwha , login.hanwha , update.hanwha , delete.hanwha  
	private BeanFactory() {
		map = new HashMap<String, Controller>();
		map.put("/join.hanwha"   , new JoinCtrl());
		map.put("/login.hanwha"  , new LoginCtrl());
		map.put("/update.hanwha" , new UpdateCtrl());
		map.put("/delete.hanwha" , new DeleteCtrl());
	}
	
	public static BeanFactory getInstance() {
		if(instance == null) {
			instance = new BeanFactory() ; 
		}
		return instance ;
	}
	
	public Controller getCtrl(String clientPath) {
		return map.get(clientPath);
	}
}




