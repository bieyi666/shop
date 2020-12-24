package com.shop.service;

import com.shop.vo.OrderInfo;
import com.shop.vo.PageVo;
import com.shop.vo.StoreInfo;
import com.shop.vo.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderService {
//    public List<OrderInfo> userOrder();

    public PageVo<OrderInfo> userOrderPage(Integer uid,Integer state3,int page, int rows);


    //确认收货
    public int qdOrder(Integer orderid, Integer state3);



    /**
     * 通过商户编号 查询商户订单
     *
     * @param orderInfo
     * @return
     */
    public PageVo<OrderInfo> queryAllOrderInfoBySid(OrderInfo orderInfo, int page, int rows);


}
