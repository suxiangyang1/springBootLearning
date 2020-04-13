package com.soft1851.springboot.aop.annortation;

import java.lang.annotation.*;

/**
 * @author ysx
 * 自定义Web日志注解
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ControllerWebLog {
    /**
     * 调用的接口名称
     * @return
     */
    String name();

    /**
     * 标识该日志是否需要持久化存储
     * @return
     */
    boolean isSaved() default false;
}
