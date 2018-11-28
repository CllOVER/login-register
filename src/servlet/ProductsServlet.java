package servlet;
//商品类
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.Productsdao;
import dao.impl.Productsdaoimpl;
import entity.Products;
@WebServlet("/products")
public class ProductsServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private Productsdao dao;
	
	public void init() {
		dao = new Productsdaoimpl();   //初始化
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cmd = req.getParameter("cmd");   
		if("save".equals(cmd)) {
			this.save(req,resp);
		}else if("delete".equals(cmd)) {
			this.delete(req,resp);
		}else {
			this.list(req,resp);
		}

	}
	private void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 请求参数，封装对象 //处理业务请求 //控制界面跳转
		List <Products> list = dao.getAll();  //调用实现类
		req.setAttribute("products", list);  //设置属性 ，传值前台
		req.getRequestDispatcher("/product/Productsquery.jsp").forward(req, resp);
	}
	private void save(HttpServletRequest req, HttpServletResponse resp) {
		// 请求参数，封装对象 //处理业务请求 //控制界面跳转
		
	}
	private void delete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// 请求参数，封装对象 //处理业务请求 //控制界面跳转
		if (req.getParameter("pid") != null) {
			int pidInteger = new Integer(req.getParameter("pid")); // 强制转换类型
			dao.delete(pidInteger);
		}
		resp.sendRedirect("/ShoppingCart/ProductsServlet"); // 删除成功后先定向到逻辑
	}
}
