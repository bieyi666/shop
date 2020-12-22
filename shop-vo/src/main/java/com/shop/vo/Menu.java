package com.shop.vo;

import lombok.Data;

import java.util.List;

/**
 * @author "can"
 */
@Data
public class Menu {
    private Integer id;
    private String name;
    private String icon;
    private String url;
    private Integer parentId;
    private List<Menu1> children;
    private List<MenuBtn> children1;
}
