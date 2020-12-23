package com.shop.vo;

import lombok.Data;

@Data
public class OrderGoods {
    private Integer id;
    private Integer orderid; //订单编号
    private Integer goodsid; //商品编号
    private Integer number;

    private Commodity commodity; //一个订单商品对应 一个商品
}
