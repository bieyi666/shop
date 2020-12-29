package com.shop.controller;


import com.alibaba.fastjson.JSON;
import com.shop.service.OrderService;
import com.shop.vo.OrderInfo;
import com.shop.vo.PageVo;
import com.shop.vo.StoreInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@CrossOrigin
@Controller
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping("/userOrder.action")
    @ResponseBody
    public PageVo<OrderInfo> userOrderPage(Integer uid, Integer state3,
                                           @RequestParam(value = "page", defaultValue = "1") int page,
                                           @RequestParam(value = "rows", defaultValue = "1000") int rows) {
        return orderService.userOrderPage(uid, state3, page, rows);
    }

    @RequestMapping("/HStoreOrder.action")
    @ResponseBody
    public PageVo<StoreInfo> HStoreOrderPage(StoreInfo storeInfo,
                                             @RequestParam(value = "page", defaultValue = "1") int page,
                                             @RequestParam(value = "rows", defaultValue = "1000") int rows) {
        return orderService.HstoreOrderPage(storeInfo, page, rows);
    }

    @RequestMapping("/fahuoGiveStore.action")
    @ResponseBody
    public int fahuoGiveStore(String[] storeids){
        List<String> list = new ArrayList<>(Arrays.asList(storeids));
        return orderService.fahuoHorder(list);
    }

    /**
     * 通过商户编号 查询商户订单
     *
     * @param orderInfo
     * @return
     */
    @RequestMapping("/queryAllOrderInfoBySid.action")
    @ResponseBody
    public PageVo<OrderInfo> queryAllOrderInfoBySid(
                                                    @RequestParam(value = "state",defaultValue = "0") int state,
                                                    OrderInfo orderInfo,
                                                    Date orderTime1,
                                                    Date orderTime2,
                                                    @RequestParam(value = "page", defaultValue = "1") int page,
                                                    @RequestParam(value = "rows", defaultValue = "5") int rows) {
        System.out.println(orderInfo.getStoreid());
        return orderService.queryAllOrderInfoBySid(state,orderInfo, page, rows, orderTime1, orderTime2);
    }


    @RequestMapping("/HNoStateOrderPage.action")
    @ResponseBody
    public PageVo<OrderInfo> HNoStateOrderPage(OrderInfo orderInfo,
                                                    @RequestParam(value = "page", defaultValue = "1") int page,
                                                    @RequestParam(value = "rows", defaultValue = "10") int rows) {
        return orderService.HNoStateOrderPage(orderInfo, page, rows);
    }

    @RequestMapping(value = "inOrderInfo.action")
    @ResponseBody
    public int inOrderInfo(Integer uid, String str) {
        List<Map> list = (List<Map>) JSON.parse(str);
        return orderService.inOrderInfo(uid, list);
    }

    @RequestMapping(value = "inOrderInfo1.action")
    @ResponseBody
    public int inOrderInfo1(Integer uid, String str) {
        System.out.println(str);
        return 0;
    }
    /**
     * 根据商户信息 修改商户订单状态
     * @param orderInfo
     * @return
     */
    @RequestMapping(value = "/updateOrderInfoBySid.action",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String updateOrderInfoBySid(OrderInfo orderInfo) {
        int num=orderService.updateOrderInfoBySid(orderInfo);
        if (num > 0){
            return "修改成功";
        }
        return "修改失败";
    }

}
