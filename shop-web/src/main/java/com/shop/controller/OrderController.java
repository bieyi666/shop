package com.shop.controller;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.shop.service.OrderService;
import com.shop.vo.OrderInfo;
import com.shop.vo.PageVo;
import com.shop.vo.StoreInfo;
import com.shop.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@CrossOrigin
@Controller
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping("/userOrder.action")
    @ResponseBody
    public PageVo<OrderInfo> userOrderPage(Integer uid,Integer state3,
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "rows", defaultValue = "5") int rows) {

        PageVo<OrderInfo> page1 = orderService.userOrderPage(uid,state3,page, rows);
        System.out.println("-------------------------------" + page1.toString());
        return orderService.userOrderPage(uid,state3,page, rows);
    }


    /**
     * 通过商户编号 查询商户订单
     *
     * @param orderInfo
     * @return
     */
    @RequestMapping("/queryAllOrderInfoBySid.action")
    @ResponseBody
    public PageVo<OrderInfo> queryAllOrderInfoBySid(OrderInfo orderInfo,
                                                    Date orderTime1,
                                                    Date orderTime2,
                                                    @RequestParam(value = "page", defaultValue = "1") int page,
                                                    @RequestParam(value = "rows", defaultValue = "5") int rows) {
        System.out.println(orderInfo.getStoreid());
        return orderService.queryAllOrderInfoBySid(orderInfo, page, rows, orderTime1, orderTime2);
    }

}
