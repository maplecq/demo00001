package com.hwua.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * @ClassName: Orders
 * @Description:TODO(订单表)
 * @author: maple
 * @date: 2018年11月13日 下午8:59:45
 * 
 * @Copyright: 2018 www.hwua.com Inc. All rights reserved.
 *             注意：本内容仅限于海文科信息技术股份有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class Orders {
	private Integer id;// 主键
	private Users users;// 下单用户 外键user_id
	private String number; // 订单编号
	private Date createtime;// 订单创建时间
	private String note;// 订单描述
	/**
	 * Orders--Orderdetail n-n
	 */
	private List<Orderdetail> orderdetails = new ArrayList<Orderdetail>();

	public List<Orderdetail> getOrderdetails() {
		return orderdetails;
	}

	public void setOrderdetails(List<Orderdetail> orderdetails) {
		this.orderdetails = orderdetails;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number == null ? null : number.trim();
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note == null ? null : note.trim();
	}
}