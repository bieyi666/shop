package com.shop.controller;

import com.shop.service.StoreService;
import com.shop.vo.StoreInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

}
