package com.soft1851.spring.boot.check.Service;

import com.soft1851.spring.boot.check.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @author ysx
 */
@Validated
@Slf4j
@Service
public class PersonService {
    public void validatePerson(@Valid Person person) {
        log.info("service方法验证");
    }
}
