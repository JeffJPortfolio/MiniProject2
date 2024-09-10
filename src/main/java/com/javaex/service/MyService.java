package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.MyDao;
import com.javaex.vo.UserVo;

@Service
public class MyService {
	
	@Autowired
	private MyDao MyDao;
	
	/* 회원정보 수정 폼 */
	public UserVo exeMyAcc(int userNo) {
		System.out.println("UserInfoService.exeUserInfo()");

		UserVo userVo = MyDao.selectInfo(userNo);

		return userVo;
	}

	/* 회원정보 수정 */
	public UserVo exeAccModify(UserVo userVo) {
		System.out.println("UserInfoService.modify()");

		int count = MyDao.modifyUser(userVo);

		// 회원번호(no)를 이용해서 수정된 회원의 정보를 객체로 저장
		UserVo modifyUserInfo = MyDao.selectInfo(userVo.getUserNo());

		return modifyUserInfo;
	}
}
