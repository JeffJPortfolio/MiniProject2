package com.javaex.vo;

public class UserVo {

	private int uno;
    private String name;
	private String uid;
	private String password;
    private int ssn;
	private String hp;
    private String address;
    private int role;

    public UserVo() {
		super();
	}

	public UserVo(int uno, String name, String uid, String password, int ssn, String hp, String address, int role) {
		super();
		this.uno = uno;
        this.name = name;
		this.uid = uid;
		this.password = password;
        this.ssn = ssn;
		this.hp = hp;
        this.address = address;
        this.role = role;
	}

	public int getUno() {
		return this.uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
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

	public String getHp() {
		return this.hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
    public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserVo [uno=" + uno + ", name=" + name + ", uid=" + uid + ", password=" + password + ", ssn=" + ssn
				+ ", hp=" + hp + ", address=" + address + ", role=" + role + "]";
	}



}