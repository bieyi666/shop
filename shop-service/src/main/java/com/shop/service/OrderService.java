package com.shop.service;

import com.shop.vo.OrderInfo;
import com.shop.vo.PageVo;
import com.shop.vo.StoreInfo;
import com.shop.vo.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface OrderService {
//    public List<OrderInfo> userOrder();

    public PageVo<OrderInfo> userOrderPage(Integer uid,Integer state3,int page, int rows);


    public PageVo<StoreInfo> HstoreOrderPage(StoreInfo storeInfo,int page, int rows);

    public PageVo<OrderInfo> HNoStateOrderPage(OrderInfo orderInfo,int page, int rows);

//    总店发货到商户
    public int fahuoHorder(List<String> storeids);

    //确认收货
    public int qdOrder(Integer orderid, Integer state3);




    /**
     * 通过商户编号 查询商户订单
     *
     * @param orderInfo
     * @return
     */
    public PageVo<OrderInfo> queryAllOrderInfoBySid(int state,OrderInfo orderInfo, int page, int rows, Date orderTime1, Date orderTime2);


    /**
     * 根据商户信息 修改商户订单状态
     * @param orderInfo
     * @return
     */
    public int updateOrderInfoBySid(OrderInfo orderInfo);


    /**
     * 添加订单
     * @param uid
     * @param list
     * @return
     */
    public int inOrderInfo(Integer uid, List<Map> list,Integer storeid);

    /**
     * 支付成功
     * @param orderId
     * @return
     */
    public Boolean upOrderInfo(Integer orderId);
}
