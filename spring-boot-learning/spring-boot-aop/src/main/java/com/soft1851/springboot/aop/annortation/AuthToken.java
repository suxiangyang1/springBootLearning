package com.soft1851.springboot.aop.annortation;

import java.lang.annotation.*;

/**
 * @author ysx
 */

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuthToken {

    /**
     * 访问接口所需要的身份，默认为空，及登录既可以访问，可以定义多个
     */

    String[] role_name() default "";
}
