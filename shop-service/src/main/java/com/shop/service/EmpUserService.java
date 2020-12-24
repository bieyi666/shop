package com.shop.service;

import com.shop.vo.EmpUser;

/**
 * @author "can"
 */
public interface EmpUserService {

    /**
     * 登录验证
     * @param empUser
     * @return
     */
    public EmpUser loginAuthentication(EmpUser empUser);
}
