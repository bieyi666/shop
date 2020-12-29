package com.shop.vo;

import lombok.Data;

//商品图库
@Data
public class CommodityPrint {
    private int id; //图库编号
    private int cId; //商品编号
    private String picture; //图片
}
