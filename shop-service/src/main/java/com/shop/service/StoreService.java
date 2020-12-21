package com.shop.service;

import com.shop.vo.StoreInfo;

//商户
public interface StoreService {

    /**
     * 根据用户编号 查询商户信息
     * @param uid
     * @return
     */
    public StoreInfo queryStoreByUid(int uid);

    /**
     * 根据商户编号 修改商户信息
     * @param storeInfo
     * @return
     */
    public int updateStoreInfoBySid(StoreInfo storeInfo);

}
