package com.shop.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

//用户实体
@Data
public class UserInfo {
    private Integer uid; //编号
    private String uName; //昵称
    private String phone; //号码
    private String password; //密码
    private String photo; //图片

    private List<OrderInfo> orderInfo;//一个用户对应多个订单
}
