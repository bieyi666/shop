package com.shop.dao;

import com.shop.vo.Warehouse;
import com.shop.vo.WarehouseType;

import java.util.List;

/*仓库类型*/
public interface WarehouseTypeDao {

    /**
     * 查询所有仓库类型
     * @return
     */
    public List<WarehouseType> queryAllWarehouseType(WarehouseType warehouseType);

    /**
     * 查询仓库类型总数
     * @return
     */
    public int queryCountWarehouseType(WarehouseType warehouseType);

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

    /**
     * 仓库类型 添加
     * @param warehouseType
     * @return
     */
    public int addWarehouseType(WarehouseType warehouseType);

    /**
     * 根据编号 删除仓库（逻辑删除 0）
     * @param id
     * @return
     */
    public int delWarehouseTypeById(int id);

    /**
     * 根据仓库类型名称 查询是否存在
     * @param name
     * @return
     */
    public WarehouseType queryWarehouseTypeByName(String name);

}
