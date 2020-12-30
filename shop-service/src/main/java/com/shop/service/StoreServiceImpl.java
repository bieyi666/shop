package com.shop.service;

import com.github.pagehelper.PageHelper;
import com.shop.dao.StoreDao;
import com.shop.vo.PageVo;
import com.shop.vo.StoreInfo;
import com.shop.vo.UserInfo;
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

    @Override
    public int storeApply(StoreInfo storeInfo) {
        return storeDao.storeApply(storeInfo);
    }

    @Override
    public PageVo<StoreInfo> queryStoreApply(StoreInfo storeInfo, int page, int rows) {
        PageVo<StoreInfo> pageVo=new PageVo<>();
        PageHelper.startPage(page,rows);
        pageVo.setRows(storeDao.queryStoreApply(storeInfo));
        pageVo.setTotal(storeDao.queryStoreApplyCount(storeInfo));
        return pageVo;
    }

    @Override
    public int applyAudit(int storeid, int results) {
        return storeDao.applyAudit(storeid,results);
    }

    @Override
    public int applyAuditFalse(int storeid) {
        return storeDao.applyAuditFalse(storeid);
    }

    @Override
    public PageVo<StoreInfo> queryAllStore(StoreInfo storeInfo, int page, int rows) {
        PageVo<StoreInfo> pageVo=new PageVo<>();
        PageHelper.startPage(page,rows);
        pageVo.setRows(storeDao.queryAllStore(storeInfo));
        pageVo.setTotal(storeDao.queryAllStoreCount(storeInfo));
        return pageVo;
    }

    @Override
    public StoreInfo pdStore(int uid) {
        return storeDao.pdStore(uid);
    }
}
