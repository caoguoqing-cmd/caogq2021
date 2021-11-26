package com.caogq.dubbo_consumer.service.impl;

import com.caogq.dubbo_consumer.service.CountryConsumerService;
import com.caogq.dubbo_interface.service.CountryService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author caogq
 * @description
 * @date 2021/11/26 16:26
 */
@Service
public class CountryConsumerServiceImpl implements CountryConsumerService {

    @Reference
    private CountryService countryService;
    @Override
    public String isWho() {
        return countryService.getCountryName();
    }
}
