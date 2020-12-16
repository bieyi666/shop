package com.shop.service;

import com.shop.vo.PageVo;
import com.shop.vo.WarehouseType;

import java.util.List;

/*仓库类型*/
public interface WarehouseTypeService {

    /**
     * 查询所有仓库类型信息
     * @param page 当前页
     * @param rows 一页总条数
     * @return
     */
    public PageVo<WarehouseType> queryAllWarehouseType(int page, int rows);

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

}
