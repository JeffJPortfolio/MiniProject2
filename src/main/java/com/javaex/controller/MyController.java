package com.javaex.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javaex.service.MyService;
import com.javaex.service.UserService;
import com.javaex.vo.UserVo;

import jakarta.servlet.http.HttpSession;

@Controller

public class MyController {

	@Autowired
	private MyService myService;
	
	
	@RequestMapping(value = "/user/myccount", method = { RequestMethod.GET, RequestMethod.POST })
	public String modifyForm(HttpSession session, Model model) {
		System.out.println("UserInfoController.modifyForm()");

		UserVo authUser = (UserVo) session.getAttribute("authUser");

		UserVo userVo = myService.exeMyAcc(authUser.getUno());

		model.addAttribute("userVo", userVo);

		return "user/myAccount";
	}
}
