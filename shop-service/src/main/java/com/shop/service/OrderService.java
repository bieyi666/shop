package com.shop.service;

import com.shop.vo.OrderInfo;
import com.shop.vo.PageVo;
import com.shop.vo.StoreInfo;

import java.util.List;

public interface OrderService {
//    public List<OrderInfo> userOrder();

    public PageVo<OrderInfo> userOrderPage(int page, int rows);
}
