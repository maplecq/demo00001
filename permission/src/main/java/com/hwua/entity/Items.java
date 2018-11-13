package com.hwua.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * @ClassName: Items
 * @Description:TODO(��Ʒ)
 * @author: maple
 * @date: 2018��11��13�� ����8:52:13
 * 
 * @Copyright: 2018 www.hwua.com Inc. All rights reserved.
 *             ע�⣺�����ݽ����ں��Ŀ���Ϣ�����ɷ����޹�˾�ڲ����ģ���ֹ��й�Լ�������������ҵĿ
 */
public class Items {
	private Integer id;// ���
	private String name;
	private Float price;
	private String pic;// ��Ʒ��ַ
	private Date createtime;// ��Ʒ����ʱ��
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