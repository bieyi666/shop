package com.shop.controller;

import com.shop.service.StatisticsService;
import com.shop.utils.ImageUpload;
import com.shop.vo.Statistics;
import org.apache.commons.collections.map.LinkedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
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


    @RequestMapping("/HouQueryStatisticsYear.action")
    @ResponseBody
    public Map HouQueryStatisticsYear(String year, Integer storeid) {
        Map<Integer, Object> map = new HashMap<Integer, Object>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.put(4, 4);
        map.put(5, 5);
        map.put(6, 6);
        map.put(7, 7);
        map.put(8, 8);
        map.put(9, 9);
        map.put(10, 10);
        map.put(11, 11);
        map.put(12, 12);


        List<Statistics> list = statisticsService.HouQueryStatisticsYear(year, storeid);
        for (Integer i : map.keySet()) {
            Statistics s2 = null;
            for (Statistics s : list) {
                if (i == s.getMonth()) {
                    s2 = s;
                    break;
                }
            }
            if (s2 != null) {
                map.put(i, s2);
            } else {
                map.put(i, 0);
            }
        }
        map.remove(0);
        System.out.println(map);
        return map;
    }


}
