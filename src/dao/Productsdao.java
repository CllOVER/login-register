package dao;

import java.util.List;
import entity.Products;

public interface Productsdao {

	void save(Products obj);  //添加商品
	
	void update(Products obj);  //修改商品信息
	
	void delete(int id);  //通过id删除
	
	List<Products> getAll(); //多条完整查询
	
	List<Products> gettypeAll(String ptype); //根据类型查询
	
	
}
