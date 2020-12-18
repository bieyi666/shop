package com.shop.vo;

import lombok.Data;

import java.util.List;

/**
 * @author "can"
 */
@Data
public class Emp {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private String phone;
    private String address;
    private String img;
    private List<Role> roles;
}
