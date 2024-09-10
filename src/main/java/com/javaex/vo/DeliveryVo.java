package com.javaex.vo;

public class DeliveryVo {
    private int orderNo;          // 주문번호
    private int cartNo;           // 장바구니번호
    private int paymentStatus;    // 결제여부
    private int paymentMethod;    // 결제수단
    private String purchaseConfirmDate; // 구매확정날짜
    private String userName;      // 주문 회원 이름
    private int deliveryStatus;   // 배송상태
    

    public DeliveryVo() {
		super();
	}
    
	public DeliveryVo(int orderNo, int cartNo, int paymentStatus, int paymentMethod, String purchaseConfirmDate,
			String userName, int deliveryStatus) {
		super();
		this.orderNo = orderNo;
		this.cartNo = cartNo;
		this.paymentStatus = paymentStatus;
		this.paymentMethod = paymentMethod;
		this.purchaseConfirmDate = purchaseConfirmDate;
		this.userName = userName;
		this.deliveryStatus = deliveryStatus;
	}

	// Getter & Setter
    public int getOrderNo() {
        return orderNo;
    }
    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }
    public int getCartNo() {
        return cartNo;
    }
    public void setCartNo(int cartNo) {
        this.cartNo = cartNo;
    }
    public int getPaymentStatus() {
        return paymentStatus;
    }
    public void setPaymentStatus(int paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    public int getPaymentMethod() {
        return paymentMethod;
    }
    public void setPaymentMethod(int paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public String getPurchaseConfirmDate() {
        return purchaseConfirmDate;
    }
    public void setPurchaseConfirmDate(String purchaseConfirmDate) {
        this.purchaseConfirmDate = purchaseConfirmDate;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getDeliveryStatus() {
        return deliveryStatus;
    }
    public void setDeliveryStatus(int deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

	@Override
	public String toString() {
		return "DeliveryVo [orderNo=" + orderNo + ", cartNo=" + cartNo + ", paymentStatus=" + paymentStatus
				+ ", paymentMethod=" + paymentMethod + ", purchaseConfirmDate=" + purchaseConfirmDate + ", userName="
				+ userName + ", deliveryStatus=" + deliveryStatus + "]";
	}
    
    
}
