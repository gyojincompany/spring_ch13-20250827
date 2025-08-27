package com.gyojincompany.formtest;

public class MemberDto {
	private String mid; //아이디
	private String mpw; //비밀번호
	private String mname; //이름
	private String mage; //나이
	
	public MemberDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberDto(String mid, String mpw, String mname, String mage) {
		super();
		this.mid = mid;
		this.mpw = mpw;
		this.mname = mname;
		this.mage = mage;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMpw() {
		return mpw;
	}

	public void setMpw(String mpw) {
		this.mpw = mpw;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMage() {
		return mage;
	}

	public void setMage(String mage) {
		this.mage = mage;
	}
	
	
}
