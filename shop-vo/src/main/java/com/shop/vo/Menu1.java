package com.shop.vo;

import lombok.Data;

import java.util.List;

/**
 * @author "can"
 */
@Data
public class Menu1 {
    private Integer id;
    private String name;
    private String icon;
    private String url;
    private Integer parentId;
    private List<MenuBtn> children;
}
