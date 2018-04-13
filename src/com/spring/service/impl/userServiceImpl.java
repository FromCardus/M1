package com.spring.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.mapper.usermapper;
import com.spring.entity.userinfo;
import com.spring.service.userService;

@Service("userService")
public class userServiceImpl implements userService {
	@Autowired
	private usermapper um;

	

	@Override
	public List<userinfo> listUser() throws Exception{
		return um.listuser();
	}

	@Override
	public List<userinfo> checkuser(Map<String, Object> user) throws Exception{
		return um.checkuser(user);
	}
}
