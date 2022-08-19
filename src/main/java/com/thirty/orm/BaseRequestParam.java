package com.thirty.orm;

public class BaseRequestParam {

      private String appToken;//		Yes	API密钥

      private String appKey;//	Yes	API标识

      private String url;//	Yes	访问的易仓url

      public String getAppToken() {
            return appToken;
      }

      public void setAppToken(String appToken) {
            this.appToken = appToken;
      }

      public String getAppKey() {
            return appKey;
      }

      public void setAppKey(String appKey) {
            this.appKey = appKey;
      }

      public String getUrl() {
            return url;
      }

      public void setUrl(String url) {
            this.url = url;
      }
}
