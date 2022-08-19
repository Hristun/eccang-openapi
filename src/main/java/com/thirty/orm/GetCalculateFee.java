package com.thirty.orm;

public class GetCalculateFee {
      private String warehouse_code;//Require发货仓库代码
      private String country_code;//Require目的国家代码
      private String shipping_method;//Require配送方式
      private String postcode;//Option邮政编码
      private float weight;//Require包裹重量
      private float length;//Option包裹长
      private float width;//Option包裹宽
      private float height;//Option包裹高
      private String city;//Option城市

      public String getWarehouse_code() {
            return warehouse_code;
      }

      public void setWarehouse_code(String warehouse_code) {
            this.warehouse_code = warehouse_code;
      }

      public String getCountry_code() {
            return country_code;
      }

      public void setCountry_code(String country_code) {
            this.country_code = country_code;
      }

      public String getShipping_method() {
            return shipping_method;
      }

      public void setShipping_method(String shipping_method) {
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
}
