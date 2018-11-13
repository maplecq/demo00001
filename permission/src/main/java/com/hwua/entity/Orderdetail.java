package com.hwua.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: Orderdetail
 * @Description:TODO(������ϸ �м��)
 * @author: maple
 * @date: 2018��11��13�� ����8:57:02
 * 
 * @Copyright: 2018 www.hwua.com Inc. All rights reserved.
 *             ע�⣺�����ݽ����ں��Ŀ���Ϣ�����ɷ����޹�˾�ڲ����ģ���ֹ��й�Լ�������������ҵĿ
 */
public class Orderdetail {
	private Integer id; // ��Ʒ��ϸ���
	/**
	 * ������ ��� orders_id
	 */
	private List<Orders> orders = new ArrayList<Orders>();
	/**
	 * ��Ʒ�� ��� items_id
	 */
	private List<Items> items = new ArrayList<Items>();
	private Integer itemsNum;// ��Ʒ����

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Orderdetail(Integer id, List<Orders> orders, List<Items> items, Integer itemsNum) {
		super();
		this.id = id;
		this.orders = orders;
		this.items = items;
		this.itemsNum = itemsNum;
	}

	public Integer getItemsNum() {
		return itemsNum;
	}

	public void setItemsNum(Integer itemsNum) {
		this.itemsNum = itemsNum;
	}
}