package com.shop.controller;

import com.shop.service.MenuService;
import com.shop.vo.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author "can"
 */
@RestController
public class MenuController {

    @Autowired
    private MenuService menuService;

    @CrossOrigin //跨域
    @RequestMapping("/seMenu.action")
    public List<Menu> seMenu() {
        return menuService.seMenu();
    }
}
