package com.shop.dao;

import com.shop.vo.OrderInfo;

import java.util.List;

public interface OrderDao {
//    public List<OrderInfo> userOrder();


//    查询用户的订单信息
    public List<OrderInfo> userOrderPage();
//    查询用户订单信息总数
    public int userOrderPageCount();

}
