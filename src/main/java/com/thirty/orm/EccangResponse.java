package com.thirty.orm;

import java.io.Serializable;

@SuppressWarnings("serial")
public class EccangResponse<T> implements Serializable {

      private Boolean ask;

      private T data;//response

      public EccangResponse() {
      }

      public EccangResponse(Boolean ask, T data) {
            this.ask = ask;
            this.data = data;
      }

      public Boolean getAsk() {
            return ask;
      }

      public void setAsk(Boolean ask) {
            this.ask = ask;
      }

      public T getData() {
            return data;
      }

      public void setData(T data) {
            this.data = data;
      }

      @Override
      public String toString() {
            return "EccangResponse{" +
                    "ask='" + ask + '\'' +
                    ", data=" + data +
                    '}';
      }
}
