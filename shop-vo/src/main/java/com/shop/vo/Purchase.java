package com.shop.vo;

import lombok.Data;

//采购区
@Data
public class Purchase {
    private int id; //编号
    private int tid; //编号
    private String name; //名称
    private Float price; //价格
    private int state;
}
