package com.timer.cn.service;

import com.timer.cn.po.User;

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
