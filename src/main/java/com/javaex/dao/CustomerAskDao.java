package com.javaex.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.CustomerAskVo;

@Repository
public class CustomerAskDao {

    @Autowired
    private SqlSession sqlSession;

    public List<CustomerAskVo> selectInquiryList(Map<String, Object> paramMap) {
        return sqlSession.selectList("customerAsk.selectInquiryList", paramMap);
    }

    public int getTotalCount(Map<String, Object> paramMap) {
        return sqlSession.selectOne("customerAsk.getTotalCount", paramMap);
    }
}