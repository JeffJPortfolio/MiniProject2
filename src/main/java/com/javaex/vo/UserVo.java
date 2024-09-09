package com.javaex.vo;

public class UserVo {

	private int no;
    private String name;
	private String uid;
	private String password;
    private int ssn;
	private String phone;
    private String address;

    public UserVo() {
		super();
	}

	public UserVo(int no, String name, String uid, String password, int ssn, String phone, String address) {
		super();
		this.no = no;
        this.name = name;
		this.uid = uid;
		this.password = password;
        this.ssn = ssn;
		this.phone = phone;
        this.address = address;
	}

	public int getNo() {
		return this.no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getSsn() {
		return this.ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

    @Override
    public String toString() {
        return "{" +
            " no='" + getNo() + "'" +
            ", name='" + getName() + "'" +
            ", uid='" + getUid() + "'" +
            ", password='" + getPassword() + "'" +
            ", ssn='" + getSsn() + "'" +
            ", phone='" + getPhone() + "'" +
            ", address='" + getAddress() + "'" +
            "}";
    }	

}