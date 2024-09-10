package com.javaex.vo;

public class CartVo {
	
	
	private int cNo;
	private int uId;
	private int fNo;
	private int count;
	
	
	
	
	public CartVo() {
		super();
	}
	public CartVo(int cNo, int uId, int fNo, int count) {
		super();
		this.cNo = cNo;
		this.uId = uId;
		this.fNo = fNo;
		this.count = count;
	}
	
	
	
	
	
	public int getcNo() {
		return cNo;
	}
	public void setcNo(int cNo) {
		this.cNo = cNo;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public int getfNo() {
		return fNo;
	}
	public void setfNo(int fNo) {
		this.fNo = fNo;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	
	@Override
	public String toString() {
		return "CartVo [cNo=" + cNo + ", uId=" + uId + ", fNo=" + fNo + ", count=" + count + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
