package com.shop.controller;

import com.github.pagehelper.PageHelper;
import com.shop.service.WarehouseService;
import com.shop.vo.PageVo;
import com.shop.vo.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/*仓库*/
@Controller
public class WarehouseController {

    @Autowired
    WarehouseService warehouseService;

    /**
     * 查询所有仓库信息
     *
     * @param page 当前页
     * @param rows 一页展示多少条数据
     * @return
     */
    @CrossOrigin //跨域
    @RequestMapping("/queryAllWarehouse.action")
    @ResponseBody
    public PageVo<Warehouse> queryAllWarehouse(@RequestParam(value = "page", defaultValue = "1") int page,
                                               @RequestParam(value = "rows", defaultValue = "5") int rows) {
        return warehouseService.queryAllWarehouse(page, rows);
    }

    /**
     * 根据编号 修改仓库信息
     *
     * @param warehouse
     * @return
     */
    @CrossOrigin //跨域
    @RequestMapping(value = "/updateWarehouseById.action", produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String updateWarehouseById(Warehouse warehouse) {
        int num = warehouseService.updateWarehouseById(warehouse);
        if (num != 0) {
            return "修改成功";
        }
        return "修改失败";
    }

    /**
     * 仓库信息添加
     *
     * @param warehouse
     * @return
     */
    @CrossOrigin //跨域
    @RequestMapping(value = "/addWarehouse.action", produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String addWarehouse(Warehouse warehouse) {
        int num = warehouseService.addWarehouse(warehouse);
        if (num != 0) {
            return "添加成功";
        }
        return "仓库名已存在";
    }
}
