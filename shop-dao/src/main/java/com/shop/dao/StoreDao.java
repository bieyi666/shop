package com.shop.dao;

import com.shop.vo.StoreInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//商户
public interface StoreDao {


    public int updateStoreInfoBySid(StoreInfo storeInfo);

    /**
     * 根据用户编号 查询商户信息
     * @param uid
     * @return
     */
    public StoreInfo queryStoreByUid(int uid);


    /**
     * 提交商户申请
     * @param storeInfo 用户信息
     * @return
     */
    public int storeApply(StoreInfo storeInfo);

    /**
     *查询所有商户申请
     * @param storeInfo
     * @return
     */
    public List<StoreInfo> queryStoreApply(StoreInfo storeInfo);

    /**
     * 查询商户申请的数量
     * @param storeInfo
     * @return
     */
    public int queryStoreApplyCount(StoreInfo storeInfo);



    /**
     * 商户申请审核
     * @param storeid 商户id
     * @param results 审核结果 1通过成为商户  3审核不通过
     * @return
     */
    public int applyAudit(@Param("storeid") int storeid, @Param("results") int results);

    public int applyAuditFalse(int storeid);

    /**
     * 查询所有正在开店的商户信息
     * @param storeInfo 条件查询条件
     * @return
     */
    public List<StoreInfo> queryAllStore(StoreInfo storeInfo);

    public int queryAllStoreCount(StoreInfo storeInfo);



//    判断用户是否为商户
    public StoreInfo pdStore(int uid);


    public StoreInfo queryStoreById(int storeId);

}
