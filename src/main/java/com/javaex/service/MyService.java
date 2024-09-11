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
	public boolean exeUpdate(PurchaseVo purchaseVo) {
        try {
            // DAO를 통해 배송 상태 업데이트
        	System.out.println("되누?");
        	myDao.update(purchaseVo);
            return true;  // 성공하면 true 반환
        } catch (Exception e) {
            e.printStackTrace();
            return false;  // 실패하면 false 반환
        }
    }
}
