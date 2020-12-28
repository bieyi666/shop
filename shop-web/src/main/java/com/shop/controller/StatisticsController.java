package com.shop.controller;

import com.shop.service.StatisticsService;
import com.shop.vo.Statistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 统计
 */
@CrossOrigin
@Controller
public class StatisticsController {

    @Autowired
    StatisticsService statisticsService;

    /**
     * 根据商户编号 查询收入
     * @param storeid
     * @return
     */
    @RequestMapping("/queryStatisticsBySid.action")
    @ResponseBody
    public List<Statistics> queryStatisticsBySid(int storeid, int state3) {
        return statisticsService.queryStatisticsBySid(storeid,state3);
    }

}
