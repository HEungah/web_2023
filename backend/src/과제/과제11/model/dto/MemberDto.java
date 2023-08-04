package 과제.과제11.model.dto;

public class MemberDto {
	
	private int mno;
	private String mid;
	private String mpw;
	private String mname;
	private String mpnum;
	
	// 생성자
		// 1. 기본생성자
	public MemberDto() {}
		// 2. 풀생성자
	public MemberDto(int mno, String mid, String mpw, String mname, String mpnum) {
		this.mno = mno;
		this.mid = mid;
		this.mpw = mpw;
		this.mname = mname;
		this.mpnum = mpnum;
	}


	// getter and setter
	public int getMno() {
		return mno;
	}


	public void setMno(int mno) {
		this.mno = mno;
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


	public String getMpnum() {
		return mpnum;
	}


	public void setMpnum(String mpnum) {
		this.mpnum = mpnum;
	}
	
	// toString
	@Override
	public String toString() {
		return "MemberDto [mno=" + mno + ", mid=" + mid + ", mpw=" + mpw + ", mname=" + mname + ", mpnum=" + mpnum
				+ "]";
	}
	
	
	

}
