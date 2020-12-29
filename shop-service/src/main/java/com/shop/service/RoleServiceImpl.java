package com.shop.service;

import com.alibaba.fastjson.JSON;
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
    public boolean upRole(String name, Integer id) {
        return roleDao.upRole(name, id) > 0;
    }

    @Override
    public List<Integer> seRolePer(Integer id) {
        return roleDao.seRolePer(id);
    }

    @Override
    public boolean inRolePer(Integer rid, String midList1, String midList2) {
        List<Integer> list = JSON.parseArray(midList1, Integer.class);
        List<Integer> list1 = JSON.parseArray(midList2, Integer.class);
        roleDao.delRolePer(rid);
        if (list.size() >= 1) {
            if (roleDao.inRolePer(rid, list) < 1) {
                return false;
            }
        }
        if (list1.size() >= 1) {
            if (roleDao.inRolePer(rid, list1) < 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean delRolePer(Integer rid) {
        return roleDao.delRolePer(rid) > 0;
    }
}
