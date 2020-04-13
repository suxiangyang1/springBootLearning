package com.soft1851.springboot.aop.controller;

import com.soft1851.springboot.aop.annortation.ControllerWebLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author ysx
 */
@RestController
@RequestMapping(value = "/api/")
@Slf4j
public class HelloController {

    /**
     * 采用自定的WebLog日志注解，记录调用的接口方法名，是否需要持久化
     */

    @RequestMapping(value = "hello")
    @ControllerWebLog(name = "getHello()",isSaved = true)
    public String getHello(String args1 ,String args2) {
        log.info("控制层获得参数：" + args1);
        log.info("控制层获得参数：" + args1);
        //休眠，模拟接口耗时
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello spring boot";
    }
}
