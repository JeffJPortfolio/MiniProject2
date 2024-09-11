package com.javaex.dao;

import java.sql.SQLSyntaxErrorException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PurchaseVo;
import com.javaex.vo.UserVo;

@Repository
public class MyDao {
	/* 마이페이지 구매내역 */
	@Autowired
	private SqlSession sqlSession;
	
	public List<PurchaseVo> selectPurchase(int uno) {
		System.out.println("sql전");
		System.out.println(uno); 
		List<PurchaseVo> purchaseList = sqlSession.selectList("my.selectPurchase", uno);
		
		
		System.out.println(purchaseList);
		
		
		return purchaseList;
	}
	
    public void update(PurchaseVo purchaseVo) {
        // MyBatis를 이용한 배송 상태 업데이트 쿼리 호출
    	int order_no = purchaseVo.getOrder_no();
    	System.out.println("되누?2");
    	
        sqlSession.update("my.update", order_no);
    	
    }
}
