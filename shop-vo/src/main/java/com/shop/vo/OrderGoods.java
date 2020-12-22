package com.shop.vo;

import lombok.Data;

@Data
public class OrderGoods {
    private Integer id;
    private Integer orderid;
    private Commodity commodity;
    private Integer number;
}
