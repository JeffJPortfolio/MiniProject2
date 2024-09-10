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
	
	
	@RequestMapping(value = "/user/myaccount", method = { RequestMethod.GET, RequestMethod.POST })
	public String modifyForm(HttpSession session, Model model) {
		System.out.println("UserInfoController.modifyForm()");

		UserVo authUser = (UserVo) session.getAttribute("authUser");

		UserVo userVo = myService.exeMyAcc(authUser.getUno());

		model.addAttribute("userVo", userVo);

		return "user/myAccount";
	}
	
	/* 회원정보 수정 */
	@RequestMapping(value = "/user/myaccount", method = { RequestMethod.GET, RequestMethod.POST })
	public String modify(HttpSession session, @ModelAttribute UserVo userVo) {
		System.out.println("UserInfoController.modify()");

		UserVo authUser = myService.exeAccModify(userVo);

		// 수정된 회원정보를 session에 전달
		session.setAttribute("authUser", authUser);

		return " " + authUser.getUno();
	}
}
