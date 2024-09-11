package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.MyDao;
import com.javaex.vo.PurchaseVo;
import com.javaex.vo.UserVo;

@Service
public class MyService {
	
	@Autowired
	private MyDao myDao;
	
	/* 마이페이지 구매내역 */
	public List<PurchaseVo> exeUserPurchase(int uno) {
		System.out.println("UserInfoService.exeUserPurchase()");

		List<PurchaseVo> purchaseList = myDao.selectPurchase(uno);

		return purchaseList;

	}
}
