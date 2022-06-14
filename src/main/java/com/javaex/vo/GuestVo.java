package com.javaex.vo;

public class GuestVo {

	public String name, password, content, regDate;
	public int guestNo;

	public GuestVo(String name, String password, String content) {
		this.name = name;
		this.password = password;
		this.content = content;
	}

	public GuestVo(int guestNo, String name, String password, String content, String regDate) {
		this.guestNo = guestNo;
		this.name = name;
		this.password = password;
		this.content = content;
		this.regDate = regDate;
	}

	public GuestVo() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public int getGuestNo() {
		return guestNo;
	}

	public void setGuestNo(int guestNo) {
		this.guestNo = guestNo;
	}

	@Override
	public String toString() {
		return "GuestVo [name=" + name + ", password=" + password + ", content=" + content + ", regDate=" + regDate
				+ ", guestNo=" + guestNo + "]";
	}

}
