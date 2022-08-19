package com.thirty.orm;

public class CancelOrder {
      private String order_code;//Require	订单号
      private String reason;//Option	截单原因

      public String getOrder_code() {
            return order_code;
      }

      public void setOrder_code(String order_code) {
            this.order_code = order_code;
      }

      public String getReason() {
            return reason;
      }

      public void setReason(String reason) {
            this.reason = reason;
      }
}
