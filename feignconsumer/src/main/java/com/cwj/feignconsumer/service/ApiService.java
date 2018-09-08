package com.cwj.feignconsumer.service;


import com.cwj.feignconsumer.service.impl.ApiServiceError;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient(value = "eurekaprovider",fallback=ApiServiceError.class )
public interface ApiService {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String hello();
}
