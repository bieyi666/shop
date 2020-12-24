package com.shop.controller;

import com.alibaba.fastjson.JSON;
import com.shop.service.MenuService;
import com.shop.vo.Menu;
import com.shop.vo.MenuBtn;
import com.shop.vo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author "can"
 */
@RestController
@CrossOrigin
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping("/seMenu.action")
    public List<Menu> seMenu(String roles) {
        List<Role> list = JSON.parseArray(roles, Role.class);
        return menuService.seMenu(list);
    }

    @RequestMapping("/seMenuBtn.action")
    public List<MenuBtn> seMenuBtn(String roles) {
        List<Role> list = JSON.parseArray(roles, Role.class);
        return menuService.seMenuBtn(list);
    }

    @RequestMapping("/seMenu1.action")
    public List<Menu> seMenu1() {
        return menuService.seMenu1();
    }
}
