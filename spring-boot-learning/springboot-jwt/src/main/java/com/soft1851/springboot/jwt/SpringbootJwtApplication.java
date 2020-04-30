package com.soft1851.springboot.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ysx
 */

@SpringBootApplication
@ComponentScan("com.soft1851.springboot.jwt.*")
public class SpringbootJwtApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootJwtApplication.class, args);
    }
}
