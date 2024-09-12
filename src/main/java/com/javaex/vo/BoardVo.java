package com.javaex.vo;

public class BoardVo {
    private int inquiry_no;
    private int user_id;
    private String title;
    private String content;
    private String reg_date;
    private String status;
    private String answer;
    private String answer_date;

    // Empty constructor
    public BoardVo() {}

    // Constructor with all fields
    public BoardVo(int inquiry_no, int user_id, String title, String content, String reg_date, String status, String answer, String answer_date) {
        this.inquiry_no = inquiry_no;
        this.user_id = user_id;
        this.title = title;
        this.content = content;
        this.reg_date = reg_date;
        this.status = status;
        this.answer = answer;
        this.answer_date = answer_date;
    }

    // Getters and Setters
    public int getInquiry_no() {
        return inquiry_no;
    }

    public void setInquiry_no(int inquiry_no) {
        this.inquiry_no = inquiry_no;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReg_date() {
        return reg_date;
    }

    public void setReg_date(String reg_date) {
        this.reg_date = reg_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer_date() {
        return answer_date;
    }

    public void setAnswer_date(String answer_date) {
        this.answer_date = answer_date;
    }

    // toString method
    @Override
    public String toString() {
        return "BoardVo [inquiry_no=" + inquiry_no + ", user_id=" + user_id + ", title=" + title + ", content=" + content
                + ", reg_date=" + reg_date + ", status=" + status + ", answer=" + answer + ", answer_date=" + answer_date + "]";
    }
}
