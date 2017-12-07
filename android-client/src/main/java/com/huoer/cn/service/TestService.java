package com.huoer.cn.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@FeignClient(name="eureka",fallback=HystricTest.class)
@RibbonClients
public interface TestService {
	
	@RequestMapping(value="/order/order/name/{name}",method=RequestMethod.POST)
	public String getValue(@RequestParam("name") String name);
	@RequestMapping("/stock/stock/ue/ue")
	public String getException();
	
}
