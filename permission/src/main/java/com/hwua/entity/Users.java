package com.hwua.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * @ClassName: Users
 * @Description:TODO(普通用户 比如下单用户)
 * @author: maple
 * @date: 2018年11月13日 下午9:03:03
 * 
 * @Copyright: 2018 www.hwua.com Inc. All rights reserved.
 *             注意：本内容仅限于海文科信息技术股份有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class Users {
	private Integer id;
	private String username;
	private Date birthday;
	private String sex;
	private String address;
	/**
	 * Users--Orders 1-n
	 */
	private List<Orders> orders = new ArrayList<Orders>();

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex == null ? null : sex.trim();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}
}