package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import dao.Userdao;
import dao.impl.Userdaoimpl;
import entity.User;

public class UserdaoimplTest {

	 Userdao dao = new Userdaoimpl();  //调用相关响应的类
	@Test
	public void testCheckloginbyusername() throws Exception {
		User user = dao.checkloginbyusername("adilm");
		System.out.println(user);
	}

}
