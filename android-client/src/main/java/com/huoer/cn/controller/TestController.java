package com.huoer.cn.controller;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huoer.cn.aspectj.ActionControllerLog;
import com.huoer.cn.service.TestService;

@Controller
@RequestMapping("/app")
public class TestController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);
	
	/*@Autowired
	private TemplateService rs;*/
	
	@Autowired
	private TestService testService;
	
	@RequestMapping("/name/{name}")
	@ActionControllerLog(title="aspectj测试动态代理",channel="springfeign项目",action="名称")
	//@ExceptionHandler(RuntimeException.class)
	public String getName(@PathVariable String name,ModelMap model,HttpServletResponse res) throws Exception{
		
		ExecutorService es = Executors.newFixedThreadPool(1);
		
		CompletableFuture<String> cf = CompletableFuture.supplyAsync(()->{
			System.err.println("id1-------"+Thread.currentThread().getId());
			return testService.getValue(name);
		}, es);
		
		//cf.thenAcceptAsync(()->{cf.get()});
		cf.thenAccept((m) -> {System.err.println("id2-------"+Thread.currentThread().getId());System.err.println("m------"+m);}).exceptionally((e)->{System.err.println("e---------"+e.getMessage());return null;});
		String result = null;
		
			result = cf.get();
		System.out.println("---------------------------------------------------------------");
		if(result != null){
			model.addAttribute("result", result);
		}
		return "/errors";
	}
    
	@RequestMapping("ue")
	@ResponseBody
	public String unitiveExceptionTest() throws Exception{
		return testService.getException();
	}
	
	@RequestMapping("ribbon/{str}")
	//@ResponseBody
	public String restRibbonTest(@PathVariable String str,HttpServletRequest req) throws Exception{
		String url = req.getServletPath();
        String pathInfo = req.getPathInfo();
        String query = req.getQueryString();
        if (pathInfo != null || query != null) {
            StringBuilder sb = new StringBuilder(url);
            if (pathInfo != null) {
                sb.append(pathInfo);
            }
            if (query != null) {
                sb.append('?').append(query);
            }
            url = sb.toString();
			
        }
		//return rs.getVakueFromThree(str);
		return "/dsda";
	}
/*	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  
	    int n = scanner.nextInt();  
	    int count = 0;    
	        while(n!= 0)  
	        {    
	            count++;    
	            n=n&(n-1);    
	         }    
	        System.out.println(count);  
	    }  */
}
