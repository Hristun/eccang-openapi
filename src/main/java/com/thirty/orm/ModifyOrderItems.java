package com.thirty.orm;

import java.math.BigDecimal;
import java.util.Map;

public class ModifyOrderItems {
      private String product_sku;//Require	SKU
      private String product_name_en;//Option	英文申报名称
      private BigDecimal product_declared_value;//Option	申报价值
      private int quantity;//Require	数量
      private Map<String, Integer> batch_info;//Option	库存批次号信息（非必填）

      public String getProduct_sku() {
            return product_sku;
      }

      public void setProduct_sku(String product_sku) {
            this.product_sku = product_sku;
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

      public int getQuantity() {
            return quantity;
      }

      public void setQuantity(int quantity) {
            this.quantity = quantity;
      }

      public Map<String, Integer> getBatch_info() {
            return batch_info;
      }

      public void setBatch_info(Map<String, Integer> batch_info) {
            this.batch_info = batch_info;
      }
}
