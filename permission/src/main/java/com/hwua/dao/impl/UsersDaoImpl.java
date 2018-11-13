package com.hwua.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hwua.dao.UsersMapper;
import com.hwua.entity.Users;

public class UsersDaoImpl extends SqlSessionDaoSupport implements UsersMapper {

	public int deleteByPrimaryKey(Integer id) {
		return 0;
	}

	public int insert(Users record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insertSelective(Users record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Users selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.getSqlSession().getMapper(UsersMapper.class).selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(Users record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKey(Users record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
