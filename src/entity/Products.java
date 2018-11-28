package entity;

import java.util.Date;

//实体模型类
public class Products {

	private int pid;  // 商品编号
	private String pkind;  //商品种类
	private String pname;  //商品名称
	private String pimage;  //商品图片
	private String ptype;  //商品类型
	private double price;  //商品价格
	private int pcarriage;  //商品运费
	private Date pdate;  //商品生产日期
	private String paddress;  //商品产地
	private String pdescribed;  // 商品描述
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPkind() {
		return pkind;
	}
	public void setPkind(String pkind) {
		this.pkind = pkind;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPimage() {
		return pimage;
	}
	public void setPimage(String pimage) {
		this.pimage = pimage;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPcarriage() {
		return pcarriage;
	}
	public void setPcarriage(int pcarriage) {
		this.pcarriage = pcarriage;
	}
	public Date getPdate() {
		return pdate;
	}
	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	public String getPdescribed() {
		return pdescribed;
	}
	public void setPdescribed(String pdescribed) {
		this.pdescribed = pdescribed;
	}
	
}
