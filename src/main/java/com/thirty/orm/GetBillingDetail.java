package com.thirty.orm;

public class GetBillingDetail {
      private String warehouse_code;//Require仓库代码
      private String business;//Require业务类型：RECEIVING(入库单),ORDER(订单),RETURN(退件),FBA(FBA),RENT(仓租),CLAIM_ORDER(认领),FBA_RENT(FBA仓租),FBA_TRANSIT_ORDER(FBA转运单),FBA_BACK(FBA退件),FBA_PLATFORM_ORDER(FBA平台订单),FBA_EXCH(FBA退货换标),FBA_RECEIVING(FBA入库单),PACKAGE(包裹订单),PROCESSING_ORDER(集运),OTHER(其他)
      private String bill_code;//Option业务单号 (业务单号不为空时,业务类型可不填写)
      private Integer check_status;//Option核账状态：A全部，C已核账，N未核账
      private String start_time;//Option计费开始时间
      private String end_time;//Option计费结束时间
      private Integer page;//Option当前页面
      private Integer pageSize;//Option页面显示条数[0--100]

      public String getWarehouse_code() {
            return warehouse_code;
      }

      public void setWarehouse_code(String warehouse_code) {
            this.warehouse_code = warehouse_code;
      }

      public String getBusiness() {
            return business;
      }

      public void setBusiness(String business) {
            this.business = business;
      }

      public String getBill_code() {
            return bill_code;
      }

      public void setBill_code(String bill_code) {
            this.bill_code = bill_code;
      }

      public Integer getCheck_status() {
            return check_status;
      }

      public void setCheck_status(Integer check_status) {
            this.check_status = check_status;
      }

      public String getStart_time() {
            return start_time;
      }

      public void setStart_time(String start_time) {
            this.start_time = start_time;
      }

      public String getEnd_time() {
            return end_time;
      }

      public void setEnd_time(String end_time) {
            this.end_time = end_time;
      }

      public Integer getPage() {
            return page;
      }

      public void setPage(Integer page) {
            this.page = page;
      }

      public Integer getPageSize() {
            return pageSize;
      }

      public void setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
      }
}
