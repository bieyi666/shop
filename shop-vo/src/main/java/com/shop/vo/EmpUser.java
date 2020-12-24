package com.shop.vo;

import lombok.Data;

/**
 * @author "can"
 */
@Data
public class EmpUser {
    private Integer eid;
    private String username;
    private String password;
    private Emp emp;
}
