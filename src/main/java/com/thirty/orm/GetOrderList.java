package com.thirty.orm;

import java.util.List;

public class GetOrderList {

      private Integer pageSize;//Option每页数据长度，最大值100

      private Integer page;//Option当前页

      private String order_code;//Option订单号

      private String order_status;//Option订单状态 C:待发货审核 W:待发货 D:已发货 H:暂存 N:异常订单 P:问题件 X:废弃

      private List<String> order_code_arr;//Option多个订单号,数组格式

      private String shipping_method;//Option运输方式代码

      private String create_date_from;//Option订单创建开始时间， 格式YYYY-MM-DD HH:II:SS 订单号传值时，该参数无效

      private String create_date_to;//Option订单创建结束时间， 格式YYYY-MM-DD HH:II:SS 订单号传值时，该参数无效

      private String modify_date_from;//Option订单修改开始时间， 格式YYYY-MM-DD HH:II:SS 订单号传值时，该参数无效

      private String modify_date_to;//Option订单修改结束时间， 格式YYYY-MM-DD HH:II:SS 订单号传值时，该参数无效

      private String ship_date_from;//Option订单出库开始时间， 格式YYYY-MM-DD HH:II:SS 订单号传值时，该参数无效

      private String ship_date_to;//Option订单出库结束时间， 格式YYYY-MM-DD HH:II:SS 订单号传值时，该参数无效

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

      public String getOrder_code() {
            return order_code;
      }

      public void setOrder_code(String order_code) {
            this.order_code = order_code;
      }

      public String getOrder_status() {
            return order_status;
      }

      public void setOrder_status(String order_status) {
            this.order_status = order_status;
      }

      public List<String> getOrder_code_arr() {
            return order_code_arr;
      }

      public void setOrder_code_arr(List<String> order_code_arr) {
            this.order_code_arr = order_code_arr;
      }

      public String getShipping_method() {
            return shipping_method;
      }

      public void setShipping_method(String shipping_method) {
            this.shipping_method = shipping_method;
      }

      public String getCreate_date_from() {
            return create_date_from;
      }

      public void setCreate_date_from(String create_date_from) {
            this.create_date_from = create_date_from;
      }

      public String getCreate_date_to() {
            return create_date_to;
      }

      public void setCreate_date_to(String create_date_to) {
            this.create_date_to = create_date_to;
      }

      public String getModify_date_from() {
            return modify_date_from;
      }

      public void setModify_date_from(String modify_date_from) {
            this.modify_date_from = modify_date_from;
      }

      public String getModify_date_to() {
            return modify_date_to;
      }

      public void setModify_date_to(String modify_date_to) {
            this.modify_date_to = modify_date_to;
      }

      public String getShip_date_from() {
            return ship_date_from;
      }

      public void setShip_date_from(String ship_date_from) {
            this.ship_date_from = ship_date_from;
      }

      public String getShip_date_to() {
            return ship_date_to;
      }

      public void setShip_date_to(String ship_date_to) {
            this.ship_date_to = ship_date_to;
      }
}
