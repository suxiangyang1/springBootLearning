package com.soft1851.springboot.bmp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ysx
 */

@SpringBootApplication
@MapperScan("com.soft1851.springboot.bmp.mapper")
@ComponentScan("com.soft1851.springboot.bmp.service")
@ComponentScan("com.soft1851.springboot.bmp.controller")
@EntityScan("com.soft1851.springboot.bmp.model")
public class SpringBootBmpApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootBmpApplication.class, args);
    }

}
