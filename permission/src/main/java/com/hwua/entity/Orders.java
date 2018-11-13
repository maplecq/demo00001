package com.hwua.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * @ClassName: Orders
 * @Description:TODO(������)
 * @author: maple
 * @date: 2018��11��13�� ����8:59:45
 * 
 * @Copyright: 2018 www.hwua.com Inc. All rights reserved.
 *             ע�⣺�����ݽ����ں��Ŀ���Ϣ�����ɷ����޹�˾�ڲ����ģ���ֹ��й�Լ�������������ҵĿ
 */
public class Orders {
	private Integer id;// ����
	private Users users;// �µ��û� ���user_id
	private String number; // �������
	private Date createtime;// ��������ʱ��
	private String note;// ��������
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