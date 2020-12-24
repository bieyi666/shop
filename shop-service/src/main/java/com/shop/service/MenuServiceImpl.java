package com.shop.service;

import com.shop.dao.MenuDao;
import com.shop.dao.RoleDao;
import com.shop.vo.Menu;
import com.shop.vo.Menu1;
import com.shop.vo.MenuBtn;
import com.shop.vo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author "can"
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao menuDao;

    @Autowired
    private RoleDao roleDao;

    @Override
    public List<Menu> seMenu(List<Role> list) {
        List<Integer> list1 = new ArrayList<>();
        for (Role r : list) {
            list1.addAll(roleDao.seRolePer(r.getId()));
        }
        // 查询出所有菜单
        List<Menu> list2 = menuDao.seMenu(list1);
        List<Menu> list3 = new ArrayList<>();
        for (Menu m : list2) {
            // 先将第一级菜单拿出来存入集合
            if (m.getParentId() == 0) {
                m.setChildren(new ArrayList<Menu1>());
                list3.add(m);
            }
        }
        for (Menu m : list2) {
            for (Menu m1 : list3) {
                // 将对应的parentId存入对应菜单
                if (m.getParentId().equals(m1.getId())) {
                    Menu1 menu1 = new Menu1();
                    menu1.setId(m.getId());
                    menu1.setIcon(m.getIcon());
                    menu1.setName(m.getName());
                    menu1.setUrl(m.getUrl());
                    menu1.setParentId(m.getParentId());
                    m1.getChildren().add(menu1);
                }
            }
        }
        return list3;
    }

    @Override
    public List<MenuBtn> seMenuBtn(List<Role> list) {
        List<Integer> list1 = new ArrayList<>();
        for (Role r : list) {
            list1.addAll(roleDao.seRolePer(r.getId()));
        }
        return menuDao.seMenuBtn(list1);
    }

    @Override
    public List<Menu> seMenu1() {
        return menuDao.seMenu1();
    }
}
