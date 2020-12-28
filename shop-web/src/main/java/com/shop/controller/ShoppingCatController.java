package com.shop.controller;

import com.alibaba.fastjson.JSON;
import com.shop.service.ShoppingCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author "can"
 */
@RestController
@CrossOrigin
public class ShoppingCatController {

    @Autowired
    private ShoppingCatService shoppingCatService;

    @RequestMapping(value = "seShoppingCat.action")
    public List<List<Map>> seShoppingCat(Integer uid) {
        return shoppingCatService.seShoppingCat(uid);
    }

    @RequestMapping(value = "delShoppingCat.action")
    public boolean delShoppingCat(Integer id) {
        return shoppingCatService.delShoppingCat(id);
    }

    @RequestMapping(value = "delShoppingCatBat.action")
    public boolean delShoppingCatBat(String str) {
        List<Integer> list = JSON.parseArray(str, Integer.class);
        return shoppingCatService.delShoppingCatBat(list);
    }

    @RequestMapping(value = "inShoppingCat.action")
    public boolean inShoppingCat(Integer uid, Integer tid, Integer sid, Integer inventory) {
        return shoppingCatService.inShoppingCat(uid, tid, sid, 1, inventory);
    }

    @RequestMapping(value = "upShoppingCatGoodsNum.action")
    public boolean upShoppingCatGoodsNum(Integer uid, Integer sid) {
        return shoppingCatService.upShoppingCatGoodsNum(uid, sid);
    }


}
