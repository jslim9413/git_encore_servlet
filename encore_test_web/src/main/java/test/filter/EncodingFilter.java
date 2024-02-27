package test.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

@WebFilter("/*")
public class EncodingFilter extends HttpFilter implements Filter {
    
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
	throws IOException, ServletException {
		// System.out.println("컨트롤러의 서비스 메서드 실행 전 수행할 필터 작업");
		request.setCharacterEncoding("UTF-8") ; 
		chain.doFilter(request, response); // controller ---> service()[doGet | doPost]
		// System.out.println("컨트롤러의 서비스 메서드 실행 후 수행할 필터 작업");
	}
	public void destroy() {
	}
}
