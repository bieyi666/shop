package com.shop.controller;

import com.shop.service.EmpUserService;
import com.shop.vo.EmpUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author "can"
 */
@RestController
@CrossOrigin
public class EmpLoginController {

    @Autowired
    private EmpUserService empUserService;

    @RequestMapping(value = "loginAuthentication.action")
    public EmpUser loginAuthentication(EmpUser empUser) {
        return empUserService.loginAuthentication(empUser);
    }
}
