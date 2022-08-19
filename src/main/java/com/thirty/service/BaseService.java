package com.thirty.service;

import com.thirty.annotation.Service;
import com.thirty.exception.ServiceException;
import com.thirty.orm.BaseRequestParam;
import com.thirty.util.WebUtil;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class BaseService {

      private final Map<String, Method> methodMap = new HashMap<>();

      private BaseRequestParam param;

      public BaseService(BaseRequestParam param) {
            this.param = param;
            Method[] methods = this.getClass().getDeclaredMethods();
            for (Method method : methods) {
                  methodMap.put(method.getName(), method);
            }
      }

      protected <T> T callByBody(Object obj) throws ServiceException {
            String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
            Method method = methodMap.get(methodName);
            Service service = method.getAnnotation(Service.class);
            if (null == service) {
                  throw new ServiceException("服务未找到Service注解");
            }
            return WebUtil.call(service, obj, param);
      }


}
