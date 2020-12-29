package com.shop.service;

import com.shop.vo.PageVo;
import com.shop.vo.UserInfo;
import com.shop.vo.userAddressVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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


    //    查询用户地址信息
    public List<userAddressVo> userAddress(Integer uid);

    //修改默认地址
    public int editUserAddress(Integer shstoreid,Integer uid);

    //    新增收货地址
    public int addUserAddress(Integer uid,Integer shstoreid,String tag);

    //删除收货地址
    public int delUserAddress(Integer aid);
}
