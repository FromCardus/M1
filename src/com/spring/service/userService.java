package com.spring.service;

import java.util.List;
import java.util.Map;

import com.spring.entity.userinfo;

public interface userService {
	List<userinfo> listUser() throws Exception;
	List<userinfo> checkuser(Map<String, Object> user) throws Exception;
}
