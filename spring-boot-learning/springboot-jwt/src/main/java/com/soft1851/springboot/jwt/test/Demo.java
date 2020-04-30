package com.soft1851.springboot.jwt.test;

import java.util.Date;

/**
 * @author ysx
 */

public class Demo {
    public static void main(String[] args) {
        Date d = new Date(System.currentTimeMillis() + 10L * 1000L);
        System.out.println(d);
        while ((new Date()).before(d)){
            if ((new Date()).before(d)){
                System.out.println("有效");
            }else {
                System.out.println("无效");
            }
        }
    }
}
