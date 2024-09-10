package com.javaex.vo;

public class CustomerAskVo {

    private int inquiry_no;
    private String title;
    private int userId;
    private String userName; // join 결과
    private String regDate;
    private String status;
    private String answerDate;
    private String content; // 문의 내용 추가

    public CustomerAskVo() {
        super();
    }

    public CustomerAskVo(int inquiry_no, String title, int userId, String userName, String regDate, String status,
                         String answerDate, String content) {
        super();
        this.inquiry_no = inquiry_no;
        this.title = title;
        this.userId = userId;
        this.userName = userName;
        this.regDate = regDate;
        this.status = status;
        this.answerDate = answerDate;
        this.content = content;
    }

    // Getters and Setters

    public int getInquiryNo() {
        return inquiry_no;
    }

    public void setInquiryNo(int inquiryNo) {
        this.inquiry_no = inquiryNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAnswerDate() {
        return answerDate;
    }

    public void setAnswerDate(String answerDate) {
        this.answerDate = answerDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CustomerAskVo [inquiry_no=" + inquiry_no + ", title=" + title + ", userId=" + userId + ", userName="
                + userName + ", regDate=" + regDate + ", status=" + status + ", answerDate=" + answerDate
                + ", content=" + content + "]";
    }
}
