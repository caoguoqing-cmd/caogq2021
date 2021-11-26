package com.caogq.dubbo_consumer.controller;

import com.caogq.dubbo_consumer.service.CountryConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author caogq
 * @description
 * @date 2021/11/26 16:46
 */
@RestController
public class CountryController {

    @Resource
    private CountryConsumerService countryConsumerService;

    @GetMapping("/get")
    public String get() {
        return countryConsumerService.isWho();
    }

}
