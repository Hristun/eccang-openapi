package com.thirty.orm;

import java.util.List;

public class ModifyAsn {

      private String receiving_code;//Require 入库单号

      private String reference_no;//Require 入库单参考号

      private Integer income_type;//Option 交货方式，0自送，1揽收

      private String warehouse_code;//Require 目的仓

      private String transit_warehouse_code;//Option 中转仓库，交货方式为自送时，必填

      private String shipping_method;//Option 到仓方式

      private String entiry_code;//Option entiry号

      private String tracking_number;//Option 跟踪号(可传多个以英文逗号隔开，需开启 BATCH_TRACKING_NUMBER 这个配置)

      private String receiving_desc;//Option 入库单描述

      private String eta_date;//Option 预计到达日期

      private String contacter;//Option 联系人，交货方式为揽收时，必填

      private String contact_phone;//Option 联系电话，交货方式为揽收时，必填

      private Integer region_id_level0;// Option 揽收支持的省ID，交货方式为揽收时，必填，参考getRegionForReceiving

      private Integer region_id_level1;// Option 揽收支持的市ID，交货方式为揽收时，必填，参考getRegionForReceiving

      private Integer region_id_level2;// Option 揽收支持的区ID，交货方式为揽收时，必填，参考getRegionForReceiving

      private String street;// Option 揽收地址，交货方式为揽收时，必填

      private String tax_type;//Option 关税类型：P：实报实销；默认为空

      private String customer_type;//Option 报关类型：Y：单独退税报关；N：无退税报关；;默认为空

      private Integer container_type;//Option 货柜类型：1:20GP;2:40GP；3:40HQ；4:45GP；5:45HQ；默认为0(定制接口参数)

      private Integer bulk_cargo_type;//Option 散货类型（托）：0:否;1:是；默认为0(定制接口参数，若开启相关配置与container_type参数二选一)

      private Integer pallet_cnt;//Option 托数量

      private Integer is_save_inventory_code;// Option 是否生成批次库存；0否，1是；默认0

      private Integer bulk_cargo_type_piece;// Option 散货类型（件）：0:否;1:是；默认为0(定制接口参数，若开启相关配置：PS_IS_OPEN_CONTAINER与container_type和bulk_cargo_type参数三选一)

      private String vat_tax_code;//Option VAT税号

      private Integer verify;// Option 是否审核,0新建不审核(草稿状态)，1新建并审核， 默认为0， 审核通过之后，不可编辑

      private String verify_source;//Option 审核来源（区分系统） 默认为WMS，

      private String stock_type;//Option 入库单库存类型：0=以仓库为准,1=标准区,2=暂存区,5=以箱为准(注意前三种库存类型是按单维度，所有箱都是同种库存类型；以箱为准库存类型,是与item.inventory_type参数组合使用)

      private List<AsnItemsDTOParam> items;// Require 入库单明细

      public String getReceiving_code() {
            return receiving_code;
      }

      public void setReceiving_code(String receiving_code) {
            this.receiving_code = receiving_code;
      }

      public String getReference_no() {
            return reference_no;
      }

      public void setReference_no(String reference_no) {
            this.reference_no = reference_no;
      }

      public Integer getIncome_type() {
            return income_type;
      }

      public void setIncome_type(Integer income_type) {
            this.income_type = income_type;
      }

      public String getWarehouse_code() {
            return warehouse_code;
      }

      public void setWarehouse_code(String warehouse_code) {
            this.warehouse_code = warehouse_code;
      }

      public String getTransit_warehouse_code() {
            return transit_warehouse_code;
      }

      public void setTransit_warehouse_code(String transit_warehouse_code) {
            this.transit_warehouse_code = transit_warehouse_code;
      }

      public String getShipping_method() {
            return shipping_method;
      }

      public void setShipping_method(String shipping_method) {
            this.shipping_method = shipping_method;
      }

      public String getEntiry_code() {
            return entiry_code;
      }

      public void setEntiry_code(String entiry_code) {
            this.entiry_code = entiry_code;
      }

      public String getTracking_number() {
            return tracking_number;
      }

      public void setTracking_number(String tracking_number) {
            this.tracking_number = tracking_number;
      }

      public String getReceiving_desc() {
            return receiving_desc;
      }

      public void setReceiving_desc(String receiving_desc) {
            this.receiving_desc = receiving_desc;
      }

      public String getEta_date() {
            return eta_date;
      }

      public void setEta_date(String eta_date) {
            this.eta_date = eta_date;
      }

      public String getContacter() {
            return contacter;
      }

      public void setContacter(String contacter) {
            this.contacter = contacter;
      }

      public String getContact_phone() {
            return contact_phone;
      }

      public void setContact_phone(String contact_phone) {
            this.contact_phone = contact_phone;
      }

      public Integer getRegion_id_level0() {
            return region_id_level0;
      }

      public void setRegion_id_level0(Integer region_id_level0) {
            this.region_id_level0 = region_id_level0;
      }

      public Integer getRegion_id_level1() {
            return region_id_level1;
      }

      public void setRegion_id_level1(Integer region_id_level1) {
            this.region_id_level1 = region_id_level1;
      }

      public Integer getRegion_id_level2() {
            return region_id_level2;
      }

      public void setRegion_id_level2(Integer region_id_level2) {
            this.region_id_level2 = region_id_level2;
      }

      public String getStreet() {
            return street;
      }

      public void setStreet(String street) {
            this.street = street;
      }

      public String getTax_type() {
            return tax_type;
      }

      public void setTax_type(String tax_type) {
            this.tax_type = tax_type;
      }

      public String getCustomer_type() {
            return customer_type;
      }

      public void setCustomer_type(String customer_type) {
            this.customer_type = customer_type;
      }

      public Integer getContainer_type() {
            return container_type;
      }

      public void setContainer_type(Integer container_type) {
            this.container_type = container_type;
      }

      public Integer getBulk_cargo_type() {
            return bulk_cargo_type;
      }

      public void setBulk_cargo_type(Integer bulk_cargo_type) {
            this.bulk_cargo_type = bulk_cargo_type;
      }

      public Integer getPallet_cnt() {
            return pallet_cnt;
      }

      public void setPallet_cnt(Integer pallet_cnt) {
            this.pallet_cnt = pallet_cnt;
      }

      public Integer getIs_save_inventory_code() {
            return is_save_inventory_code;
      }

      public void setIs_save_inventory_code(Integer is_save_inventory_code) {
            this.is_save_inventory_code = is_save_inventory_code;
      }

      public Integer getBulk_cargo_type_piece() {
            return bulk_cargo_type_piece;
      }

      public void setBulk_cargo_type_piece(Integer bulk_cargo_type_piece) {
            this.bulk_cargo_type_piece = bulk_cargo_type_piece;
      }

      public String getVat_tax_code() {
            return vat_tax_code;
      }

      public void setVat_tax_code(String vat_tax_code) {
            this.vat_tax_code = vat_tax_code;
      }

      public Integer getVerify() {
            return verify;
      }

      public void setVerify(Integer verify) {
            this.verify = verify;
      }

      public String getVerify_source() {
            return verify_source;
      }

      public void setVerify_source(String verify_source) {
            this.verify_source = verify_source;
      }

      public String getStock_type() {
            return stock_type;
      }

      public void setStock_type(String stock_type) {
            this.stock_type = stock_type;
      }

      public List<AsnItemsDTOParam> getItems() {
            return items;
      }

      public void setItems(List<AsnItemsDTOParam> items) {
            this.items = items;
      }
}
