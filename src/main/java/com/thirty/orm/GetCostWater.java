package com.thirty.orm;

public class GetCostWater {
      private String cbl_refer_code;//否	单号
      private String ft_code;//否	费用类型
      private String addDateFrom;//否	创建开始时间
      private String addDateEnd;//否	创建结束时间
      private Integer page;//是	当前页面
      private Integer pageSize;//是	页面显示条数[0--100]

      public String getCbl_refer_code() {
            return cbl_refer_code;
      }

      public void setCbl_refer_code(String cbl_refer_code) {
            this.cbl_refer_code = cbl_refer_code;
      }

      public String getFt_code() {
            return ft_code;
      }

      public void setFt_code(String ft_code) {
            this.ft_code = ft_code;
      }

      public String getAddDateFrom() {
            return addDateFrom;
      }

      public void setAddDateFrom(String addDateFrom) {
            this.addDateFrom = addDateFrom;
      }

      public String getAddDateEnd() {
            return addDateEnd;
      }

      public void setAddDateEnd(String addDateEnd) {
            this.addDateEnd = addDateEnd;
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
