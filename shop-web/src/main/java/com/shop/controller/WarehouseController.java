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
     * @param page 当前页
     * @param rows 一页展示多少条数据
     * @return
     */
    @CrossOrigin
    @RequestMapping("/queryAllWarehouse.action")
    @ResponseBody
    public PageVo<Warehouse> queryAllWarehouse(@RequestParam(value = "page",defaultValue = "1") int page,
                                               @RequestParam(value = "rows",defaultValue = "5") int rows) {
        return warehouseService.queryAllWarehouse(page,rows);
    }
}
