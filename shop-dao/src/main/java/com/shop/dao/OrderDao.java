package com.shop.dao;

import com.shop.vo.OrderInfo;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface OrderDao {
//    public List<OrderInfo> userOrder();


//    查询用户的订单信息
    public List<OrderInfo> userOrderPage(@Param("uid") Integer uid,@Param("state3") Integer state3);
//    查询用户订单信息总数
    public int userOrderPageCount(@Param("uid") Integer uid,@Param("state3") Integer state3);

    public int qdOrder(@Param("orderid")int orderid,@Param("state3")int state3);


    /**
     * 通过商户编号 查询商户订单
     * @param orderInfo
     * @return
     */
    public List<OrderInfo> queryAllOrderInfoBySid(
            @Param("order") OrderInfo orderInfo,
            @Param("time1") Date orderTime1,
            @Param("time2") Date orderTime2);

    /**
     *
     * @param orderInfo
     * @param orderTime1
     * @param orderTime2
     * @return
     */
    public int queryCountOrderInfoBySid(
            @Param("order") OrderInfo orderInfo,
            @Param("time1") Date orderTime1,
            @Param("time2") Date orderTime2);


}
