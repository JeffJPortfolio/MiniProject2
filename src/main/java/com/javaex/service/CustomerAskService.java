package com.javaex.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.CustomerAskDao;
import com.javaex.vo.CustomerAskVo;

@Service
public class CustomerAskService {

    @Autowired
    private CustomerAskDao customerAskDao;

    public Map<String, Object> getInquiryList(int crtPage, String keyword, String status, String startDate, String endDate) {
        int listCnt = 10;
        int startRowNo = (crtPage - 1) * listCnt;

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("startRowNo", startRowNo);
        paramMap.put("listCnt", listCnt);
        paramMap.put("keyword", keyword.isEmpty() ? "" : "%" + keyword + "%");
        paramMap.put("status", status.isEmpty() ? null : status);
        paramMap.put("startDate", startDate);
        paramMap.put("endDate", endDate);

        List<CustomerAskVo> inquiryList = customerAskDao.selectInquiryList(paramMap);
        int totalCnt = customerAskDao.getTotalCount(paramMap);

        int pageBtnCount = 5;
        int endPageBtnNo = (int) Math.ceil(crtPage / (double) pageBtnCount) * pageBtnCount;
        int startPageBtnNo = endPageBtnNo - (pageBtnCount - 1);
        boolean next = (listCnt * endPageBtnNo < totalCnt);
        boolean prev = (startPageBtnNo != 1);

        Map<String, Object> pMap = new HashMap<>();
        pMap.put("inquiryList", inquiryList);
        pMap.put("prev", prev);
        pMap.put("next", next);
        pMap.put("startPageBtnNo", startPageBtnNo);
        pMap.put("endPageBtnNo", endPageBtnNo);
        pMap.put("crtPage", crtPage);

        return pMap;
    }
}
