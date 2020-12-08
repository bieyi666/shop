package com.shop.vo;

import java.util.List;

/**
 * 分页vo
 * @param <T>
 */
public class PageVo<T> {
    private List<T> rows;

    private int total;

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
