package com.shop.service;

import com.shop.vo.PageVo;
import com.shop.vo.StoreInfo;
import com.shop.vo.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    /**
     * 提交商户申请
     * @param storeInfo
     * @return
     */
    public int storeApply(StoreInfo storeInfo);


    /**
     *查询所有商户申请
     * @param storeInfo
     * @return
     */
    public PageVo<StoreInfo> queryStoreApply(StoreInfo storeInfo,int page, int rows);

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
    public PageVo<StoreInfo> queryAllStore(StoreInfo storeInfo,int page, int rows);

//    判断用户是否为商户
    public StoreInfo pdStore(int uid);
}
