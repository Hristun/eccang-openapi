package com.thirty.orm;

import java.math.BigDecimal;

public class CreateReturnOrderItems {
      private String product_sku;//Require	SKU
      private String reference_no;//Option	自定义编码
      private String product_name;//Option	中文申报名称
      private String product_name_en;//Option	英文申报名称
      private BigDecimal product_declared_value;//Option	申报价值
      private Integer op_quantity;//Require	良品数量
      private Integer ng_quantity;//Option	不良品数量(与良品数量两者至少要填一个)
      private CreateReturnOrderItemsMap product_receiving_map;//Option	指定入库单明细

      public String getProduct_sku() {
            return product_sku;
      }

      public void setProduct_sku(String product_sku) {
            this.product_sku = product_sku;
      }

      public String getReference_no() {
            return reference_no;
      }

      public void setReference_no(String reference_no) {
            this.reference_no = reference_no;
      }

      public String getProduct_name() {
            return product_name;
      }

      public void setProduct_name(String product_name) {
            this.product_name = product_name;
      }

      public String getProduct_name_en() {
            return product_name_en;
      }

      public void setProduct_name_en(String product_name_en) {
            this.product_name_en = product_name_en;
      }

      public BigDecimal getProduct_declared_value() {
            return product_declared_value;
      }

      public void setProduct_declared_value(BigDecimal product_declared_value) {
            this.product_declared_value = product_declared_value;
      }

      public Integer getOp_quantity() {
            return op_quantity;
      }

      public void setOp_quantity(Integer op_quantity) {
            this.op_quantity = op_quantity;
      }

      public Integer getNg_quantity() {
            return ng_quantity;
      }

      public void setNg_quantity(Integer ng_quantity) {
            this.ng_quantity = ng_quantity;
      }

      public CreateReturnOrderItemsMap getProduct_receiving_map() {
            return product_receiving_map;
      }

      public void setProduct_receiving_map(CreateReturnOrderItemsMap product_receiving_map) {
            this.product_receiving_map = product_receiving_map;
      }
      public class CreateReturnOrderItemsMap {
            private String receiving_code;//Require入库单号
            private String serial_number;//Require序列号
            private Integer type;//Require库位类型 1良品 2不良品
            public String getReceiving_code() {
                  return receiving_code;
            }
            public void setReceiving_code(String receiving_code) {
                  this.receiving_code = receiving_code;
            }
            public String getSerial_number() {
                  return serial_number;
            }
            public void setSerial_number(String serial_number) {
                  this.serial_number = serial_number;
            }
            public Integer getType() {
                  return type;
            }
            public void setType(Integer type) {
                  this.type = type;
            }
      }
}