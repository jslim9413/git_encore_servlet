package mvc.model.dao;

import mvc.domain.dto.RequestUserDTO;
import mvc.domain.dto.ResponseUserDTO;

public interface MvcDao {

	public void joinRow()  ;
	public ResponseUserDTO loginRow(RequestUserDTO params) ;
	public void updateRow();
	public void deleteRow();

}


