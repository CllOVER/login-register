package servlet;
//注册模块
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.Userdao;
import dao.impl.Userdaoimpl;
import entity.User;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private  Userdao dao=new Userdaoimpl();
	
	public void init() {

	}
	protected void service(HttpServletRequest req ,HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		//请求操作，封装对象
		User user = new User();
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		String uid = req.getParameter("uid");
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		user = dao.checkregisterbyusername(user);
		
		try {
			//判断注册的内容
			User us = dao.checkregisterbyusername(user);
			 
			if(us == null) {
				req.setAttribute("erroyMsg", "注册失败*号为必填选项!");
				req.getRequestDispatcher("/ShoppingCart/register.jsp").forward(req, resp);
				return ;
			}
			if(us.getPassword() == us.getUsername()) {
				
				req.setAttribute("erroyMsg", "密码不可与用户名相同");
				req.getRequestDispatcher("/ShoppingCart/register.jsp").forward(req, resp);
				return ;
			}
		resp.sendRedirect("/ShoppingCart/login.jsp");
		}catch(Exception e) {
			
		}
		
	}

}
