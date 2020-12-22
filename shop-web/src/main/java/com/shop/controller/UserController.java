package com.shop.controller;

import com.shop.service.UserService;
import com.shop.vo.PageVo;
import com.shop.vo.UserInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

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
    public PageVo<UserInfo> queryAllUser(UserInfo userInfo,@RequestParam(value = "page",defaultValue = "1") int page,
                                         @RequestParam(value = "rows",defaultValue = "5") int rows) {
        System.out.println(userInfo);
        return userService.queryAllUser(userInfo,page,rows);
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

    //登录是查询手机号码与密码是否相同
    @CrossOrigin //跨域
    @RequestMapping(value = "/queryerUserInfo.action")
    @ResponseBody
    public Map queryerUserInfo(UserInfo userInfo,HttpSession session){
        Map<String,String> map =new HashMap<String,String>();
        System.out.println(1);
        //判断密码是否为空
        if(userInfo.getPassword()!=null){
            //md5加密
            Md5Hash md5Hash=new Md5Hash(userInfo.getPassword(),"哥谭市",5);
            userInfo.setPassword(md5Hash+"");
            System.out.println(3);
            /*System.out.println(md5Hash);*/
        }
        //调用查询方法
        UserInfo userInfo1=userService.queryerUserInfo(userInfo);
        System.out.println("拿到数据"+userInfo);
        if(userInfo1!=null){
            session.setAttribute("user",userInfo1);
            map.put("code","0");
            map.put("msg","登录成功");
            map.put("username",userInfo1.getPhone());
        }else{
            map.put("code","1");
            map.put("msg","登录失败");
            //map.put("username","test");
        }
        return map;
    }
    //添加用户
    @CrossOrigin //跨域
    @RequestMapping(value = "/insertUserInfo.action")
    @ResponseBody
    public Map insertUserInfo(UserInfo userInfo){
        Map<String,String> map =new HashMap<String,String>();
        //md5加密
        Md5Hash md5Hash=new Md5Hash(userInfo.getPassword(),"哥谭市",5);
        System.out.println(md5Hash);
        userInfo.setPassword(md5Hash+"");
        System.out.println(userInfo);
        //调用添加方法
        int num=userService.insertUserInfo(userInfo);
        if(num==1){
            map.put("code","0");
            map.put("msg","注册成功");
        }else{
            map.put("code","1");
            map.put("msg","注册失败");
        }
        return map;
    }

}
