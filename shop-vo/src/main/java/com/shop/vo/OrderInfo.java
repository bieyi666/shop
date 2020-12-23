package com.shop.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class OrderInfo {
    private Integer orderid;
    private Integer uid;
    private Integer storeid;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date orderTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date receiptTime;

    private Integer state1;
    private Integer state2;
    private Integer state3;
    private List<OrderGoods> orderGoods; //一个订单对应多个商品
    private UserInfo userInfo; //一个订单对应一个用户
    private StoreInfo storeInfo; //一个订单对应一个商户
}
