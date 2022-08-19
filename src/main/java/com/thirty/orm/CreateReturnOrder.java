package com.thirty.orm;

import java.util.List;

public class CreateReturnOrder {
      private String reference_no;//Require	退仓订单参考号(建议使用平台单号)
      private String platform;//Option	平台， ALIEXPRESS, AMAZON, B2C, EBAY, OTHER 默认OTHER
      private String shipping_method;//Require	配送方式，参考getShippingMethod
      private String warehouse_code;//Require	配送仓库，参考getWarehouse
      private String country_code;//Require	收件人国家，参考getCountry
      private String province;//Option	省
      private String city;//	Option	府/城市
      private String district;//Option	收件人区
      private String address1;//Require	地址1 (length:30)
      private String address2;//Option	地址2 (length:30)
      private String address3;//Option	地址3 (length:30)
      private String zipcode;//	Require	邮编
      private String license;//	Option	收件人证件号
      private String doorplate;//Option	门牌号
      private String company;//	Option	公司名
      private String name;//	Require	收件人姓名
      private String phone;//	Require	收件人联系方式
      private String cell_phone;//Option	收件人联系方式2
      private String email;//	Option	收件人邮箱
      private Integer is_signature;//Option	签名服务: 0:否 1:是
      private Integer is_insurance;//Option	保险服务: 0:否 1:是
      private Integer insurance_value;//Option	投保金额
      private String order_desc;//Option	退仓订单说明
      private Integer verify;//	Option	是否审核,0新建不审核(草稿状态)，1新建并审核， 默认为0， 审核通过之后，不可编辑
      private Integer forceVerify;//Option	是否强制审核(如欠费，缺货时是否审核到仓配系统), 0不强制，1强制， 默认为0 当verify==1时生效
      private Integer is_assign_receiving;//Option	是否指定入库单 0不指定 1指定 不传默认为0
      private List<CreateReturnOrderItems> items;//	Require	退仓订单明细
      private String tracking_no;//Option	跟踪号

      public String getReference_no() {
            return reference_no;
      }

      public void setReference_no(String reference_no) {
            this.reference_no = reference_no;
      }

      public String getPlatform() {
            return platform;
      }

      public void setPlatform(String platform) {
            this.platform = platform;
      }

      public String getShipping_method() {
            return shipping_method;
      }

      public void setShipping_method(String shipping_method) {
            this.shipping_method = shipping_method;
      }

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

      public String getProvince() {
            return province;
      }

      public void setProvince(String province) {
            this.province = province;
      }

      public String getCity() {
            return city;
      }

      public void setCity(String city) {
            this.city = city;
      }

      public String getDistrict() {
            return district;
      }

      public void setDistrict(String district) {
            this.district = district;
      }

      public String getAddress1() {
            return address1;
      }

      public void setAddress1(String address1) {
            this.address1 = address1;
      }

      public String getAddress2() {
            return address2;
      }

      public void setAddress2(String address2) {
            this.address2 = address2;
      }

      public String getAddress3() {
            return address3;
      }

      public void setAddress3(String address3) {
            this.address3 = address3;
      }

      public String getZipcode() {
            return zipcode;
      }

      public void setZipcode(String zipcode) {
            this.zipcode = zipcode;
      }

      public String getLicense() {
            return license;
      }

      public void setLicense(String license) {
            this.license = license;
      }

      public String getDoorplate() {
            return doorplate;
      }

      public void setDoorplate(String doorplate) {
            this.doorplate = doorplate;
      }

      public String getCompany() {
            return company;
      }

      public void setCompany(String company) {
            this.company = company;
      }

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      public String getPhone() {
            return phone;
      }

      public void setPhone(String phone) {
            this.phone = phone;
      }

      public String getCell_phone() {
            return cell_phone;
      }

      public void setCell_phone(String cell_phone) {
            this.cell_phone = cell_phone;
      }

      public String getEmail() {
            return email;
      }

      public void setEmail(String email) {
            this.email = email;
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

      public Integer getInsurance_value() {
            return insurance_value;
      }

      public void setInsurance_value(Integer insurance_value) {
            this.insurance_value = insurance_value;
      }

      public String getOrder_desc() {
            return order_desc;
      }

      public void setOrder_desc(String order_desc) {
            this.order_desc = order_desc;
      }

      public Integer getVerify() {
            return verify;
      }

      public void setVerify(Integer verify) {
            this.verify = verify;
      }

      public Integer getForceVerify() {
            return forceVerify;
      }

      public void setForceVerify(Integer forceVerify) {
            this.forceVerify = forceVerify;
      }

      public Integer getIs_assign_receiving() {
            return is_assign_receiving;
      }

      public void setIs_assign_receiving(Integer is_assign_receiving) {
            this.is_assign_receiving = is_assign_receiving;
      }

      public List<CreateReturnOrderItems> getItems() {
            return items;
      }

      public void setItems(List<CreateReturnOrderItems> items) {
            this.items = items;
      }

      public String getTracking_no() {
            return tracking_no;
      }

      public void setTracking_no(String tracking_no) {
            this.tracking_no = tracking_no;
      }
}
