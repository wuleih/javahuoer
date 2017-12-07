package com.huoer.cn.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Maps;
import com.huoer.cn.po.User;
import com.huoer.cn.po.UserExample;
import com.huoer.cn.mapper.UserMapper;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	public User selectByMobile(String userMobile) {
		Map<String, Object> map = Maps.newHashMap();
		map.put("userMobile", userMobile);
		User selectByMobile = userMapper.selectByMobile(map);
		return selectByMobile;
	}

	public Integer updateUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKeySelective(user);
	}

	public Integer saveUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.insertSelective(user);
	}

	public List<User> selectAllUser(User user) {
		// TODO Auto-generated method stub
		UserExample example = new UserExample();
		UserExample.Criteria uc = example.createCriteria();
		uc.andSoftDeleteEqualTo(user.isSoftDelete());
		String mobile = user.getUserMobile();
		if (StringUtils.isNotEmpty(mobile)) {
			uc.andUserMobileEqualTo(mobile);
		}
		Date startTime = user.getCreateTime();
		Date endTime = user.getModifyTime();
		if(startTime == null && endTime != null) {
			uc.andCreateTimeLessThan(endTime);
		}else if (startTime != null && endTime == null) {
			uc.andCreateTimeGreaterThan(startTime);
		}else if (startTime != null && endTime != null) {
			uc.andCreateTimeBetween(startTime, endTime);
		}
		return userMapper.selectByExample(example);
	}

	public User selectById(Long id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}


}
