package com.shop.vo;

import lombok.Data;

/**
 * 统计
 */
@Data
public class Statistics {
    private Integer month; //月份
    private Float sale; //总销售额
    private Float rental; //总收入
    private Float storeRental; //商户收入
    private Float netRental; //净收入
}
