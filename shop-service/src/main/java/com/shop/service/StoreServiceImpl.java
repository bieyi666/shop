package com.shop.service;

import com.shop.dao.StoreDao;
import com.shop.vo.StoreInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//商户
@Service
public class StoreServiceImpl implements StoreService
{

    @Autowired
    StoreDao storeDao;

    /**
     * 根据用户编号 查询商户信息
     * @param uid
     * @return
     */
    @Override
    public StoreInfo queryStoreByUid(int uid) {
        return storeDao.queryStoreByUid(uid);
    }

    /**
     * 根据商户编号 修改商户信息
     * @param storeInfo
     * @return
     */
    @Override
    public int updateStoreInfoBySid(StoreInfo storeInfo) {
        return storeDao.updateStoreInfoBySid(storeInfo);
    }
}
