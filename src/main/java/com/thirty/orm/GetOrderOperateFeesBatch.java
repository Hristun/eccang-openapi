package com.thirty.orm;

import java.util.List;

public class GetOrderOperateFeesBatch {
      private Integer warehouse_code;//Require发货仓库代码
      private Integer customer_code;//Require客户代码
      private String country_code;//Require目的国家代码
      private List<String> shipping_method;//Require物流产品
      private String postcode;//Require邮政编码（ODA邮编自动匹配ODA费用）
      private float weight;//Option包裹重量（不填则使用产品总重）
      private float length;//Option包裹长
      private float width;//Option包裹宽
      private float height;//Option包裹高
      private String city;//Option城市
      private Integer is_signature;//Option是否签名0代表否 1代表是（默认0）
      private Integer is_insurance;//Option是否保险0代表否 1代表是（默认0）
      private String insurance_value;//Option保险金额
      private List<GetOrderOperateFeesProduct> order_product;//Require产品明细

      public Integer getWarehouse_code() {
            return warehouse_code;
      }

      public void setWarehouse_code(Integer warehouse_code) {
            this.warehouse_code = warehouse_code;
      }

      public Integer getCustomer_code() {
            return customer_code;
      }

      public void setCustomer_code(Integer customer_code) {
            this.customer_code = customer_code;
      }

      public String getCountry_code() {
            return country_code;
      }

      public void setCountry_code(String country_code) {
            this.country_code = country_code;
      }

      public List<String> getShipping_method() {
            return shipping_method;
      }

      public void setShipping_method(List<String> shipping_method) {
            this.shipping_method = shipping_method;
      }

      public String getPostcode() {
            return postcode;
      }

      public void setPostcode(String postcode) {
            this.postcode = postcode;
      }

      public float getWeight() {
            return weight;
      }

      public void setWeight(float weight) {
            this.weight = weight;
      }

      public float getLength() {
            return length;
      }

      public void setLength(float length) {
            this.length = length;
      }

      public float getWidth() {
            return width;
      }

      public void setWidth(float width) {
            this.width = width;
      }

      public float getHeight() {
            return height;
      }

      public void setHeight(float height) {
            this.height = height;
      }

      public String getCity() {
            return city;
      }

      public void setCity(String city) {
            this.city = city;
      }

      public Integer getIs_signature() {
            return is_signature;
      }

      public void setIs_signature(Integer is_signature) {
            this.is_signature = is_signature;
      }

      public Integer getIs_insurance() {
            return is_insurance;
      }

      public void setIs_insurance(Integer is_insurance) {
            this.is_insurance = is_insurance;
      }

      public String getInsurance_value() {
            return insurance_value;
      }

      public void setInsurance_value(String insurance_value) {
            this.insurance_value = insurance_value;
      }

      public List<GetOrderOperateFeesProduct> getOrder_product() {
            return order_product;
      }

      public void setOrder_product(List<GetOrderOperateFeesProduct> order_product) {
            this.order_product = order_product;
      }

      public class GetOrderOperateFeesProduct {
            private String product_barcode;//Require	产品编码
            private String sku;//Require	产品SKU
            private Integer quantity;//Require	产品数量
            private float product_declared_value;//Option	产品申报价值
            private float shared_unit_price;//Option	产品分销单价
            private float op_sales_price;//Option	产品销售单价

            public String getProduct_barcode() {
                  return product_barcode;
            }

            public void setProduct_barcode(String product_barcode) {
                  this.product_barcode = product_barcode;
            }

            public String getSku() {
                  return sku;
            }

            public void setSku(String sku) {
                  this.sku = sku;
            }

            public Integer getQuantity() {
                  return quantity;
            }

            public void setQuantity(Integer quantity) {
                  this.quantity = quantity;
            }

            public float getProduct_declared_value() {
                  return product_declared_value;
            }

            public void setProduct_declared_value(float product_declared_value) {
                  this.product_declared_value = product_declared_value;
            }

            public float getShared_unit_price() {
                  return shared_unit_price;
            }

            public void setShared_unit_price(float shared_unit_price) {
                  this.shared_unit_price = shared_unit_price;
            }

            public float getOp_sales_price() {
                  return op_sales_price;
            }

            public void setOp_sales_price(float op_sales_price) {
                  this.op_sales_price = op_sales_price;
            }
      }
}
