package dao.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Template.jdbcTemplate;
import dao.Productsdao;
import entity.Products;
import handles.IResultSethandles;

public class Productsdaoimpl implements Productsdao {

	@Override
	public void save(Products obj) {
		String sql="INSERT INTO product(pkind,pname,ptype,price,pcarriage,pdate,paddress,pdescribed) VALUES(?,?,?,?,?,?,?,?)";
		Object[] params = new Object[] {obj.getPkind(),obj.getPname(),obj.getPtype(),obj.getPrice(),obj.getPcarriage(),obj.getPdate(),obj.getPaddress(),obj.getPdescribed()};
		jdbcTemplate.update(sql, params);
		
	}

	@Override
	public void update(Products obj) {
	
		
	}

	@Override
	public void delete(int pid) {
		String sql="DELETE FROM product WHERE id = ?";
		jdbcTemplate.update(sql, pid);
		
	}

	@Override
	public List<Products> getAll() {
		try {
			return jdbcTemplate.query("SELECT * FROM products", new producthandles());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
		}	
	

	@Override
	public List<Products> gettypeAll(String ptype) {
	
		return null;
	}
	class producthandles implements IResultSethandles<List<Products>>{

		public List<Products> handles(ResultSet rs) throws Exception{
			List<Products> list = new ArrayList<Products>();
		while (rs.next()) {
			Products p = new Products(); // 一天信息
			p.setPid(rs.getInt("pid"));
			p.setPkind(rs.getString("pkind"));
			p.setPname(rs.getString("pname"));
			p.setPtype(rs.getString("ptype"));
			p.setPrice(rs.getDouble("price"));
			p.setPcarriage(rs.getInt("pcarriage"));
			p.setPdate(rs.getDate("pdate"));
			p.setPaddress(rs.getString("paddress"));
			p.setPdescribed(rs.getString("pdescribed"));
			list.add(p);
		}
		return list;
		}
		
	}

}
