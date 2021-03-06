package com.shop.dao;

import com.shop.vo.OrderInfo;
import com.shop.vo.StoreInfo;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface OrderDao {
//    public List<OrderInfo> userOrder();


//    查询用户的订单信息
    public List<OrderInfo> userOrderPage(@Param("uid") Integer uid,@Param("state3") Integer state3);
//    查询用户订单信息总数
    public int userOrderPageCount(@Param("uid") Integer uid,@Param("state3") Integer state3);

    public int qdOrder(@Param("orderid")int orderid,@Param("state3")int state3);

//配送管理
//    查询商户下的订单并发货
    public List<StoreInfo> HstoreOrderPage(StoreInfo storeInfo);

    public int HstoreOrderPageCount(StoreInfo storeInfo);
//    查询总店未发货订单
    public List<OrderInfo> HNoStateOrderPage(OrderInfo orderInfo);

    public int HNoStateOrderPageCount(OrderInfo orderInfo);
//发货修改总店状态
    public int fahuoHorder(List<String> list);



    /**
     * 通过商户编号 查询商户订单
     * @param orderInfo
     * @return
     */
    public List<OrderInfo> queryAllOrderInfoBySid(
            @Param("state") int state,
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
            @Param("state") int state,
            @Param("order") OrderInfo orderInfo,
            @Param("time1") Date orderTime1,
            @Param("time2") Date orderTime2);


    /**
     * 根据商户信息 修改商户订单状态
     * @param orderInfo
     * @return
     */
    public int updateOrderInfoBySid(OrderInfo orderInfo);



    /**
     * 添加订单
     * @param orderInfo
     * @return
     */
    public int inOrderInfo(OrderInfo orderInfo);

    /**
     * 添加订单的商品
     * @param list
     * @return
     */
    public int inOrderGoods(List<Map> list);

    /**
     * 支付成功改状态
     * @param orderId
     * @return
     */
    public int upOrderInfo(Integer orderId);
}
