package mvc.service.util;

import java.util.List;

import mvc.domain.dto.RequestUserDTO;
import mvc.domain.dto.ResponseUserDTO;
import mvc.model.dao.MvcDao;

public class MvcServieImpl implements MvcService {
	
	private MvcDao dao ;
	public MvcServieImpl() {
	}
	public MvcServieImpl(MvcDao dao) {
		this.dao = dao ; 
	}
	
	@Override
	public void join() {
		System.out.println("debug >>> service join()");
		dao.joinRow();
	}
	@Override
	public ResponseUserDTO login(RequestUserDTO params) {
		System.out.println("debug >>> service login()");
		return dao.loginRow(params); 
	}
	
	@Override
	public void update() {
		System.out.println("debug >>> service update()");
		dao.updateRow();
	}
	@Override
	public void delete() {
		System.out.println("debug >>> service delete()");
		dao.deleteRow();
	}
	@Override
	public List<ResponseUserDTO> select() {
		System.out.println("debug >>> service select()");
		return dao.selectRow() ; 
	}
}








