package java2.day28_컬렉션프레임워크.Ex3_사용자정렬기준정의;

public class Person implements Comparable<Person>{
									// Comparable 구현
									// compareTo메소드 오버라이드
	public String name;
	public int age;
	
	// 생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person o) {		// 오름차순 정렬
		if(age < o.age) return -1;
		else if(age == o.age) return 0;
		else return 1;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	

}
