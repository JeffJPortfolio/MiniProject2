package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.MyDao;
import com.javaex.dao.UserDao;
import com.javaex.vo.PurchaseVo;
import com.javaex.vo.UserVo;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	/* 회원가입 */
	public int exeJoin(UserVo userVo) {
		System.out.println("UserService.exeJoin()");
		
		int count = userDao.insertUser(userVo);
		return count;
	}
	
	/* 로그인 */
	public UserVo exeLogin(UserVo userVo) {
		System.out.println("UserService.exeJoin()");
		
		UserVo authUser = userDao.selectUser(userVo);
		return authUser;
		
	}
	
	/* 아이디체크 */
	public boolean exeIdCheck(String id) {
		System.out.println("UserService.exeIdCheck()");
		
		int count = userDao.selecUserById(id);
		
		if(count >= 1) {
			return false;
			
		}else {
			return true;
			
		}
		
		
	}
	
//	public List<PurchaseVo> exeUserPurchase(int uno) {
//		System.out.println("UserInfoService.exeUserPurchase()");
//		
//		List<PurchaseVo> purchaseList = MyDao.selectPurchase(uno);
//		
//		return purchaseList;
		
//	}
	
	
	
}