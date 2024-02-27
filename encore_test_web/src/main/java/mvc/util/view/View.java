package mvc.util.view;

// View.java 역할
// FrontController 인 DispatcherServlet 이 화면의 분기방식과 응답 페이지 정보를 반환 받을 수 있도록 
public class View {
	private String 	responseJsp ; // 응답페이지 정보
	private boolean	isFlag ; // true -> forward , false -> redirect
	public View() {
		super();
		// TODO Auto-generated constructor stub
	}
	public View(String responseJsp, boolean isFlag) {
		super();
		this.responseJsp = responseJsp;
		this.isFlag = isFlag;
	}
	public String getResponseJsp() {
		return responseJsp;
	}
	public void setResponseJsp(String responseJsp) {
		this.responseJsp = responseJsp;
	}
	public boolean isFlag() {
		return isFlag;
	}
	public void setFlag(boolean isFlag) {
		this.isFlag = isFlag;
	}
	
	@Override
	public String toString() {
		return "View [responseJsp=" + responseJsp + ", isFlag=" + isFlag + "]";
	}
	
	
}
