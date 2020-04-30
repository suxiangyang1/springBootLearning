package com.soft1851.spring.boot.check.annotation;

import com.soft1851.spring.boot.check.Validator.PhoneNumberValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author ysx
 */
@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = PhoneNumberValidator.class)
@Documented
public @interface PhoneNumber {

    /**
     * 校验不通知的执行
     * @return
     */
    String message() default "请输入正确的手机号";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
