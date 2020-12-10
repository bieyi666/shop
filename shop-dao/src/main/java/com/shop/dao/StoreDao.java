package com.shop.dao;

import com.shop.vo.StoreInfo;

//商户
public interface StoreDao {

    /**
     * 根据用户编号 查询商户信息
     * @param uid
     * @return
     */
    public StoreInfo queryStoreByUid(int uid);
}
