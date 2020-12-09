package com.shop.service;

import com.shop.vo.PageVo;
import com.shop.vo.UserInfo;

//用户
public interface UserService {

    /**
     * 查询所有用户信息
     * @param page 当前页
     * @param rows 一页几条数据
     * @return
     */
    public PageVo<UserInfo> queryAllUser(int page,int rows);
}
