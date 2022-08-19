package com.thirty.orm;

import java.util.List;

public class ModifyOrder {
      private String order_code;//Require	订单号
      private String reference_no;//Require	订单参考号
      private String aliexpress_order_no;//Option	平台订单号(例如速卖通平台订单号)
      private String platform;//Option	平台， ALIEXPRESS, AMAZON, B2C, EBAY, OTHER 默认OTHER
      private String shipping_method;//Require	配送方式，参考getShippingMethod
      private String warehouse_code;//Require	配送仓库，参考getWarehouse
      private String country_code;//Require	收件人国家，参考getCountry
      private String province;//Option	省
      private String city;//	Option	府/城市
      private String address1;//Require	地址1
      private String address2;//Option	地址2
      private String address3;//Option	地址3
      private String zipcode;//	Require	邮编
      private String doorplate;//Option	门牌号
      private String name;//	Require	收件人姓名
      private String phone;//	Option	收件人联系方式
      private String cell_phone;//Option	收件人联系方式2
      private String email;//	Option	收件人邮箱
      private String platform_shop;//Option	平台店铺
      private String order_desc;//Option	订单说明
      private Integer verify;//	Option	是否审核,0新建不审核(草稿状态)，1新建并审核， 默认为0， 审核通过之后，不可编辑
      private Integer forceVerify;//Option	是否强制审核(如欠费，缺货时是否审核到仓配系统), 0不强制，1强制， 默认为0 当verify==1时生效
      private List<ModifyOrderItems> items;//	Require	订单明细
      private String customs_company_name;//Option	清关公司名称
      private String customs_address;//Option	清关地址
      private String customs_contact_name;//Option	清关联系人
      private String customs_email;//Option	清关邮箱
      private String customs_tax_code;//Option	清关税号
      private String customs_phone;//Option	清关电话
      private String customs_city;//Option	清关城市
      private String customs_state;//Option	清关省/州
      private String customs_country_code;//Option	清关国家编码
      private String customs_postcode;//Option	清关邮编
      private String customs_doorplate;//Option	清关门牌号
      private String consignee_tax_number;//Option	收件人税号
      private String order_battery_type;//Option	电池型号
      private String vat_tax_code;//Option	VAT税号
      private String distribution_information;//Option	配货信息
      private Integer consignee_tax_type;//Option	收件人税号类型0无 1个人 2公司 3护照 4其他
      private String api_source;//Option	erp回调平台
      private String assign_date;//Option	配送指定日期；例如2021-01-01
      private String assign_time;//Option	配送指定时间；"00"：无指定； "01"：午前中 ；"12"：12時~14時 ；"14"：14時~16時 ；"16"：16時~18時 ；"18"：18時~20時 ；"19"：19時~21時 ；"04"：18時~21時
      private Integer is_merge;//Option	是否是合单订单，0不是，1是，默认为0
      private Integer merge_order_count;//Option	合单订单数量，不填默认为0 注意：非合单订单时（is_merge为0），合单订单数量无效为0
      private Integer insurance_type;//Option	保险类型 1:通达保&一件代发(保签收) ，3:通达保&一件代发(保签收后7天)，4:通达保&一件代发(保签收后14天),5:通达保&一件代发(保签收后21天) 不填默认为0
      private String insurance_type_goods_value;//Option	保留2位小数
      private Integer is_ju_order;//Option	是否为聚水潭下发的订单，1表示是，0表示否。默认值0

      public String getOrder_code() {
            return order_code;
      }

      public void setOrder_code(String order_code) {
            this.order_code = order_code;
      }

      public String getReference_no() {
            return reference_no;
      }

      public void setReference_no(String reference_no) {
            this.reference_no = reference_no;
      }

      public String getAliexpress_order_no() {
            return aliexpress_order_no;
      }

      public void setAliexpress_order_no(String aliexpress_order_no) {
            this.aliexpress_order_no = aliexpress_order_no;
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

      public String getDoorplate() {
            return doorplate;
      }

      public void setDoorplate(String doorplate) {
            this.doorplate = doorplate;
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

      public String getPlatform_shop() {
            return platform_shop;
      }

      public void setPlatform_shop(String platform_shop) {
            this.platform_shop = platform_shop;
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

      public List<ModifyOrderItems> getItems() {
            return items;
      }

      public void setItems(List<ModifyOrderItems> items) {
            this.items = items;
      }

      public String getCustoms_company_name() {
            return customs_company_name;
      }

      public void setCustoms_company_name(String customs_company_name) {
            this.customs_company_name = customs_company_name;
      }

      public String getCustoms_address() {
            return customs_address;
      }

      public void setCustoms_address(String customs_address) {
            this.customs_address = customs_address;
      }

      public String getCustoms_contact_name() {
            return customs_contact_name;
      }

      public void setCustoms_contact_name(String customs_contact_name) {
            this.customs_contact_name = customs_contact_name;
      }

      public String getCustoms_email() {
            return customs_email;
      }

      public void setCustoms_email(String customs_email) {
            this.customs_email = customs_email;
      }

      public String getCustoms_tax_code() {
            return customs_tax_code;
      }

      public void setCustoms_tax_code(String customs_tax_code) {
            this.customs_tax_code = customs_tax_code;
      }

      public String getCustoms_phone() {
            return customs_phone;
      }

      public void setCustoms_phone(String customs_phone) {
            this.customs_phone = customs_phone;
      }

      public String getCustoms_city() {
            return customs_city;
      }

      public void setCustoms_city(String customs_city) {
            this.customs_city = customs_city;
      }

      public String getCustoms_state() {
            return customs_state;
      }

      public void setCustoms_state(String customs_state) {
            this.customs_state = customs_state;
      }

      public String getCustoms_country_code() {
            return customs_country_code;
      }

      public void setCustoms_country_code(String customs_country_code) {
            this.customs_country_code = customs_country_code;
      }

      public String getCustoms_postcode() {
            return customs_postcode;
      }

      public void setCustoms_postcode(String customs_postcode) {
            this.customs_postcode = customs_postcode;
      }

      public String getCustoms_doorplate() {
            return customs_doorplate;
      }

      public void setCustoms_doorplate(String customs_doorplate) {
            this.customs_doorplate = customs_doorplate;
      }

      public String getConsignee_tax_number() {
            return consignee_tax_number;
      }

      public void setConsignee_tax_number(String consignee_tax_number) {
            this.consignee_tax_number = consignee_tax_number;
      }

      public String getOrder_battery_type() {
            return order_battery_type;
      }

      public void setOrder_battery_type(String order_battery_type) {
            this.order_battery_type = order_battery_type;
      }

      public String getVat_tax_code() {
            return vat_tax_code;
      }

      public void setVat_tax_code(String vat_tax_code) {
            this.vat_tax_code = vat_tax_code;
      }

      public String getDistribution_information() {
            return distribution_information;
      }

      public void setDistribution_information(String distribution_information) {
            this.distribution_information = distribution_information;
      }

      public Integer getConsignee_tax_type() {
            return consignee_tax_type;
      }

      public void setConsignee_tax_type(Integer consignee_tax_type) {
            this.consignee_tax_type = consignee_tax_type;
      }

      public String getApi_source() {
            return api_source;
      }

      public void setApi_source(String api_source) {
            this.api_source = api_source;
      }

      public String getAssign_date() {
            return assign_date;
      }

      public void setAssign_date(String assign_date) {
            this.assign_date = assign_date;
      }

      public String getAssign_time() {
            return assign_time;
      }

      public void setAssign_time(String assign_time) {
            this.assign_time = assign_time;
      }

      public Integer getIs_merge() {
            return is_merge;
      }

      public void setIs_merge(Integer is_merge) {
            this.is_merge = is_merge;
      }

      public Integer getMerge_order_count() {
            return merge_order_count;
      }

      public void setMerge_order_count(Integer merge_order_count) {
            this.merge_order_count = merge_order_count;
      }

      public Integer getInsurance_type() {
            return insurance_type;
      }

      public void setInsurance_type(Integer insurance_type) {
            this.insurance_type = insurance_type;
      }

      public String getInsurance_type_goods_value() {
            return insurance_type_goods_value;
      }

      public void setInsurance_type_goods_value(String insurance_type_goods_value) {
            this.insurance_type_goods_value = insurance_type_goods_value;
      }

      public Integer getIs_ju_order() {
            return is_ju_order;
      }

      public void setIs_ju_order(Integer is_ju_order) {
            this.is_ju_order = is_ju_order;
      }
}
