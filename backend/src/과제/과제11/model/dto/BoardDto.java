package 과제.과제11.model.dto;

public class BoardDto {	// dto는 이동객체이기때문에 휘발성이다

	// 필드
	
    private int bno;
    private String btitle;
    private String bcontent;
    private String bwriteDate;
    private int  bview;
    private int mno;
    
    private String mid;	// 회원번호를 이용한 회원테이블에서 조회 가능[ 테이블 합치기 JOIN]
    
    // 생성자 [ 빈생성자, 풀생성자 + 추가생성자]
    
    public BoardDto() {}
    
    public BoardDto(int bno, String btitle, String bcontent) {
    	this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
	}

	public BoardDto(String btitle, String bcontent, int mno) {
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.mno = mno;
    }

	public BoardDto(int bno, String btitle, String bcontent, String bwriteDate, int bview, int mno, String mid) {
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bwriteDate = bwriteDate;
		this.bview = bview;
		this.mno = mno;
		this.mid = mid;
	}

	// 메소드 [ 1.get, 2.set, 3.toString ]
	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public String getBwriteDate() {
		return bwriteDate;
	}

	public void setBwriteDate(String bwriteDate) {
		this.bwriteDate = bwriteDate;
	}

	public int getBview() {
		return bview;
	}

	public void setBview(int bview) {
		this.bview = bview;
	}

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

	@Override
	public String toString() {
		return "BoardDto [bno=" + bno + ", btitle=" + btitle + ", bcontent=" + bcontent + ", bwriteDate=" + bwriteDate
				+ ", bview=" + bview + ", mno=" + mno + ", mid=" + mid + "]";
	}
	
	
    
    
	
}
