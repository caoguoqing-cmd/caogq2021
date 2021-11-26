package com.caogq.my_dubbo_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyDubboServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyDubboServiceApplication.class, args);
        System.out.println("===============>服务启动");
    }

}
