package com.shop.vo;

import lombok.Data;

import java.util.List;

//商家实体
@Data
public class StoreInfo {
    private int storeId; //编号
    private Integer uId; //用户编号
    private String name; //名称
    private String phone; //联系电话
    private String address; //地址
    private String photo; //图片
    private int state; //状态(0:待审核1:商家2:已删除)
    private String msg; //备注信息

    private List<OrderInfo> orderInfo;//一个商户对应多个订单
}
