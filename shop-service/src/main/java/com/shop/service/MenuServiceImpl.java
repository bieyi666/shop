package com.shop.service;

import com.shop.dao.MenuDao;
import com.shop.vo.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author "can"
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao menuDao;

    @Override
    public List<Menu> seMenu() {
        return menuDao.seMenu();
    }
}
