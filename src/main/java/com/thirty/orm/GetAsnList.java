package com.thirty.orm;

import java.util.List;

public class GetAsnList {

      private Integer pageSize;//Require 每页数据长度，最大值为20

      private Integer page;// Require 当前页

      private String receiving_id;//Option 入库单ID

      private String receiving_code;//Option 入库单号

      private List<String> receiving_code_arr;//Option 多个入库单号,数组格式

      private String reference_no;//Option 参考号

      private List<String> reference_no_arr;//Option 多个参考号,数组格式

      private String create_date_from;//Option 起始时间(创建时间,有入库单号的时候此参数失效)

      private String create_date_to;//Option 结束时间(创建时间,有入库单号的时候此参数失效)

      private String modify_date_from;//Option 起始时间(修改时间,有入库单号的时候此参数失效)

      private String modify_date_to;//Option 结束时间(修改时间,有入库单号的时候此参数失效)

      private String business_type;//Option 保税用户填1,其它可不填

      private Integer is_get_inventory_code;//Option 是否返回库存批次号字段；0否，1是；默认0

      public Integer getPageSize() {
            return pageSize;
      }

      public void setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
      }

      public Integer getPage() {
            return page;
      }

      public void setPage(Integer page) {
            this.page = page;
      }

      public String getReceiving_id() {
            return receiving_id;
      }

      public void setReceiving_id(String receiving_id) {
            this.receiving_id = receiving_id;
      }

      public String getReceiving_code() {
            return receiving_code;
      }

      public void setReceiving_code(String receiving_code) {
            this.receiving_code = receiving_code;
      }

      public List<String> getReceiving_code_arr() {
            return receiving_code_arr;
      }

      public void setReceiving_code_arr(List<String> receiving_code_arr) {
            this.receiving_code_arr = receiving_code_arr;
      }

      public String getReference_no() {
            return reference_no;
      }

      public void setReference_no(String reference_no) {
            this.reference_no = reference_no;
      }

      public List<String> getReference_no_arr() {
            return reference_no_arr;
      }

      public void setReference_no_arr(List<String> reference_no_arr) {
            this.reference_no_arr = reference_no_arr;
      }

      public String getCreate_date_from() {
            return create_date_from;
      }

      public void setCreate_date_from(String create_date_from) {
            this.create_date_from = create_date_from;
      }

      public String getCreate_date_to() {
            return create_date_to;
      }

      public void setCreate_date_to(String create_date_to) {
            this.create_date_to = create_date_to;
      }

      public String getModify_date_from() {
            return modify_date_from;
      }

      public void setModify_date_from(String modify_date_from) {
            this.modify_date_from = modify_date_from;
      }

      public String getModify_date_to() {
            return modify_date_to;
      }

      public void setModify_date_to(String modify_date_to) {
            this.modify_date_to = modify_date_to;
      }

      public String getBusiness_type() {
            return business_type;
      }

      public void setBusiness_type(String business_type) {
            this.business_type = business_type;
      }

      public Integer getIs_get_inventory_code() {
            return is_get_inventory_code;
      }

      public void setIs_get_inventory_code(Integer is_get_inventory_code) {
            this.is_get_inventory_code = is_get_inventory_code;
      }
}
