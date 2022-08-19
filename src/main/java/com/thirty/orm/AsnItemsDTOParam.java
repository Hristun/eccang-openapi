package com.thirty.orm;

public class AsnItemsDTOParam {

      private String product_sku;//RequireSKU

      private Integer quantity;//Require数量

      private Integer box_no;//Require箱号

      private Integer product_price;//Option产品单价（此为转换为客户币种后的产品单价）

      private String currency_code;//Option产品币种（ 此币种将转换为客户币种）

      private String associated_barcode;//Option关联条码,非必传,一个入库单相同SKU只能传同一个关联条码,不同的SKU必须传不同的关联条码

      private String inventory_type;//Option箱维度库存类型：0 = 按仓库确认，1 = 标准，2 = 暂存(传值stock_type=5时，注意相同箱号必须保持库存类型一致，箱维度未传默认=仓库确认；stock_type其他值时，箱维度保持stock_type值一致)

      public String getProduct_sku() {
            return product_sku;
      }

      public void setProduct_sku(String product_sku) {
            this.product_sku = product_sku;
      }

      public Integer getQuantity() {
            return quantity;
      }

      public void setQuantity(Integer quantity) {
            this.quantity = quantity;
      }

      public Integer getBox_no() {
            return box_no;
      }

      public void setBox_no(Integer box_no) {
            this.box_no = box_no;
      }

      public Integer getProduct_price() {
            return product_price;
      }

      public void setProduct_price(Integer product_price) {
            this.product_price = product_price;
      }

      public String getCurrency_code() {
            return currency_code;
      }

      public void setCurrency_code(String currency_code) {
            this.currency_code = currency_code;
      }

      public String getAssociated_barcode() {
            return associated_barcode;
      }

      public void setAssociated_barcode(String associated_barcode) {
            this.associated_barcode = associated_barcode;
      }

      public String getInventory_type() {
            return inventory_type;
      }

      public void setInventory_type(String inventory_type) {
            this.inventory_type = inventory_type;
      }
}
