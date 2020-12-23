package com.shop.service;

import com.shop.vo.Commodity;
import com.shop.vo.PageVo;

import java.util.List;

//商品
public interface CommodityService {

    /**
     *根据条件查询所以商品信息
     * @param commodity
     * @return
     */
    public PageVo<Commodity> queryAllCommodity(Commodity commodity,int page,int rows);


    /**
     * 根据商品编号 修改商品信息
     * @param commodity
     * @return
     */
    public int updateCommodityByPid(Commodity commodity);

    //上面为供货商代码  不可修改 可使用————————————————————————————————————————————————————————————————————
    /**
     * 查询所以商品以及库存
     * @param commodity
     * @return
     */
    public List<Commodity>  queryAllCommodityer(Commodity commodity);

    /**
     * 根据编号 查询商品
     * @param cid
     * @return
     */
    public Commodity queryCommodityById(int cid);
    /**
     * 模糊查询商品
     * @param commodity
     * @return
     */
    public List<Commodity> queryAllCommoditysan(Commodity commodity);
}
