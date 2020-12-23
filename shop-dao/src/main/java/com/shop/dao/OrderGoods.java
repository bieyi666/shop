package com.shop.dao;

import java.util.List;

/**
 * 订单商品
 */
public interface OrderGoods {


    /**
     * 查询所有订单商品
     * @param OrderGoods
     * @return
     */
    public List<OrderGoods> queryAllOrderGoods(OrderGoods OrderGoods);

}
