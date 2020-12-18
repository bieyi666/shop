package com.shop.controller;

import com.shop.service.RoleService;
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
public class RoleController {

    @Autowired
    private RoleService roleService;

    @CrossOrigin
    @RequestMapping(value = "seRole.action")
    public List<Role> seRole() {
        return roleService.seRole();
    }
}
