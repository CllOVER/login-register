package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//字符编码过滤
public class CharacterEncodingFilter implements Filter {
	private static String Encoding;
	private static Boolean Encodingforce = false;
	@Override
	public void init(FilterConfig config) throws ServletException {
		this.Encoding = config.getInitParameter("Encoding");
		Object Encodingforce = Boolean.valueOf("force");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
//转换制式
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)resp;
		if(haslength(Encoding) && req.getParameter(Encoding) == null 
				|| Encodingforce) {
			
		}
		chain.doFilter(request, resp);
	}
	
	public Boolean haslength(String str) {
		return str != null && !"".equals(str.trim());
	}
	@Override
	public void destroy() {

	}

}
