package com.thirty.orm;

import java.util.Map;

public class CreateTransferOrder {
      private String order_code;//Require	转仓单号
      private String warehouse_code;//Require	仓库代码
      private String to_warehouse_code;//Require	目的仓库代码
      private String aim_merchant_id;//Option	调拨目的商家编码
      private String aim_cus_manual;//Option	调拨目的账册编号
      private Map<String, Integer> op_quantity;//Require	产品信息 { 产品SKU:产品数量, ... }
      private String shipping_method;//Require	运输方式
      private String verify;//Option	是否审核 0否1是 缺省否
      private String order_desc;//Option	订单描述

      public String getOrder_code() {
            return order_code;
      }

      public void setOrder_code(String order_code) {
            this.order_code = order_code;
      }

      public String getWarehouse_code() {
            return warehouse_code;
      }

      public void setWarehouse_code(String warehouse_code) {
            this.warehouse_code = warehouse_code;
      }

      public String getTo_warehouse_code() {
            return to_warehouse_code;
      }

      public void setTo_warehouse_code(String to_warehouse_code) {
            this.to_warehouse_code = to_warehouse_code;
      }

      public String getAim_merchant_id() {
            return aim_merchant_id;
      }

      public void setAim_merchant_id(String aim_merchant_id) {
            this.aim_merchant_id = aim_merchant_id;
      }

      public String getAim_cus_manual() {
            return aim_cus_manual;
      }

      public void setAim_cus_manual(String aim_cus_manual) {
            this.aim_cus_manual = aim_cus_manual;
      }

      public Map<String, Integer> getOp_quantity() {
            return op_quantity;
      }

      public void setOp_quantity(Map<String, Integer> op_quantity) {
            this.op_quantity = op_quantity;
      }

      public String getShipping_method() {
            return shipping_method;
      }

      public void setShipping_method(String shipping_method) {
            this.shipping_method = shipping_method;
      }

      public String getVerify() {
            return verify;
      }

      public void setVerify(String verify) {
            this.verify = verify;
      }

      public String getOrder_desc() {
            return order_desc;
      }

      public void setOrder_desc(String order_desc) {
            this.order_desc = order_desc;
      }
}
