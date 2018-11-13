package com.hwua.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * @ClassName: Items
 * @Description:TODO(商品)
 * @author: maple
 * @date: 2018年11月13日 下午8:52:13
 * 
 * @Copyright: 2018 www.hwua.com Inc. All rights reserved.
 *             注意：本内容仅限于海文科信息技术股份有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class Items {
	private Integer id;// 编号
	private String name;
	private Float price;
	private String pic;// 商品地址
	private Date createtime;// 商品创建时间
	private String detail;
	private List<Orderdetail> olist = new ArrayList<Orderdetail>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public List<Orderdetail> getOlist() {
		return olist;
	}

	public void setOlist(List<Orderdetail> olist) {
		this.olist = olist;
	}

}