package com.shop.controller;


import com.alibaba.druid.support.json.JSONUtils;
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@Controller
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping("/userOrder.action")
    @ResponseBody
    public PageVo<OrderInfo> userOrderPage(Integer uid,Integer state3,
                                           @RequestParam(value = "page", defaultValue = "1") int page,
                                           @RequestParam(value = "rows", defaultValue = "15") int rows) {
        return orderService.userOrderPage(uid,state3,page, rows);
    }

    @RequestMapping("/qdOrder.action")
    @ResponseBody
    public Map qdOrder(Integer orderid, Integer state3) {
        Map<String, Object> map = new HashMap<String, Object>();

        int num = orderService.qdOrder(orderid, state3);
        if (num == 1) {
            map.put("code", "0");
            map.put("msg", "确认收货");
        } else {
            map.put("code", "1");
            map.put("msg", "确认收货失败");
        }
        return map;
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
                                                    @RequestParam(value = "page", defaultValue = "1") int page,
                                                    @RequestParam(value = "rows", defaultValue = "5") int rows) {
        return orderService.queryAllOrderInfoBySid(orderInfo, page, rows);
    }

}
