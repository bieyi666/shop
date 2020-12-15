package com.shop.dao;

import com.shop.vo.WarehouseType;

import java.util.List;

/*仓库类型*/
public interface WarehouseTypeDao {

    /**
     * 查询所有仓库类型
     * @return
     */
    public List<WarehouseType> queryAllWarehouseType();

    /**
     * 查询仓库类型总数
     * @return
     */
    public int queryCountWarehouseType();

    /**
     * 根据编号修改仓库类型
     * @param WarehouseType
     * @return
     */
    public int updateWarehouseTypeById(WarehouseType WarehouseType);

    /**
     * 根据编号 查询仓库类型
     * @param id
     * @return
     */
    public WarehouseType queryWarehouseTypeById(int id);


    /**
     * 查询所有仓库类型 没有分页
     * @return
     */
    public List<WarehouseType> queryAllWarehouseTypes();

}
