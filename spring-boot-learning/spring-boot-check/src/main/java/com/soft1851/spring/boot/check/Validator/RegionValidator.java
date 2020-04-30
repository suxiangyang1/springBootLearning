package com.soft1851.spring.boot.check.Validator;

import com.soft1851.spring.boot.check.annotation.Region;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;

/**
 * @author ysx
 */

public class RegionValidator implements ConstraintValidator<Region,String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        HashSet<Object> regions = new HashSet<>();
        regions.add("China");
        regions.add("China-TaiWan");
        regions.add("China-HongKong");
        return regions.contains(s);
    }
}
