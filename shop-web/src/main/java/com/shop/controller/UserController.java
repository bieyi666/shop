package com.shop.controller;

import com.shop.service.UserService;
import com.shop.vo.PageVo;
import com.shop.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpSession;

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

    /**
     * 模仿用户登录
     * @param userInfo 制造一个假的用户信息
     * @param session 存入准备好的userInfo
     * @return
     */
    @CrossOrigin //跨域
    @RequestMapping("/userLoginTest.action")
    @ResponseBody
    public String userLoginTest(UserInfo userInfo, HttpSession session){
        //模仿登录登录成功

        UserInfo userInfo1 = new UserInfo();

        userInfo1.setUid(2);
        userInfo1.setUName("李四");
        userInfo1.setPhone("13915546358");
        userInfo1.setPassword("12345");
        userInfo1.setPhoto("./src/assets/image/1601080951299.jpg");

        if(userInfo1!=null){
            session.setAttribute("userInfo1Test", userInfo1);
            return "登录成功";
        }
        return "登录失败";
    }


    /**
     *
     * @param uid
     * @return
     */
    @CrossOrigin //跨域
    @RequestMapping("/queryUserInfo.action")
    @ResponseBody
    public UserInfo queryUserInfo(int uid){
        UserInfo userInfo = userService.queryUserInfo(uid);
        return userInfo;

    }


    @CrossOrigin //跨域
    @RequestMapping(value = "/editUserInfo.action")
    @ResponseBody
    public int editUserInfo(UserInfo userInfo){
        int num = userService.editUserInfo(userInfo);

        System.out.println("控制层接收到的参数:"+userInfo);

        return num;

    }


}
