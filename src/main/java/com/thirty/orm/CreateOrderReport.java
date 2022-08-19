package com.thirty.orm;

import java.math.BigDecimal;

public class CreateOrderReport {
      private String product_sku;//Require	产品SKU 不存在就创建新的
      private String product_title;//Require	产品中文名称
      private String product_title_en;//Require	产品英文名称
      private int product_quantity;//Require	数量
      private BigDecimal product_declared_value;//Require	单价
      private BigDecimal product_weight;//Require	重量

      public String getProduct_sku() {
            return product_sku;
      }

      public void setProduct_sku(String product_sku) {
            this.product_sku = product_sku;
      }

      public String getProduct_title() {
            return product_title;
      }

      public void setProduct_title(String product_title) {
            this.product_title = product_title;
      }

      public String getProduct_title_en() {
            return product_title_en;
      }

      public void setProduct_title_en(String product_title_en) {
            this.product_title_en = product_title_en;
      }

      public int getProduct_quantity() {
            return product_quantity;
      }

      public void setProduct_quantity(int product_quantity) {
            this.product_quantity = product_quantity;
      }

      public BigDecimal getProduct_declared_value() {
            return product_declared_value;
      }

      public void setProduct_declared_value(BigDecimal product_declared_value) {
            this.product_declared_value = product_declared_value;
      }

      public BigDecimal getProduct_weight() {
            return product_weight;
      }

      public void setProduct_weight(BigDecimal product_weight) {
            this.product_weight = product_weight;
      }
}
