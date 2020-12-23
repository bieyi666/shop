package com.shop.service;

import com.shop.vo.OrderInfo;
import com.shop.vo.PageVo;
import com.shop.vo.StoreInfo;

import java.util.List;

public interface OrderService {
//    public List<OrderInfo> userOrder();

    public PageVo<OrderInfo> userOrderPage(int page, int rows);

    /**
     * 通过商户编号 查询商户订单
     * @param orderInfo
     * @return
     */
    public PageVo<OrderInfo> queryAllOrderInfoBySid(OrderInfo orderInfo,int page,int rows);
}
