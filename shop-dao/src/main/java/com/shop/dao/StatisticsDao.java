package com.shop.dao;

import com.shop.vo.Statistics;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 统计
 */
public interface StatisticsDao {

    /**
     * 根据商户编号 查询收入
     * @param storeid
     * @return
     */
    public List<Statistics> queryStatisticsBySid(@Param("storeid") int storeid, @Param("state3") int state3);

}
