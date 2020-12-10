package com.shop.vo;

import lombok.Data;

//仓库商品
@Data
public class WarehouseGoods {
    private int id; //编号
    private int cId; //商品编号
    private int wId; //仓库编号
    private int stock; //存量
}
