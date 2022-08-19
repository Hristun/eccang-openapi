package com.thirty.orm;

public class GetTransferOrderList {

      private Integer page;//Require当前页
      private Integer pageSize;//Require每页数据长度，最大值100
      private String order_code;//Option订单号,(有多个订单,数组格式)
      private String order_status;//Option订单状态 C:待发货 W:转运中 D:收货中 H:已完成 N:异常订单 P:问题件 X:废弃
      private String SKU;//Option sku
      private String to_warehouse_id;//Option目的仓库
      private String warehouse_id;//Option仓库
      private String shipping_method;//Option运输方式代码
      private String createDateFrom;//Option订单创建开始时间， 格式YYYY-MM-DD HH:II:SS 订单号传值时，该参数无效
      private String createDateEnd;//Option订单创建结束时间， 格式YYYY-MM-DD HH:II:SS 订单号传值时，该参数无效

      public Integer getPage() {
            return page;
      }

      public void setPage(Integer page) {
            this.page = page;
      }

      public Integer getPageSize() {
            return pageSize;
      }

      public void setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

      public String getSKU() {
            return SKU;
      }

      public void setSKU(String SKU) {
            this.SKU = SKU;
      }

      public String getTo_warehouse_id() {
            return to_warehouse_id;
      }

      public void setTo_warehouse_id(String to_warehouse_id) {
            this.to_warehouse_id = to_warehouse_id;
      }

      public String getWarehouse_id() {
            return warehouse_id;
      }

      public void setWarehouse_id(String warehouse_id) {
            this.warehouse_id = warehouse_id;
      }

      public String getShipping_method() {
            return shipping_method;
      }

      public void setShipping_method(String shipping_method) {
            this.shipping_method = shipping_method;
      }

      public String getCreateDateFrom() {
            return createDateFrom;
      }

      public void setCreateDateFrom(String createDateFrom) {
            this.createDateFrom = createDateFrom;
      }

      public String getCreateDateEnd() {
            return createDateEnd;
      }

      public void setCreateDateEnd(String createDateEnd) {
            this.createDateEnd = createDateEnd;
      }
}
