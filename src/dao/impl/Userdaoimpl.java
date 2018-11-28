package dao.impl;


import java.sql.ResultSet;

import Template.jdbcTemplate;
import dao.Userdao;
import entity.User;
import handles.IResultSethandles;


//逻辑实现类
public class Userdaoimpl implements Userdao  {

	@Override
	public User checkloginbyusername(String username) throws Exception {
		String sql="SELECT * FROM user WHERE username = ?";
		return jdbcTemplate.query(sql, new IResultSethandles<User>() {
			@Override
			public User handles(ResultSet rs) throws Exception {
				if(rs.next()) {
					User user = new User(); // 封装一条users对象
					user.setUid(rs.getInt("uid"));
					user.setUsername(rs.getString("username"));
					user.setPassword(rs.getString("password"));
					return user;
					
				}
				return null;
			}
		}, username);
	}

	@Override
	public User checkregisterbyusername(User user) {
		
			String sql=" INSERT INTO user(username,password,email,uid) VALUES(?,?,?,?);";
			Object[] params = new Object[]{user.getUsername(),user.getPassword(),user.getEmail(),user.getUid()};
			jdbcTemplate.update(sql, params);
			return user;
	}
}
