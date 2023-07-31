package java1.day13.Ex2.model.dto;

public class BoardDto {
	// 싱글톤 사용 x
	
	// 1. 필드
		// 1. 작성자(String), 내용(String), 조회수(int)
	
	private String writer;	// 작성자
	private String content;	// 내용
	private int view;	// 조회수
	
	
	// 2. 생성자
	public BoardDto() {}	// 기본 생성자
	
	public BoardDto(String writer, String content, int view) {	// 풀 생성자
		super();
		this.writer = writer;
		this.content = content;
		this.view = view;
	}

	// 등록할때 사용하는 생성자
	public BoardDto(String writer, String content) {
		super();
		this.writer = writer;
		this.content = content;
		this.view = 0;	// 게시물 생성시 조회수 0으로 초기화
	}


	// 3. 메소드
	
	// getter and setter  ---> 필드에 직접적인 접근이 불가능[private]하기 때문에 사용
	// toString ---> 객체 호출시 주소값이 반환되지만, 객체의 필드값을 반환하고 싶을때 사용하는 메소드
	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public int getView() {
		return view;
	}


	public void setView(int view) {
		this.view = view;
	}


	@Override
	public String toString() {
		return "BoardDto [writer=" + writer + ", content=" + content + ", view=" + view + "]";
	}
	
	
	
	
}
