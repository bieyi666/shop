package com.shop.vo;

import lombok.Data;

//商品类型
@Data
public class CommodityType {
    private int tid; //编号
    private String tName; //类型
    private int ter; //二级菜单 一级父编号(tid)
    private int tsan; //三级菜单 二级父编号(tid)
}
