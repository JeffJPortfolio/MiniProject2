package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.UserVo;

@Repository
public class MyDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	/* 회원정보 1개 가져오기 */
	public UserVo selectInfo(int uno) {
		System.out.println("UserInfoDao.selectInfo()");

		UserVo userVo = sqlSession.selectOne("user.selectInfo", uno);

		return userVo;
	}

	/* 회원정보 수정 */
	public int modifyUser(UserVo userVo) {
		System.out.println("UserInfoDao.modifyUser()");

		int count = sqlSession.update("user.update", userVo);

		return count;
	}
}
