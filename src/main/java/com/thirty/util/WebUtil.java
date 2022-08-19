package com.thirty.util;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.fasterxml.jackson.databind.JavaType;
import com.thirty.annotation.Service;
import com.thirty.orm.BaseRequestParam;
import com.thirty.orm.EccangResponse;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebUtil {

      public static <T> T call(Service service, Object object, BaseRequestParam param) {
            EccangResponse response = new EccangResponse();
            StringBuilder builder = new StringBuilder();
            builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            builder.append("<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns1=\"http://www.example.org/Ec/\">");
            builder.append("    <SOAP-ENV:Body>");
            builder.append("        <ns1:callService>");
            builder.append("            <paramsJson>");
            //入参
            builder.append(JacksonUtils.obj2json(object));

            builder.append("            </paramsJson>");
            builder.append("            <appToken>" + param.getAppToken() + "</appToken>");
            builder.append("            <appKey>" + param.getAppKey() + "</appKey>");
            builder.append("            <service>" + service.apiMethod() + "</service>");
            builder.append("        </ns1:callService>");
            builder.append("    </SOAP-ENV:Body>");
            builder.append("</SOAP-ENV:Envelope>");
            System.out.println(builder.toString());
            HttpResponse httpResponse = HttpRequest.post(param.getUrl())//
                    .header("Content-Type", "application/xml;charset=UTF-8;")//
                    .body(builder.toString())//
                    .execute();
            String responseBody = httpResponse.body();
            JavaType javaType = JacksonUtils.getJavaType(EccangResponse.class, service.returnClazz());
            if (isBlank(responseBody)) {
                  response.setAsk(false);
                  response.setData("请求无响应");
                  return JacksonUtils.json2pojo(JacksonUtils.obj2json(response), javaType);
            }
            String res = extractContent("<response>(.*)</response>", responseBody);
            if (res.contains("Success")) {
                  response.setAsk(true);
                  response.setData(res);
            } else {
                  response.setAsk(false);
                  response.setData("请求失败！");
            }
            return JacksonUtils.json2pojo(JacksonUtils.obj2json(response), javaType);
      }

      /**
       * <提取内容.>
       * @param regex
       * @param xml
       * @return
       * @see [类、类#方法、类#成员]
       */
      protected static String extractContent(String regex, String xml) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(xml);
            String content = "";
            while (matcher.find()) {
                  content = matcher.group(1);
            }
            return content;
      }

      /**
       * <字符串非空判断.>
       * @param cs
       * @return
       * @see [类、类#方法、类#成员]
       */
      protected static boolean isBlank(final CharSequence cs) {
            int strLen;
            if (cs == null || (strLen = cs.length()) == 0) {
                  return true;
            }
            for (int i = 0; i < strLen; i++) {
                  if (!Character.isWhitespace(cs.charAt(i))) {
                        return false;
                  }
            }
            return true;
      }

}
