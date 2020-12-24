package com.shop.dao;

import com.shop.vo.OrderInfo;
import com.shop.vo.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDao {
//    public List<OrderInfo> userOrder();


//    查询用户的订单信息
    public List<OrderInfo> userOrderPage(@Param("uid")Integer uid,@Param("state3")Integer state3);
//    查询用户订单信息总数
    public int userOrderPageCount(@Param("uid")Integer uid,@Param("state3")Integer state3);

    /**
     * 通过商户编号 查询商户订单
     * @param orderInfo
     * @return
     */
    public List<OrderInfo> queryAllOrderInfoBySid(OrderInfo orderInfo);

    /**
     * 查询商户订单总条数
     * @param orderInfo
     * @return
     */
    public int queryCountOrderInfoBySid(OrderInfo orderInfo);



//    确认收货
    public int qdOrder(@Param("orderid") Integer orderid, @Param("state3")Integer state3);

}
