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
@CrossOrigin
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "seRole.action")
    public List<Role> seRole() {
        return roleService.seRole();
    }

    @RequestMapping(value = "upRole.action")
    public boolean upRole(String name, Integer id) {
        return roleService.upRole(name, id);
    }

    @RequestMapping(value = "inRole.action")
    public boolean inRole(String name) {
        return roleService.inRole(name);
    }

    @RequestMapping(value = "delRole.action")
    public boolean delRole(Integer id) {
        return roleService.delRole(id);
    }

    @RequestMapping(value = "seRolePer.action")
    public List<Integer> seRolePer(Integer id) {
        return roleService.seRolePer(id);
    }

    @RequestMapping(value = "inRolePer.action")
    public boolean inRolePer(Integer rid, Integer mid) {
        return roleService.inRolePer(rid, mid);
    }

    @RequestMapping(value = "delRolePer.action")
    public boolean delRolePer(Integer rid, Integer mid) {
        return roleService.delRolePer(rid, mid);
    }
}
