package com.hwua.dao;

import com.hwua.entity.sysUser;

public interface sysUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(sysUser record);

    int insertSelective(sysUser record);

    sysUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(sysUser record);

    int updateByPrimaryKey(sysUser record);
}