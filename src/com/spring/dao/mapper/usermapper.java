package com.spring.dao.mapper;

import java.util.List;
import java.util.Map;

import com.spring.entity.userinfo;

public interface usermapper {
	public List<userinfo> listuser() throws Exception;

	public List<userinfo> checkuser(Map<String, Object> user) throws Exception;
}
