package mvc.user.ctrl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.domain.dto.ResponseUserDTO;
import mvc.service.util.MvcService;
import mvc.user.ctrl.util.Controller;
import mvc.util.view.View;

public class SelectCtrl implements Controller {
	
	private MvcService service ; 
	public SelectCtrl() {
	}
	public SelectCtrl(MvcService service) {
		 this.service = service ; 
	}
	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("debug >>> SelectCtrl execute() " ) ;
		List<ResponseUserDTO> list = service.select() ;
		
		// 아래 출력 결과는 JSP를 이용해서 브라우저에 출력되어야 함.....
		System.out.println("debug >>> 전체목록 ");
		for(ResponseUserDTO dto : list) {
			System.out.println(dto) ; 
		}
		
		//데이터를 심어보자 
		request.setAttribute("list", list) ; 
		
		
		View view = new View();
		view.setFlag(true) ; 
		view.setResponseJsp("../list/list.jsp");
		return view ; 
	}

}





