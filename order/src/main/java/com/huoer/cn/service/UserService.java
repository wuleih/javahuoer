package com.huoer.cn.service;

import com.huoer.cn.po.User;

import java.util.List;

public interface UserService {
	
	/**
     * Method--根据手机号查询用户
     * @param
     * @return
     */
    User selectByMobile(String userMobile);

	Integer updateUser(User user);

	Integer saveUser(User user);

	List<User> selectAllUser(User user);

	User selectById(Long id);
}
