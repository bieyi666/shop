package com.shop.service;

import com.shop.dao.StatisticsDao;
import com.shop.vo.Statistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 统计实现
 */
@Service
public class StatisticsServiceImpl implements StatisticsService
{

    @Autowired
    StatisticsDao statisticsDao;


    /**
     * 根据商户编号 查询收入
     * @param storeid
     * @return
     */
    @Override
    public List<Statistics> queryStatisticsBySid(int storeid, int state3) {
        return statisticsDao.queryStatisticsBySid(storeid,state3);
    }
}
