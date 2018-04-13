package com.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.mapper.teachermapper;
import com.spring.entity.teacher;
import com.spring.service.teacherservice;
@Service("teacherService")
public class teacherServiceImpl implements teacherservice {
	@Autowired
	private teachermapper tm;
	@Override
	public List<teacher> getAllTeacher() {
		// TODO Auto-generated method stub
		return tm.getAllTeacher();
	}

}
