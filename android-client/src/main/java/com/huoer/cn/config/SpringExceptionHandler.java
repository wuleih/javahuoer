package com.huoer.cn.config;


import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import com.huoer.cn.base.ResponseData;

import java.time.LocalDateTime;

@ControllerAdvice  
public class SpringExceptionHandler{  
  /** 
     * 全局处理Exception 
     * @param ex 
     * @param req 
     * @return 
     */  
    @ExceptionHandler(value = {Exception.class})  
    public ResponseEntity<Object> handleOtherExceptions(final Exception ex, final WebRequest req) {  
    	String exx = ex.getMessage();
        int start = exx.indexOf("{");
    	int end = exx.indexOf("}");
    	String exxx = exx.trim().substring(start, end+1);
    	ResponseData rd = new Gson().fromJson(exxx, ResponseData.class);
    	rd.setTimestamp(LocalDateTime.now().toString());
        return new ResponseEntity(rd,HttpStatus.OK);  
    }  
  
}  