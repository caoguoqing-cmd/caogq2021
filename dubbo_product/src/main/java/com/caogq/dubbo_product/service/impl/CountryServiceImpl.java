package com.caogq.dubbo_product.service.impl;

import com.caogq.dubbo_interface.service.CountryService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author caogq
 * @description
 * @date 2021/11/26 16:05
 */
@Service
@Component
public class CountryServiceImpl implements CountryService {

    @Override
    public String getCountryName() {
        return "中华人民共和国";
    }
}
