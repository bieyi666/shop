package com.shop.controller;

import com.shop.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//商户
@Controller
public class StoreController {

    @Autowired
    StoreService storeService;

}
