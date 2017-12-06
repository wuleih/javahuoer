package com.timer.cn.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.timer.cn.base.MyselfException;
import com.timer.cn.po.User;
import com.timer.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/order")
public class TestController {
	
	@Autowired
	private UserService us;
	
	@ModelAttribute
	public void init(ModelMap model, HttpServletRequest request,HttpServletResponse response){
	}

	@RequestMapping("/name/{name}")
	@ResponseBody
	public String index(@PathVariable String name){
		User u = us.selectByMobile("18639535350");
		return name+u.getUserMobile()+"--------three";
	}
	
	@RequestMapping("/ue/ue")
	public String unitiveExceptionTest() throws Exception{
		throw new MyselfException("~~~~~~~~~~");
	}
	
	@RequestMapping("/index")
	public String toIndex(){
		return "index";
	}

}
