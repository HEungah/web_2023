package 복습.part7.model.DTO;

public class MemberDto {
	private String id;
	private String pw;
	private String name;
	private String pnum;
	private int age;
	
	
	public MemberDto(String id, String pw, String name, String pnum, int age) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.pnum = pnum;
		this.age = age;
	}


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
		return "MemberDto [id=" + id + ", pw=" + pw + ", name=" + name + ", pnum=" + pnum + ", age=" + age + "]";
	}
	
	
	
	

}
