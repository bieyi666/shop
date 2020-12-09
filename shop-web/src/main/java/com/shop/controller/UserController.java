package com.shop.controller;

import com.github.pagehelper.PageHelper;
import com.shop.service.UserService;
import com.shop.vo.PageVo;
import com.shop.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//用户
@Controller
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 查询所有用户信息
     * @param page 当前页
     * @param rows 一页几条数据
     * @return
     */
    @CrossOrigin //跨域
    @RequestMapping("/queryAllUser.action")
    @ResponseBody
    public PageVo<UserInfo> queryAllUser(@RequestParam(value = "page",defaultValue = "1") int page,
                                         @RequestParam(value = "rows",defaultValue = "5") int rows) {
        return userService.queryAllUser(page,rows);
    }

}
