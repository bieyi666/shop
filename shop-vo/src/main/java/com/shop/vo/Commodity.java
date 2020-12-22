package com.shop.vo;

import lombok.Data;

//商品实体
@Data
public class Commodity {
    private int cId; //编号
    private String cName; //名称
    private int tId; //类型编号
    private Float price; //价格
    private String picture; //主图片
    private String introduce; //介绍
    private int state; //状态 0：下架 1：上架
    private CommodityType commodityType; //一个商品对应一个类型
    private WarehouseGoods warehouseGoods;//一个商品对应一个仓库库存

    //    下面为供货商 ——————————————————————————————————————————————————————————————
    private int purchaseState; //状态 1：商品存在
    private Float purchasePrice; //供应商价格
}
