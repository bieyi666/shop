package com.shop.service;

import com.github.pagehelper.PageHelper;
import com.shop.dao.OrderDao;
import com.shop.vo.OrderInfo;
import com.shop.vo.PageVo;
import com.shop.vo.StoreInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService
{
    @Autowired
    OrderDao orderDao;

    @Override
    public PageVo<OrderInfo> userOrderPage(Integer uid,Integer state3, int page, int rows) {
        PageVo<OrderInfo> pageVo=new PageVo<>();
        PageHelper.startPage(page,rows);
        pageVo.setRows(orderDao.userOrderPage(uid,state3));
        pageVo.setTotal(orderDao.userOrderPageCount(uid,state3));
        return pageVo;
    }

    @Override
    public PageVo<StoreInfo> HstoreOrderPage(StoreInfo storeInfo, int page, int rows) {
        PageVo<StoreInfo> pageVo=new PageVo<>();
        PageHelper.startPage(page,rows);
        pageVo.setRows(orderDao.HstoreOrderPage(storeInfo));
        pageVo.setTotal(orderDao.HstoreOrderPageCount(storeInfo));
        return pageVo;
    }

    @Override
    public PageVo<OrderInfo> HNoStateOrderPage(OrderInfo orderInfo, int page, int rows) {
        PageVo<OrderInfo> pageVo=new PageVo<>();
        PageHelper.startPage(page,rows);
        pageVo.setRows(orderDao.HNoStateOrderPage(orderInfo));
        pageVo.setTotal(orderDao.HNoStateOrderPageCount(orderInfo));
        return pageVo;
    }

    @Override
    public int fahuoHorder(List<String> storeids) {
        return orderDao.fahuoHorder(storeids);
    }

    @Override
    public int qdOrder(Integer orderid, Integer state3) {
        return orderDao.qdOrder(orderid,state3);
    }

    /**
     * 通过商户编号 查询商户订单
     * @param orderInfo
     * @return
     */
    @Override
    public PageVo<OrderInfo> queryAllOrderInfoBySid(int state,OrderInfo orderInfo, int page, int rows, Date orderTime1, Date orderTime2) {
        PageVo<OrderInfo> pageVo=new PageVo<>();
        PageHelper.startPage(page,rows);
        pageVo.setRows(orderDao.queryAllOrderInfoBySid(state,orderInfo,orderTime1,orderTime2));
        pageVo.setTotal(orderDao.queryCountOrderInfoBySid(state,orderInfo,orderTime1,orderTime2));
        return pageVo;
    }

    /**
     * 根据商户信息 修改商户订单状态
     * @param orderInfo
     * @return
     */
    @Override
    public int updateOrderInfoBySid(OrderInfo orderInfo) {
        return orderDao.updateOrderInfoBySid(orderInfo);
    }

    @Override
    public int inOrderInfo(Integer uid, List<Map> list) {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setUid(uid);
        int result = orderDao.inOrderInfo(orderInfo);
        if (result < 1) {
            return 0;
        }
        for (Map m : list) {
            m.put("orderid", orderInfo.getOrderid());
        }
        result = orderDao.inOrderGoods(list);
        if (result < 1) {
            return 0;
        }
        return orderInfo.getOrderid();
    }

    @Override
    public Boolean upOrderInfo(Integer orderId) {
        return orderDao.upOrderInfo(orderId) > 0;
    }
}
