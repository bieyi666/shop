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

import java.util.List;

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

    /**
     * 根据编号修改仓库类型
     * @param WarehouseType
     * @return
     */
    @CrossOrigin //跨域
    @RequestMapping(value = "/updateWarehouseTypeById.action", produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String updateWarehouseTypeById(WarehouseType WarehouseType) {
        int num=warehouseTypeService.updateWarehouseTypeById(WarehouseType);
        if (num!=0){
            return "修改成功";
        }
        return "修改失败";
    }


    /**
     * 根据编号 查询仓库类型
     * @param id
     * @return
     */
    @CrossOrigin //跨域
    @RequestMapping("/queryWarehouseTypeById.action")
    @ResponseBody
    public WarehouseType queryWarehouseTypeById(int id) {
        return warehouseTypeService.queryWarehouseTypeById(id);
    }

    /**
     * 查询所有仓库类型 没有分页
     * @return
     */
    @CrossOrigin //跨域
    @RequestMapping("/queryAllWarehouseTypes.action")
    @ResponseBody
    public List<WarehouseType> queryAllWarehouseTypes() {
        return warehouseTypeService.queryAllWarehouseTypes();
    }


    /**
     * 仓库类型 添加
     * @param warehouseType
     * @return
     */
    @CrossOrigin //跨域
    @RequestMapping(value = "/addWarehouseType.action", produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String addWarehouseType(WarehouseType warehouseType) {
        int num=warehouseTypeService.addWarehouseType(warehouseType);
        if (num != 0){
            return "添加成功";
        }
        return "添加失败";
    }
}
