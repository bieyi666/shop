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
    public PageVo<UserInfo> queryAllUser(UserInfo userInfo,int page,int rows);

    /**
     * 添加用户
     * @param userInfo
     * @return
     */
    public int insertUserInfo(UserInfo userInfo);
    /**
     * 查询当前手机号码是否存在
     */
    public UserInfo queryerUserInfo(UserInfo userInfo);


    /**
     * 查询登录后的用户信息
     * @param uid 用户id
     * @return 用户vo
     */
    public UserInfo queryUserInfo(int uid);

    /**
     * 修改个人信息
     * @param userInfo
     * @return
     */
    public int editUserInfo(UserInfo userInfo);
}
