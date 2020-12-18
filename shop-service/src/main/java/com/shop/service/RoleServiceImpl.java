package com.shop.service;

import com.shop.dao.RoleDao;
import com.shop.vo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author "can"
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public List<Role> seRole() {
        return roleDao.seRole();
    }

    @Override
    public boolean inRole(String name) {
        return roleDao.inRole(name) > 0;
    }

    @Override
    public boolean delRole(Integer id) {
        return roleDao.delRole(id) > 0;
    }

    @Override
    public boolean upRole(String name) {
        return roleDao.upRole(name) > 0;
    }
}
