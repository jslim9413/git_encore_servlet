package mvc.domain.dto;

public class RequestUserDTO {
	private String id ; 
	private String pwd ;
	public RequestUserDTO() {
		super();
	}
	public RequestUserDTO(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", pwd=" + pwd + "]";
	} 
	
	
}
