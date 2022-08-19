package com.thirty.orm;

import java.math.BigDecimal;
import java.util.Map;

public class CreateOrderItems {

      private String product_sku;//Require	SKU
      private String reference_no;//Option	自定义编码
      private String product_name;//Option	中文申报名称
      private String product_name_en;//Option	英文申报名称
      private BigDecimal product_declared_value;//Option	申报价值
      private int quantity;//Require	数量
      private String ref_tnx;//Option	eBay交易号，选填(Edis物流必填)
      private String ref_item_id;//Option	eBay物品号，选填(Edis物流必填，平台编码和ebay物品号都往此字段传值)
      private String ref_buyer_id;//Option	eBay买家ID，选填(Edis物流必填)
      private String already_taxed;//Option	已税标识:选填(I_TAXED 表示跨境已税，U_TAXED 表示海外仓已税)
      private String child_order_id;//Option	子单号，单据编码
      private Map<String, Integer> batch_info;//Option	库存批次号信息（非必填）

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

      public int getQuantity() {
            return quantity;
      }

      public void setQuantity(int quantity) {
            this.quantity = quantity;
      }

      public String getRef_tnx() {
            return ref_tnx;
      }

      public void setRef_tnx(String ref_tnx) {
            this.ref_tnx = ref_tnx;
      }

      public String getRef_item_id() {
            return ref_item_id;
      }

      public void setRef_item_id(String ref_item_id) {
            this.ref_item_id = ref_item_id;
      }

      public String getRef_buyer_id() {
            return ref_buyer_id;
      }

      public void setRef_buyer_id(String ref_buyer_id) {
            this.ref_buyer_id = ref_buyer_id;
      }

      public String getAlready_taxed() {
            return already_taxed;
      }

      public void setAlready_taxed(String already_taxed) {
            this.already_taxed = already_taxed;
      }

      public String getChild_order_id() {
            return child_order_id;
      }

      public void setChild_order_id(String child_order_id) {
            this.child_order_id = child_order_id;
      }

      public Map<String, Integer> getBatch_info() {
            return batch_info;
      }

      public void setBatch_info(Map<String, Integer> batch_info) {
            this.batch_info = batch_info;
      }
}
