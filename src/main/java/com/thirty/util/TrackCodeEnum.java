package com.thirty.util;

import java.util.HashMap;
import java.util.Map;

public enum TrackCodeEnum {

      AC("AC","清关异常","Abnormal clearance"),
      AD("AD","派送异常","Abnormal delivery"),
      AF("AF","已上网","arrived at facility"),
      AO("AO","操作异常","Abnormal Operation"),
      AT("AT","转运异常","Abnormal transfer"),
      CC("CC","派送妥投","Case Close"),
      DA("DA","派送异常","Delivery accident"),
      NC("NC","清关中","Normal clearance"),
      ND("ND","派送中","Normal delivery"),
      NE("NE","包裹异常","Unknown Exception"),
      NO("NO","未上网","Normal Operation"),
      NT("NT","转运中","Normal transfer"),
      UE("UE","退件","Untread Expressage"),
      NA("NA","待接受","No Accepted"),
      IS("IS","在库","In stock"),
      CP("CP","完成","Completed"),
      RP("RP","接收","Reception");

      TrackCodeEnum(String code, String descCn, String descEn) {
            this.code = code;
            this.descCn = descCn;
            this.descEn = descEn;
      }

      private final String code;
      private final String descCn;
      private final String descEn;

      public String getCode() {
            return code;
      }

      public String getDescCn() {
            return descCn;
      }

      public String getDescEn() {
            return descEn;
      }

      public static Map<String, String> getOptions() {
            Map<String, String> options = new HashMap<>();
            TrackCodeEnum[] values = TrackCodeEnum.values();
            for (TrackCodeEnum value : values) {
                  options.put(value.getDescEn().toUpperCase(), value.toString());
            }
            return options;
      }
}
