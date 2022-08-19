package com.thirty.orm;

public class CheckAddress {

      private String country_code;//Require收件人国家二字码，参考getCountry

      private String shipping_method;//Require运输方式，参考getShippingMethod

      private String consignee_province;//Option省

      private String consignee_city;//Option城市

      private String consignee_street;//Option地址1 (length:30)

      private String consignee_street1;//Option地址2 (length:30)

      private String consignee_street2;//Option地址3 (length:30)

      private String consignee_postcode;//Option邮编

      private String consignee_areacode;//Option地区代码

      private String consignee_doorplate;//Option门牌号

      private String consignee_company;//Option公司名

      private String consignee_name;//Option收件人姓名

      private String consignee_telephone;//Option收件人联系方式

      private String consignee_email;//Option收件人邮箱

      private String consignee_fax;//Option传真

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

      public String getConsignee_province() {
            return consignee_province;
      }

      public void setConsignee_province(String consignee_province) {
            this.consignee_province = consignee_province;
      }

      public String getConsignee_city() {
            return consignee_city;
      }

      public void setConsignee_city(String consignee_city) {
            this.consignee_city = consignee_city;
      }

      public String getConsignee_street() {
            return consignee_street;
      }

      public void setConsignee_street(String consignee_street) {
            this.consignee_street = consignee_street;
      }

      public String getConsignee_street1() {
            return consignee_street1;
      }

      public void setConsignee_street1(String consignee_street1) {
            this.consignee_street1 = consignee_street1;
      }

      public String getConsignee_street2() {
            return consignee_street2;
      }

      public void setConsignee_street2(String consignee_street2) {
            this.consignee_street2 = consignee_street2;
      }

      public String getConsignee_postcode() {
            return consignee_postcode;
      }

      public void setConsignee_postcode(String consignee_postcode) {
            this.consignee_postcode = consignee_postcode;
      }

      public String getConsignee_areacode() {
            return consignee_areacode;
      }

      public void setConsignee_areacode(String consignee_areacode) {
            this.consignee_areacode = consignee_areacode;
      }

      public String getConsignee_doorplate() {
            return consignee_doorplate;
      }

      public void setConsignee_doorplate(String consignee_doorplate) {
            this.consignee_doorplate = consignee_doorplate;
      }

      public String getConsignee_company() {
            return consignee_company;
      }

      public void setConsignee_company(String consignee_company) {
            this.consignee_company = consignee_company;
      }

      public String getConsignee_name() {
            return consignee_name;
      }

      public void setConsignee_name(String consignee_name) {
            this.consignee_name = consignee_name;
      }

      public String getConsignee_telephone() {
            return consignee_telephone;
      }

      public void setConsignee_telephone(String consignee_telephone) {
            this.consignee_telephone = consignee_telephone;
      }

      public String getConsignee_email() {
            return consignee_email;
      }

      public void setConsignee_email(String consignee_email) {
            this.consignee_email = consignee_email;
      }

      public String getConsignee_fax() {
            return consignee_fax;
      }

      public void setConsignee_fax(String consignee_fax) {
            this.consignee_fax = consignee_fax;
      }
}
