package com.shop.vo;

import lombok.Data;

import java.util.List;

/**
 * @author "can"
 */
@Data
public class ShoppingCat {

    private Integer id;
    private Integer uid;
    /**
     * 商品   购物车需要的字段  商品名，商品类型名，商品库存，商品价格，商品图片名
     */
    private Commodity commodity;
    /**
     * 商品类型名集合
     */
    private List<String> commodityTypes;
    private Integer tid;
    private Integer number;
}
