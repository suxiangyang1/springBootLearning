package com.soft1851.spring.boot.oauth.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ysx
 */
@RestController
public class TestController {
    @RequestMapping("/index")
    public String simpleIndex(ModelMap map){
        return "index";
    }
}
