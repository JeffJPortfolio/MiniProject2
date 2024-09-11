package com.javaex.controller;


import java.util.List;

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
import com.javaex.vo.PurchaseVo;
import com.javaex.vo.UserVo;

import jakarta.servlet.http.HttpSession;

@Controller

public class MyController {

	@Autowired
	private MyService myService;
	
//	
	@RequestMapping(value = "/user/purchaselist", method = { RequestMethod.GET, RequestMethod.POST })
	public String purchaseListForm(HttpSession session, Model model) {
		System.out.println("UserInfoController.purchaseListForm()");

		// 로그인한 session 값을 객체로 가져오기
		UserVo authUser = (UserVo) session.getAttribute("authUser");

		// 회원의 세션번호로 구매내역 불러오기
		// 한사람이 여러개를 사면 결과값이 1개 이상이므로
		List<PurchaseVo> purchaseList = myService.exeUserPurchase(authUser.getUno());

		model.addAttribute("purchaseList", purchaseList);

		return "user/purchaseList";
	}
}
