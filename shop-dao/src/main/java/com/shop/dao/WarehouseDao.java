package com.shop.dao;

import com.shop.vo.Warehouse;

import java.util.List;

/*仓库*/
public interface WarehouseDao {

    /**
     * 查询所有仓库信息
     * @return
     */
    public List<Warehouse> queryAllWarehouse(Warehouse warehouse);

    /**
     * 查询仓库总数
     * @return
     */
    public int queryCountWarehouse(Warehouse warehouse);


    /**
     * 根据编号 修改仓库信息
     * @param warehouse
     * @return
     */
    public int updateWarehouseById(Warehouse warehouse);


    /**
     * 仓库信息添加
     * @param warehouse
     * @return
     */
    public int addWarehouse(Warehouse warehouse);

    /**
     * 根据编号 删除信息
     * @param id
     * @return
     */
    public int delWarehouseById(int id);

    /**
     * 根据类型编号 查询仓库是否存在
     * @param tid
     * @return
     */
    public List<Warehouse> queryWarehouseBytId(int tid);

    /**
     * 根据编号 查询仓库信息
     * @param id
     * @return
     */
    public Warehouse queryWarehouseById(int id);

    /**
     *根据名称 查询仓库信息
     * @param name
     * @return
     */
    public Warehouse queryWarehouseByName(String name);


}
