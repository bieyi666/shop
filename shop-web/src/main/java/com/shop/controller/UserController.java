package com.shop.controller;

import com.shop.service.UserService;
import com.shop.utils.ImageUpload;
import com.shop.vo.PageVo;
import com.shop.vo.UserInfo;
import com.shop.vo.userAddressVo;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//用户
@Controller
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 查询所有用户信息
     *
     * @param page 当前页
     * @param rows 一页几条数据
     * @return
     */
    @CrossOrigin //跨域
    @RequestMapping("/queryAllUser.action")
    @ResponseBody
    public PageVo<UserInfo> queryAllUser(UserInfo userInfo, @RequestParam(value = "page", defaultValue = "1") int page,
                                         @RequestParam(value = "rows", defaultValue = "5") int rows) {
        return userService.queryAllUser(userInfo, page, rows);
    }

    /**
     * @param uid
     * @return
     */
    @CrossOrigin //跨域
    @RequestMapping("/queryUserInfo.action")
    @ResponseBody
    public UserInfo queryUserInfo(int uid) {
        UserInfo userInfo = userService.queryUserInfo(uid);
        return userInfo;
    }
    @CrossOrigin //跨域
    @RequestMapping(value = "/QeditUserInfo.action")
    @ResponseBody
    public Map QeditUserInfo(UserInfo userInfo, MultipartFile img,String uname) {
        userInfo.setUName(uname);
        Map<String, Object> map = new HashMap<String, Object>();
        ImageUpload imageUpload = new ImageUpload();
        int num = 0;
        if(img == null){
            num = userService.editUserInfo(userInfo);
        }else{
            String imgName = imageUpload.save_image(img);
            userInfo.setPhoto(imgName);
        }
        num = userService.editUserInfo(userInfo);
        if (num == 1) {
            map.put("code", "0");
            map.put("msg", "修改成功");
        } else {
            map.put("code", "1");
            map.put("msg", "修改失败");
        }
        return map;
    }

    //登录是查询手机号码与密码是否相同
    @CrossOrigin //跨域
    @RequestMapping(value = "/queryerUserInfo.action")
    @ResponseBody
    public Map queryerUserInfo(UserInfo userInfo, HttpSession session) {
        Map<String, Object> map = new HashMap<String, Object>();
        if(userInfo.getPassword()!=null){
            Md5Hash md5Hash = new Md5Hash(userInfo.getPassword(), "哥谭市", 5);
            userInfo.setPassword(md5Hash + "");
            System.out.println(md5Hash);
        }
        UserInfo userInfo1 = userService.queryerUserInfo(userInfo);
        System.out.println("拿到数据" + userInfo);
        if (userInfo1 != null) {
            session.setAttribute("user", userInfo1);
            map.put("code", "0");
            map.put("msg", "登录成功");
            map.put("username", userInfo1.getPhone());
            map.put("uid", userInfo1.getUid());
            map.put("shstoreid", userInfo1.getShstoreid());
        } else {
            map.put("code", "1");
            map.put("msg", "登录失败");
            //map.put("username","test");
        }
        return map;
    }

    //添加用户
    @CrossOrigin //跨域
    @RequestMapping(value = "/insertUserInfo.action")
    @ResponseBody
    public Map insertUserInfo(UserInfo userInfo) {
        Map<String, String> map = new HashMap<String, String>();
        Md5Hash md5Hash = new Md5Hash(userInfo.getPassword(), "哥谭市", 5);
        System.out.println(md5Hash);
        userInfo.setPassword(md5Hash + "");
        System.out.println(userInfo);
        int num = userService.insertUserInfo(userInfo);
        if (num == 1) {
            map.put("code", "0");
            map.put("msg", "注册成功");
        } else {
            map.put("code", "1");
            map.put("msg", "注册失败");
        }
        return map;
    }


//    查询用户地址
    @CrossOrigin //跨域
    @RequestMapping("/queryUserAddress.action")
    @ResponseBody
    public List<userAddressVo> queryUserAddress(Integer uid){
        return userService.userAddress(uid);
    }

    //修改默认地址
    @CrossOrigin //跨域
    @RequestMapping("/editUserAddress.action")
    @ResponseBody
    public int editUserAddress(Integer shstoreid,Integer uid){
        return userService.editUserAddress(shstoreid,uid);
    }

//    新增收货地址
    @CrossOrigin //跨域
    @RequestMapping("/addUserAddress.action")
    @ResponseBody
    public int addUserAddress(Integer uid,Integer shstoreid,String tag){
        return userService.addUserAddress(uid,shstoreid,tag);
    }

    //删除收货地址
    @CrossOrigin //跨域
    @RequestMapping("/delUserAddress.action")
    @ResponseBody
    public int delUserAddress(Integer aid){
        return userService.delUserAddress(aid);
    }

}
