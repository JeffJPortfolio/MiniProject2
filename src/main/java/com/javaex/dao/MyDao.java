package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PurchaseVo;
import com.javaex.vo.UserVo;

public class MyDao {
	/* 마이페이지 구매내역 */
	public List<PurchaseVo> selectPurchase(int userNo) {

		List<PurchaseVo> purchaseList = sqlSession.selectList("user.selectPurchase", uno);

		return purchaseList;
	}

}
