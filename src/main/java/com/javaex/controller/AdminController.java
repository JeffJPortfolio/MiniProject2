package com.javaex.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.javaex.service.AdminService;
import com.javaex.service.CustomerAskService;
import com.javaex.service.DeliveryService;
import com.javaex.service.UserService;
import com.javaex.vo.GoodsVo;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;
	@Autowired
	private UserService UserService;
	@Autowired
	private DeliveryService deliveryService;
	@Autowired
    private CustomerAskService customerAskService;

	@RequestMapping(value = "/customer", method = { RequestMethod.GET, RequestMethod.POST })
	public String manageCustomer(@RequestParam(value = "crtpage", required = false, defaultValue = "1") int crtPage,
			@RequestParam(value = "status", required = false, defaultValue = "") String status,
			@RequestParam(value = "keyword", required = false, defaultValue = "") String keyword,
			@RequestParam(value = "startDate", required = false) String startDate,
			@RequestParam(value = "endDate", required = false) String endDate, Model model) {

		Map<String, Object> pMap = customerAskService.getInquiryList(crtPage, keyword, status, startDate, endDate);

		model.addAttribute("pMap", pMap);
		model.addAttribute("keyword", keyword);
		model.addAttribute("status", status);
		model.addAttribute("startDate", startDate);
		model.addAttribute("endDate", endDate);

		return "adminpage/ManageCustomer";
	}

	/* 고객문의 응답 페이지 */
	@RequestMapping(value = "/customerask", method = { RequestMethod.GET, RequestMethod.POST })
	public String customerAsk() {

		System.out.println("AdminController.customerAsk()");

		return "/adminpage/ManageCustomerAsk";
	}

	/* 고객문의 응답 제출 */

	/* 상품 목록 페이지 */
	@RequestMapping(value = "/goods", method = { RequestMethod.GET, RequestMethod.POST })
	public String showGoods(Model model) {
		System.out.println("AdminController.showGoods()");

		// 서비스 호출하여 상품 목록 가져오기
		List<GoodsVo> goodsList = adminService.getAllGoods();
		model.addAttribute("goodsList", goodsList);

		System.out.println("서비스가 보낸 상품 목록: " + goodsList);
		return "adminpage/ManageGoods";
	}

	// 상품 추가 처리
	@RequestMapping(value = "/addgoods", method = { RequestMethod.GET, RequestMethod.POST })
	public String addGoods(@RequestParam("image") MultipartFile image, GoodsVo goodsVo) {
		// 이미지를 포함한 상품 추가 로직을 서비스에 위임
		adminService.addGoodsWithImage(goodsVo, image);

		return "redirect:/admin/goods";
	}

	// 회원 관리 페이지
	/*
	 * @RequestMapping(value = "/user", method = {RequestMethod.GET,
	 * RequestMethod.POST}) public String manageUser(Model model) {
	 * System.out.println("AdminController.manageUser()");
	 * 
	 * // 서비스 호출하여 유저 목록 가져오기 List<UserVo> userList = userService.getUserList();
	 * model.addAttribute("userboardList", userList);
	 * 
	 * return "/adminpage/ManageUser"; }
	 */
	// 회원 관리 페이지 (페이징 및 검색)
	@RequestMapping(value = "/user", method = { RequestMethod.GET, RequestMethod.POST })
	public String manageUser(@RequestParam(value = "crtpage", required = false, defaultValue = "1") int crtPage,
			@RequestParam(value = "keyword", required = false, defaultValue = "") String keyword,
			@RequestParam(value = "status", required = false, defaultValue = "") String status, Model model) {

		System.out.println("keyword: " + keyword + ", status: " + status); // 디버그
		Map<String, Object> pMap = UserService.getUserList(crtPage, keyword, status);
//		System.out.println("userList size: " + ((List<UserVo>) pMap.get("userList")).size()); // 데이터 크기 확인

		model.addAttribute("pMap", pMap);
		model.addAttribute("keyword", keyword); // JSP에서 사용하기 위해 keyword 넘김
		model.addAttribute("status", status); // JSP에서 사용하기 위해 status 넘김
		return "adminpage/ManageUser";
	}

	/* 배송 관리 리스트 (페이징 및 검색) */
	@RequestMapping(value = "/order", method = { RequestMethod.GET, RequestMethod.POST })
	public String manageOrder(@RequestParam(value = "crtpage", required = false, defaultValue = "1") int crtPage,
			@RequestParam(value = "keyword", required = false, defaultValue = "") String keyword,
			@RequestParam(value = "status", required = false, defaultValue = "") String status, Model model) {

		System.out.println("배송 관리 페이지 - 검색어: " + keyword + ", 상태: " + status);

		Map<String, Object> pMap = deliveryService.getDeliveryList(crtPage, keyword, status);

		model.addAttribute("pMap", pMap);
		model.addAttribute("keyword", keyword); // 검색어 유지
		model.addAttribute("status", status); // 상태 유지
		return "adminpage/ManageOrder";
	}

}
