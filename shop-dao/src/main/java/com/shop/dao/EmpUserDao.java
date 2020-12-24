package com.shop.dao;

import com.shop.vo.EmpUser;

/**
 * @author "can"
 */
public interface EmpUserDao {

    /**
     * 登录验证
     * @param empUser
     * @return
     */
    public EmpUser loginAuthentication(EmpUser empUser);
}
