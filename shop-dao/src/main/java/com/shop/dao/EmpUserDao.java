package com.shop.dao;

import com.shop.vo.EmpUser;
import org.apache.ibatis.annotations.Param;

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

    /**
     * 添加员工
     * @param username
     * @return
     */
    public int inEmpUser(@Param("username") String username, @Param("eid") Integer eid);
}
