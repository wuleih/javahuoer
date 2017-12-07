package com.huoer.cn.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.huoer.cn.utils.DateConvertUtils;
import com.huoer.cn.base.MyselfException;
import com.huoer.cn.base.ResponseData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;


@ControllerAdvice
public class UnitiveExceptionHanddle {
	private Logger logger = LoggerFactory.getLogger(UnitiveExceptionHanddle.class);

	@ExceptionHandler(value = MyselfException.class)
	@ResponseBody
	public ResponseData defaultErrorHandler(Exception  e, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		ResponseData rd = new ResponseData();
		rd.setMessage(e.getMessage());
		rd.setPath(req.getRequestURL().toString());
		rd.setStatus("500");
		rd.setOccurTime(DateConvertUtils.dateToStringByLocal(LocalDateTime.now()));
		rd.setError("服务异常");
		rd.setExceptionMsg(e.toString());
		return rd;
	}
	
	protected HttpStatus getStatus(HttpServletRequest request) {
		Integer statusCode = (Integer) request
				.getAttribute("javax.servlet.error.status_code");
		if (statusCode == null) {
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}
		try {
			return HttpStatus.valueOf(statusCode);
		}
		catch (Exception ex) {
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}
	}

}
