package com.shop.dao;

import com.shop.vo.UserInfo;

import java.util.List;

//用户
public interface UserDao {

    /**
     * 查询所有用户信息
     * @return
     */
    public List<UserInfo> queryAllUser(UserInfo userInfo);

    /**
     * 添加用户
     * @param userInfo
     * @return
     */
    public int insertUserInfo(UserInfo userInfo);

    /**
     * 查询用户总数
     * @return
     */
    public int queryCountUser(UserInfo userInfo);
    /**
     * 查询当前手机号码是否存在
     */
    public UserInfo queryerUserInfo(UserInfo userInfo);



//--------------------------//前台//------------------------------------------
    /**
     * 前台个人中心页
     * 查询登录成功后的用户信息
     * uid 登录成功后存入sessio的用户id
     * return 用户信息
     */
    public UserInfo queryUserInfo(int uid);


    /**
     * 修改个人信息
     * @param userInfo
     * @return
     */
    public int editUserInfo(UserInfo userInfo);

//--------------------------------------------------------------------
}
