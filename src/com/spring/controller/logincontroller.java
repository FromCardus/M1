package com.spring.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.entity.userinfo;
import com.spring.service.impl.userServiceImpl;

@Controller
public class logincontroller {
	@Autowired
	private userServiceImpl userService;

	public void setUserService(userServiceImpl userService) {
		this.userService = userService;
	}

	@RequestMapping("/login.do")
	public String checklogin(HttpServletRequest request,Model model) throws Exception {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Map<String, Object> user = new HashMap<String, Object>();
		user.put("name", username);
		user.put("pwd", password);
		List<userinfo> userinfos = userService.checkuser(user);
		if (userinfos.size() > 0) {
			// 在index.jsp页面进行渲染
			model.addAttribute("username", username);
			userinfo ui=userinfos.get(0);
			model.addAttribute("roleid",ui.getUid());
			return "pages/index_iframe";
		} else {
			model.addAttribute("loginerror", "true");
			return "login/login";
		}
	}
}
