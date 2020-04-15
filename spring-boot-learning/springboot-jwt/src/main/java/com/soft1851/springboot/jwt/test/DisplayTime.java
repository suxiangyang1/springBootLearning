package com.soft1851.springboot.jwt.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DisplayTime {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run(){
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                while(true){
                    System.out.println(sdf.format(new Date()));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        };
        thread.start();
    }
}
