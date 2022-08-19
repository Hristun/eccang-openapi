package com.thirty.orm;

import java.util.List;

public class AddTracking {
      private String trackingNumber;//Require	跟踪号
      private String source;//Option	来源（客户自己定义估计来源 例如:SF）
      private List<AddTrackingDetail> detail;//Require	轨迹详情

      public String getTrackingNumber() {
            return trackingNumber;
      }

      public void setTrackingNumber(String trackingNumber) {
            this.trackingNumber = trackingNumber;
      }

      public String getSource() {
            return source;
      }

      public void setSource(String source) {
            this.source = source;
      }

      public List<AddTrackingDetail> getDetail() {
            return detail;
      }

      public void setDetail(List<AddTrackingDetail> detail) {
            this.detail = detail;
      }

      public class AddTrackingDetail {
            private String trackNumber;//Require	跟踪号
            private String deliveryDate;//Require	轨迹时间
            private String locationCode;//Option	轨迹地点
            private String status;//Option	轨迹状态
            private String trackCode;//Option	节点顺序号/轨迹状态码 （默认请填轨迹状态码,必要情况自定义）
            private String trackDescription;//Require	轨迹描述

            public String getTrackNumber() {
                  return trackNumber;
            }

            public void setTrackNumber(String trackNumber) {
                  this.trackNumber = trackNumber;
            }

            public String getDeliveryDate() {
                  return deliveryDate;
            }

            public void setDeliveryDate(String deliveryDate) {
                  this.deliveryDate = deliveryDate;
            }

            public String getLocationCode() {
                  return locationCode;
            }

            public void setLocationCode(String locationCode) {
                  this.locationCode = locationCode;
            }

            public String getStatus() {
                  return status;
            }

            public void setStatus(String status) {
                  this.status = status;
            }

            public String getTrackCode() {
                  return trackCode;
            }

            public void setTrackCode(String trackCode) {
                  this.trackCode = trackCode;
            }

            public String getTrackDescription() {
                  return trackDescription;
            }

            public void setTrackDescription(String trackDescription) {
                  this.trackDescription = trackDescription;
            }
      }
}
