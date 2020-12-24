package com.shop.service;

import com.shop.dao.EmpDao;
import com.shop.dao.EmpUserDao;
import com.shop.vo.EmpUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author "can"
 */
@Service
public class EmpUserServiceImpl implements EmpUserService {

    @Autowired
    private EmpUserDao empUserDao;

    @Autowired
    private EmpDao empDao;

    @Override
    public EmpUser loginAuthentication(EmpUser empUser) {
        EmpUser empUser1 = empUserDao.loginAuthentication(empUser);
        empUser1.setEmp(empDao.seEmp1(empUser1.getEid()));
        return empUser1;
    }
}
