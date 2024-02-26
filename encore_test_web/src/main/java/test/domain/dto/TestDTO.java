package test.domain.dto;

// DTO(instance) == table(row)
// Entity 
public class TestDTO {
	private String id   ;  
	private String pwd  ;
	private String name ;
	public TestDTO() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "TestDTO [id=" + id + ", pwd=" + pwd + ", name=" + name + "]";
	}
	
	
}
