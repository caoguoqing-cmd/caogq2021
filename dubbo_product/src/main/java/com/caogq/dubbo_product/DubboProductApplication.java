package com.caogq.dubbo_product;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DubboProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProductApplication.class, args);
        System.out.println("===================>生产者启动");
    }

}
