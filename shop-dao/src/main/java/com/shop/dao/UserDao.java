package com.shop.dao;

import com.shop.vo.UserInfo;
import com.shop.vo.userAddressVo;
import org.apache.ibatis.annotations.Param;

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


//    查询用户地址信息
    public List<userAddressVo> userAddress(Integer uid);

//    修改默认地址
    public int editUserAddress(@Param("shstoreid") Integer shstoreid, @Param("uid") Integer uid);

//    新增收货地址
    public int addUserAddress(@Param("uid") Integer uid,@Param("shstoreid") Integer shstoreid, @Param("tag") String tag);

    //删除收货地址
    public int delUserAddress(Integer aid);

//--------------------------------------------------------------------
}
