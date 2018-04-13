package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.entity.teacher;
import com.spring.service.impl.teacherServiceImpl;
import com.spring.service.impl.userServiceImpl;
import org.springframework.ui.Model;

@Controller
public class centercontroler {
	@Autowired
	private userServiceImpl userserviceimpl;

	@Autowired
	teacherServiceImpl teacherServiceImpl;

	@RequestMapping("/lsteacher.do")
	public ModelAndView listteachers() {
		ModelAndView modelAndView=new ModelAndView();
		List<teacher> teachers=teacherServiceImpl.getAllTeacher();
		modelAndView.addObject("teacherlist", teachers);
		modelAndView.setViewName("pages/tables/data");
		return modelAndView;
	}
}
