package com.shop.dao;

import com.shop.vo.UserInfo;

import java.util.List;

//用户
public interface UserDao {

    /**
     * 查询所有用户信息
     * @return
     */
    public List<UserInfo> queryAllUser();

    /**
     * 查询用户总数
     * @return
     */
    public int queryCountUser();
}
