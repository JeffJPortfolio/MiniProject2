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

import com.javaex.service.ServiceService;
import com.javaex.service.UserService;
import com.javaex.vo.BoardVo;
import com.javaex.vo.UserVo;

import jakarta.servlet.http.HttpSession;

@Controller
public class ServiceController {

	//필드
	@Autowired
	private ServiceService serviceService;
	//생성자
	//메소드 gs
	//메소드 일반
	
	/* 회원가입폼 */
	@RequestMapping(value = "/mypage/myservice", method = { RequestMethod.GET, RequestMethod.POST })
	public String boardList(HttpSession session, Model model) {
		System.out.println("UserInfoController.purchaseListForm()");

		// 로그인한 session 값을 객체로 가져오기
		BoardVo authUser = (BoardVo) session.getAttribute("authUser");


		List<BoardVo> boardList ;
		boardList = ServiceService.exeShowService(authUser.getInquiry_no());

		model.addAttribute("boardList", boardList);
		System.out.println("컨트롤후");
		return "mypage/myService";
	}
	

	

}