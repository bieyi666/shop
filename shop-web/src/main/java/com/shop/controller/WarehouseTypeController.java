package com.shop.controller;

import com.github.pagehelper.PageHelper;
import com.shop.service.WarehouseTypeService;
import com.shop.vo.PageVo;
import com.shop.vo.WarehouseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//仓库类型
@Controller
public class WarehouseTypeController {

    @Autowired
    WarehouseTypeService warehouseTypeService;

    /**
     * 查询所有仓库类型信息
     * @param page 当前页
     * @param rows 一页总条数
     * @return
     */
    @CrossOrigin //跨域
    @RequestMapping("/queryAllWarehouseType.action")
    @ResponseBody
    public PageVo<WarehouseType> queryAllWarehouseType(@RequestParam(value = "page",defaultValue = "1") int page,
                                                       @RequestParam(value = "rows",defaultValue = "5") int rows) {
        return warehouseTypeService.queryAllWarehouseType(page,rows);
    }

}
