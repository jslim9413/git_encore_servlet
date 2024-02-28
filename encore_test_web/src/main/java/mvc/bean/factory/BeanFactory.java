package mvc.bean.factory;

import java.util.HashMap;
import java.util.Map;

import mvc.model.dao.MariaDao;
import mvc.model.dao.MvcDao;
import mvc.service.util.MvcService;
import mvc.service.util.MvcServieImpl;
import mvc.user.ctrl.DeleteCtrl;
import mvc.user.ctrl.JoinCtrl;
import mvc.user.ctrl.LoginCtrl;
import mvc.user.ctrl.SelectCtrl;
import mvc.user.ctrl.UpdateCtrl;
import mvc.user.ctrl.util.Controller;
import test.ctrl.IndexController;

/*
MVC Pattern 에서 
FrontController 와 실제 Controller 사이에서 동작한다. 
*/
public class BeanFactory {
	
	private Map<String, Controller> map ; 
	private static BeanFactory instance ; 
	
	private MvcService service ; 
	private MvcDao     dao ; 
	
	// join.hanwha , login.hanwha , update.hanwha , delete.hanwha  
	private BeanFactory() {
		dao     = new MariaDao();
		service = new MvcServieImpl(dao);
		
		map = new HashMap<String, Controller>();
		//// index
		map.put("/index.hanwha"  , new IndexController(service) ) ;  
		/////////////////
		map.put("/join.hanwha"   , new JoinCtrl(service)); 
		map.put("/login.hanwha"  , new LoginCtrl(service));
		map.put("/update.hanwha" , new UpdateCtrl(service));
		map.put("/delete.hanwha" , new DeleteCtrl(service));
		//// 새로운 업무 등록
		map.put("/select.hanwha" , new SelectCtrl(service));
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




