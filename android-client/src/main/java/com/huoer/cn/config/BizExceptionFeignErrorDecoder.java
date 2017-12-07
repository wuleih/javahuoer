package com.huoer.cn.config;

import com.netflix.hystrix.exception.HystrixBadRequestException;
import feign.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BizExceptionFeignErrorDecoder implements feign.codec.ErrorDecoder{

    private static final Logger logger = LoggerFactory.getLogger(BizExceptionFeignErrorDecoder.class);

    public Exception decode(String methodKey, Response response) {
        if(response.status() >= 400 && response.status() <= 499){
            return new HystrixBadRequestException("xxxxxx");
        }
        return feign.FeignException.errorStatus(methodKey, response);
    }
}
