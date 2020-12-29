package com.shop.controller;

import com.shop.service.StatisticsService;
import com.shop.vo.Statistics;
import org.apache.commons.collections.map.LinkedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
     *
     * @param storeid
     * @return
     */
    @RequestMapping("/queryStatisticsBySid.action")
    @ResponseBody
    public Map<Integer,Object> queryStatisticsBySid(int storeid, int state3) {
        List<Statistics> list = statisticsService.queryStatisticsBySid(storeid, state3);
        Map<Integer, Object> map = new HashMap<>();
        for (int i = 0; i < 12; i++) {
            map.put(i+1,0);
        }

        for (Integer o:map.keySet()) {
            for (int i=0;i<list.size();i++){
                if (list.get(i).getMonth() == o){
                    map.put(o,list.get(i).getStoreRental());
                }
            }
        }
        System.out.println(map);
        return map;
    }

}
