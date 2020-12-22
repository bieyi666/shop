package com.shop.controller;

import com.shop.service.StoreService;
import com.shop.utils.ImageUpload;
import com.shop.vo.StoreInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

//商户
@Controller
public class StoreController {

    @Autowired
    StoreService storeService;

    /**
     * 根据用户编号 查询商户信息
     * @param uid
     * @return
     */
    @CrossOrigin //跨域
    @RequestMapping("/queryStoreByUid.action")
    @ResponseBody
    public StoreInfo queryStoreByUid(int uid) {
        return storeService.queryStoreByUid(uid);
    }

    /**
     * 根据商户编号 修改商户信息
     * @param storeInfo
     * @return
     */
    @CrossOrigin //跨域
    @RequestMapping("/updateStoreInfoBySid.action")
    @ResponseBody
    public int updateStoreInfoBySid(HttpServletRequest request,StoreInfo storeInfo, MultipartFile image) {
        ImageUpload imageUpload=new ImageUpload();
        imageUpload.save_image(image);
        return storeService.updateStoreInfoBySid(storeInfo);
    }

}
