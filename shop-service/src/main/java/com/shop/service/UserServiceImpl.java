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
    public PageVo<UserInfo> queryAllUser(int page, int rows) {
        PageVo<UserInfo> pageVo=new PageVo<>();
        PageHelper.startPage(page,rows);
        pageVo.setRows(userDao.queryAllUser());
        pageVo.setTotal(userDao.queryCountUser());
        return pageVo;
    }
}
