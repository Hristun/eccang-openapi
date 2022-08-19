package com.thirty.orm;

import java.util.List;

/**
 * @author Anchor
 * @date 2022/8/15 18:32
 * @description TODO
 */
public class GetProductList {
    private Integer pageSize;//Require	每页数据长度
    private Integer page;//	Require	当前页
    private String product_sku;//Option	SKU
    private List<String> product_sku_arr;//Option	多个SKU,数组格式
    private String start_time;//Option	起始时间(产品创建)
    private String end_time;//Option	结束时间(产品创建)
    private String update_start_time;//Option	起始时间(产品更新)
    private String update_end_time;//Option	结束时间(产品更新)


    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getProduct_sku() {
        return product_sku;
    }

    public void setProduct_sku(String product_sku) {
        this.product_sku = product_sku;
    }

    public List<String> getProduct_sku_arr() {
        return product_sku_arr;
    }

    public void setProduct_sku_arr(List<String> product_sku_arr) {
        this.product_sku_arr = product_sku_arr;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getUpdate_start_time() {
        return update_start_time;
    }

    public void setUpdate_start_time(String update_start_time) {
        this.update_start_time = update_start_time;
    }

    public String getUpdate_end_time() {
        return update_end_time;
    }

    public void setUpdate_end_time(String update_end_time) {
        this.update_end_time = update_end_time;
    }
}
