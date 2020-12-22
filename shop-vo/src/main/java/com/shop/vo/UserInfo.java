package com.shop.vo;

import lombok.Data;

import java.util.List;

//用户实体
@Data
public class UserInfo {
    private int uid; //编号
    private String uName; //昵称
    private String phone; //号码
    private String password; //密码
    private String photo; //图片

    private List<OrderInfo> orderInfo;
}
