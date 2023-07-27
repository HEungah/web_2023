package java1.day11.Ex5디자인패턴2.model.DTO;

public class MemberDto {	// 멤버를 대표하는 데이터모델형식(이동객체)
	// 필드 : 모든 필드는 private
	private String id;
	private String pw;
	private String name;
	private String pnum;
	private int age;
	
	// 생성자
	public MemberDto() {}
	
	public MemberDto(String id, String pw, String name, String pnum, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.pnum = pnum;
		this.age = age;
	}

	// 메소드
	// 1. setter and getter : 필드가 private 인경우 간접접근
	// 2. toString : 객체 상태 확인용
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPnum() {
		return pnum;
	}

	public void setPnum(String pnum) {
		this.pnum = pnum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", pw=" + pw + ", name=" + name + ", pnum=" + pnum + ", age=" + age + "]";
	}
	
}
