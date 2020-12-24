package com.shop.service;

import com.github.pagehelper.PageHelper;
import com.shop.dao.OrderDao;
import com.shop.vo.OrderInfo;
import com.shop.vo.PageVo;
import com.shop.vo.StoreInfo;
import com.shop.vo.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public int qdOrder(Integer orderid, Integer state3) {
        return orderDao.qdOrder(orderid,state3);
    }


    /**
     * 通过商户编号 查询商户订单
     * @param orderInfo
     * @return
     */
    @Override
    public PageVo<OrderInfo> queryAllOrderInfoBySid(OrderInfo orderInfo,int page,int rows) {
        PageVo<OrderInfo> pageVo=new PageVo<>();
        PageHelper.startPage(page,rows);
        pageVo.setRows(orderDao.queryAllOrderInfoBySid(orderInfo));
        pageVo.setTotal(orderDao.queryCountOrderInfoBySid(orderInfo));
        return pageVo;
    }
}
