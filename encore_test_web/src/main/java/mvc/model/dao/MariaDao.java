package mvc.model.dao;

import mvc.domain.dto.RequestUserDTO;
import mvc.domain.dto.ResponseUserDTO;

public class MariaDao implements MvcDao {

	@Override
	public void joinRow() {
		System.out.println("debug >>> MariaDB joinRow()");
	}
	@Override
	public ResponseUserDTO loginRow(RequestUserDTO params) {
		System.out.println("debug >>> MariaDB loginRow()");
		System.out.println("debug >>> MariaDB id  : " + params.getId());
		System.out.println("debug >>> MariaDB pwd : " + params.getPwd());
		
		// SQL : select * from table where id = params.getId() and params.getPwd() ; 
		ResponseUserDTO user = new ResponseUserDTO("jslim", "jslim", "임섭순"); 
		return null ;
	} 
	@Override
	public void updateRow() {
		System.out.println("debug >>> MariaDB updateRow()");
	}
	@Override
	public void deleteRow() {
		System.out.println("debug >>> MariaDB deleteRow()");
	}

}
