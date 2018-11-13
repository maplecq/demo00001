package com.hwua.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: Orderdetail
 * @Description:TODO(订单明细 中间表)
 * @author: maple
 * @date: 2018年11月13日 下午8:57:02
 * 
 * @Copyright: 2018 www.hwua.com Inc. All rights reserved.
 *             注意：本内容仅限于海文科信息技术股份有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class Orderdetail {
	private Integer id; // 商品详细编号
	/**
	 * 订单表 外键 orders_id
	 */
	private List<Orders> orders = new ArrayList<Orders>();
	/**
	 * 商品表 外键 items_id
	 */
	private List<Items> items = new ArrayList<Items>();
	private Integer itemsNum;// 商品数量

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