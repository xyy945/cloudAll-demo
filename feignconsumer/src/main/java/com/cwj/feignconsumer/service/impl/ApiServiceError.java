package com.cwj.feignconsumer.service.impl;

import com.cwj.feignconsumer.service.ApiService;
import org.springframework.stereotype.Component;

/**
 * Created by cwj on 2018/9/8 18:39
 * Description:
 */
@Component
public class ApiServiceError implements ApiService {
    @Override
    public String hello() {
        return "hhh,中奖了。。。。";
    }
}
