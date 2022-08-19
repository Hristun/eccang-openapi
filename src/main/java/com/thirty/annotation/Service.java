package com.thirty.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author bright
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Service {
    /**
     * 请求api接口方法名
     *
     * @return
     */
    String apiMethod();

    /**
     * 查看开放平台接口文档中是否需要token
     *
     * @return
     */
    boolean needToken() default false;

    /**
     * 自定义返回类型
     *
     * @return
     */
    Class<?> returnClazz() default Object.class;
}
