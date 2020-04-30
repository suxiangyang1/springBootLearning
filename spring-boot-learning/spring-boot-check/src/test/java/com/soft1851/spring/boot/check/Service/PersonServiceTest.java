package com.soft1851.spring.boot.check.Service;

import com.soft1851.spring.boot.check.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.Constants;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.annotation.Resource;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

@SpringBootTest
class PersonServiceTest {
    @Resource
    private PersonService personService;

    @Test
    @ExceptionHandler(Constants.ConstantException.class)
    void validatePerson() {
        Person person = new Person();
        person.setId("123");
        person.setName("soft1851");
        person.setAge(19);
        person.setPhone("15178114095");
        person.setEmail("soft1851@qq.com");
        person.setSex("男");
        personService.validatePerson(person);
    }

    @Test
    void checkManually() {
        //通过Validator 工厂类获得 Validator实例,也可以通过注入的方式
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Person person = new Person();
        person.setId("123");
        person.setSex("Man2");
        person.setPhone("11178114095");
        person.setEmail("soft1851@qq.com");
        //通过参数进行检验,得到一致结果
        Set<ConstraintViolation<Person>> violations = validator.validate(person);
        for (ConstraintViolation<Person> constraintViolation:violations) {
            System.out.println(constraintViolation.getMessage());
        }
    }
}