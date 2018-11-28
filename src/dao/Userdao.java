package dao;

import entity.User;

public interface Userdao {

	User checkloginbyusername(String username) throws Exception;   //登录检查
	
	User checkregisterbyusername(User user);   //注册检查
}
