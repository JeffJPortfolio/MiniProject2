package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.service.GoodsService;



@Controller
public class GoodsController {
	
	@Autowired
	private GoodsService goodsService;
	
	/* 상품정보 */
	@RequestMapping(value="/goods/info", method= {RequestMethod.GET, RequestMethod.POST} )
	public String goodsInfo() {
		System.out.println("GoodsController.goodsInfo()");
		
		return "/goods/GoodsInfo";
	}
	
	/* 장바구니 */
	@RequestMapping(value="/goods/cart", method= {RequestMethod.GET, RequestMethod.POST} )
	public String goodsCart(Model model) {
		System.out.println("GoodsController.goodsCart()");
		int goodsPrice = 99000; //서버에서 받아올 상품 가격
		
		model.addAttribute("goodsPrice", goodsPrice); //jsp로 전달
		return "/goods/GoodsCart";
	}
	
	

}
