package servlet;
//登录模块

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Userdao;
import dao.impl.Userdaoimpl;
import entity.User;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static Userdao dao;
	@Override
	public void init() {
		dao = new Userdaoimpl();
	}
	
	@Override
	protected void service(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
	//判断错误等情况下
		// 接收参数 业务处理层 界面跳转
		User user;
		try {
			user = dao.checkloginbyusername(username);
		
		if(user == null) {
			req.setAttribute("erroyMsg", "*该账号不存在，请注册后使用");
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
			return ;
		}
		if(!user.getPassword().equals(password)) {
			req.setAttribute("erroyMsg", "*账号或者密码输入错误！");
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
			return ;
		}
		req.getSession().setAttribute("USER_IN_SESSION", user);  //获取session对象
		resp.sendRedirect("/ShoppingCart/product/productsquery.jsp");   //重定向
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
