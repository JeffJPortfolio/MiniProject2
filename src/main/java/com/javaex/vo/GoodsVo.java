package com.javaex.vo;

public class GoodsVo {
	
	
	private int gNo;
	private String name;  //제품이름
	private int price;
	private String color;    //제품 색상 넘버
	
	private String filePath;
	private String orgName;
	private String saveName;
	private int fileSize;
	
	
	
	
	public GoodsVo() {
		super();
	}

	public GoodsVo(int gNo, String name, int price, String color, String filePath, String orgName, String saveName,
			int fileSize) {
		super();
		this.gNo = gNo;
		this.name = name;
		this.price = price;
		this.color = color;
		this.filePath = filePath;
		this.orgName = orgName;
		this.saveName = saveName;
		this.fileSize = fileSize;
	}
	
	
	
	

	public int getgNo() {
		return gNo;
	}

	public void setgNo(int gNo) {
		this.gNo = gNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getSaveName() {
		return saveName;
	}

	public void setSaveName(String saveName) {
		this.saveName = saveName;
	}

	public int getFileSize() {
		return fileSize;
	}

	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}

	
	
	
	
	@Override
	public String toString() {
		return "GoodsVo [gNo=" + gNo + ", name=" + name + ", price=" + price + ", color=" + color + ", filePath="
				+ filePath + ", orgName=" + orgName + ", saveName=" + saveName + ", fileSize=" + fileSize + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
