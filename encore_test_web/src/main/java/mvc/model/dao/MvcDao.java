package mvc.model.dao;

import java.util.List;

import mvc.domain.dto.RequestUserDTO;
import mvc.domain.dto.ResponseUserDTO;

// DML(insert, update, delete) - executeUpdate() : int
// select - executeQuery() : ResultSet 
public interface MvcDao {

	public void joinRow()  ;
	public ResponseUserDTO loginRow(RequestUserDTO params) ;
	public void updateRow();
	public void deleteRow();
	public List<ResponseUserDTO> selectRow() ; 

}


