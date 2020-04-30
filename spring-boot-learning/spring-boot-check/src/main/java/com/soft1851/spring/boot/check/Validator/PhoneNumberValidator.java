package com.soft1851.spring.boot.check.Validator;

import com.soft1851.spring.boot.check.annotation.PhoneNumber;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author ysx
 */

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber,String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(!StringUtils.isEmpty(s)){

            //获取默认提示信息
            String defaultConstraintMessageTemplate = constraintValidatorContext.getDefaultConstraintMessageTemplate();
//            System.out.println("default message :" + defaultConstraintMessageTemplate);
            //禁用默认提示信息
            constraintValidatorContext.disableDefaultConstraintViolation();
            //设置提示语
            constraintValidatorContext.buildConstraintViolationWithTemplate("手机号格式错误").addConstraintViolation();

            String regex = "^1(3|4|5|7|8)\\d{9}$";
            return s.matches(regex);
        }
        return true;

    }
}
