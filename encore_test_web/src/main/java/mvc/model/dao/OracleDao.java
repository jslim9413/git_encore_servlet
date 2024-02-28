package mvc.model.dao;

import mvc.domain.dto.RequestUserDTO;
import mvc.domain.dto.ResponseUserDTO;

public class OracleDao implements MvcDao {
	@Override
	public void joinRow() {
		System.out.println("debug >>> OracleDB joinRow()");
	}
	@Override
	public ResponseUserDTO loginRow(RequestUserDTO params) {
		System.out.println("debug >>> OracleDB loginRow()");
		return null ;
	}
	@Override
	public void updateRow() {
		System.out.println("debug >>> OracleDB updateRow()");
	}
	@Override
	public void deleteRow() {
		System.out.println("debug >>> OracleDB deleteRow()");
	}
}
