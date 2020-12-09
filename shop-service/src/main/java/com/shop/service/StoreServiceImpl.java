package com.shop.service;

import com.shop.dao.StoreDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//商户
@Service
public class StoreServiceImpl implements StoreService
{

    @Autowired
    StoreDao storeDao;


}
