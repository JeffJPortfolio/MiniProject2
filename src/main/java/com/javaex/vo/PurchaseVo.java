package com.javaex.vo;

public class PurchaseVo {
	private int order_no; //결재번호 (pNo)
	private String uid; //유저 아이디
	private int uNo;	//유저 번호(auto increment)
	private String delivery_status; //배송중/배송완
	private String payment_status; //결재대기/결재완
	private int fNo; //ex) 1 1 = 하이브리드 빨강; 2 1 = 사이브리드 빨강 ; 1 2 = 하이브리드 파랑
	private String goods_name; 
		/*
		 * SELECT 
    			t1.name AS table1Name,
    			t2.name AS table2Name,
    			t1.age,
    			t2.salary
			FROM 
    			table1 t1
			JOIN 
    			table2 t2 ON t1.id = t2.id;
		*/
	private String color; // Listgoods.color = options.cno 
	private int price; //가격
	public int getOrder_no() {
		return order_no;
	}
	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public int getuNo() {
		return uNo;
	}
	public void setuNo(int uNo) {
		this.uNo = uNo;
	}
	public String getDelivery_status() {
		return delivery_status;
	}
	public void setDelivery_status(String delivery_status) {
		this.delivery_status = delivery_status;
	}
	public String getPayment_status() {
		return payment_status;
	}
	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}
	public int getfNo() {
		return fNo;
	}
	public void setfNo(int fNo) {
		this.fNo = fNo;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "PurchaseVo [order_no=" + order_no + ", uid=" + uid + ", uNo=" + uNo + ", delivery_status="
				+ delivery_status + ", payment_status=" + payment_status + ", fNo=" + fNo + ", goods_name=" + goods_name
				+ ", color=" + color + ", price=" + price + "]";
	}
	
	
	
	
}
