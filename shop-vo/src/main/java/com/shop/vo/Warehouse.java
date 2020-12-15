package com.shop.vo;

import lombok.Data;

/*仓库实体*/
@Data
public class Warehouse {
    private int id; //编号
    private String name; //名称
    private Float capacity; //容量
    private int tid; //仓库类型编号

    private WarehouseType warehouseType; //一个仓库对应一个类型
}
