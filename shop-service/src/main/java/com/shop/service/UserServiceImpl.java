package com.shop.service;

import com.github.pagehelper.PageHelper;
import com.shop.dao.UserDao;
import com.shop.vo.PageVo;
import com.shop.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//用户
@Service
public class UserServiceImpl implements UserService
{

    @Autowired
    UserDao userDao;


    /**
     * 查询所有用户信息
     * @param page 当前页
     * @param rows 一页几条数据
     * @return
     */
    @Override
    public PageVo<UserInfo> queryAllUser(UserInfo userInfo,int page, int rows) {
        PageVo<UserInfo> pageVo=new PageVo<>();
        PageHelper.startPage(page,rows);
        pageVo.setRows(userDao.queryAllUser(userInfo));
        pageVo.setTotal(userDao.queryCountUser(userInfo));
        return pageVo;
    }

    /**
     * 用户添加
     * @param userInfo
     * @return
     */
    @Override
    public int insertUserInfo(UserInfo userInfo) {
        return userDao.insertUserInfo(userInfo);
    }

    /**
     * 查询该注册号码是否存在
     * @param userInfo
     * @return
     */
    @Override
    public UserInfo queryerUserInfo(UserInfo userInfo) {
        UserInfo userInfo1=userDao.queryerUserInfo(userInfo);
        return userInfo1;
    }

    /**
     * 查询登录后的用户信息
     * @param uid 用户id
     * @return 用户vo
     */
    public UserInfo queryUserInfo(int uid){
        UserInfo userInfo = userDao.queryUserInfo(uid);
        return userInfo;
    }
    @Override
    public int editUserInfo(UserInfo userInfo) {
        int num = userDao.editUserInfo(userInfo);
        return num;
    }
}
