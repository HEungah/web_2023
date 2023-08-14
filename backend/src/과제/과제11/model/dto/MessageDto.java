package 과제.과제11.model.dto;

public class MessageDto {
	
	private int mno;
	private int msend;
	private int mreceive;
	private String mcontent;
	private String mdate;
	private String mname;
	
	public MessageDto() {
	}

	public MessageDto(int mno, int msend, int mreceive, String mcontent, String mdate, String mname) {
		this.mno = mno;
		this.msend = msend;
		this.mreceive = mreceive;
		this.mcontent = mcontent;
		this.mdate = mdate;
		this.mname = mname;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public int getMsend() {
		return msend;
	}

	public void setMsend(int msend) {
		this.msend = msend;
	}

	public int getMreceive() {
		return mreceive;
	}

	public void setMreceive(int mreceive) {
		this.mreceive = mreceive;
	}

	public String getMcontent() {
		return mcontent;
	}

	public void setMcontent(String mcontent) {
		this.mcontent = mcontent;
	}

	public String getMdate() {
		return mdate;
	}

	public void setMdate(String mdate) {
		this.mdate = mdate;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	@Override
	public String toString() {
		return "MessageDto [mno=" + mno + ", msend=" + msend + ", mreceive=" + mreceive + ", mcontent=" + mcontent
				+ ", mdate=" + mdate + ", mname=" + mname + "]";
	}
	
	
	
	

}
