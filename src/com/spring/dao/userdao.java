package com.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.entity.userinfo;

@Repository("userdao")
public interface userdao {
	public List<userinfo> listuser();

	public List<userinfo> checkuser(String name, String pwd);
}
