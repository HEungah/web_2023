package java2.day25_제네릭.Ex2;

public class Ex2_와일드카드제네릭 {
	
	public static void main(String[] args) {
		
		// 모든 사람이 신청 가능
			// 1. 사람 객체
		Person person = new Person();
		Applicant<Person> applicant = new Applicant<Person>(person);
			// 2. 직장인 객체
		Worker worker = new Worker();
		Applicant<Worker> applicant2 = new Applicant<Worker>(worker);
			// 3. 학생 객체
		Student student = new Student();	
		Applicant<Student> applicant3 = new Applicant<Student>(student);
			// 4. 고등학생 객체
		HighStudent highstudent = new HighStudent();
		Applicant<HighStudent> applicant4 = new Applicant<HighStudent>(highstudent);
			// 5. 중학생 객체
		MiddleStudent middlestudent = new MiddleStudent();
		Applicant<MiddleStudent> applicant5 = new Applicant<MiddleStudent>(middlestudent);
		
			// 모든 사람 신청가능
		Course.registerCourse1(applicant);
		Course.registerCourse1(applicant2);
		Course.registerCourse1(applicant3);
		Course.registerCourse1(applicant4);
		Course.registerCourse1(applicant5);
		System.out.println();
		
			// 학생만 신청가능
		//Course.registerCourse2(applicant);
		//Course.registerCourse2(applicant2);
		Course.registerCourse2(applicant3);
		Course.registerCourse2(applicant4);
		Course.registerCourse2(applicant5);
		System.out.println();
		
			// 직장인 및 일반인만 신청 가능
		Course.registerCourse3(applicant);
		Course.registerCourse3(applicant2);
		//Course.registerCourse3(applicant3);
		//Course.registerCourse3(applicant4);
		//Course.registerCourse3(applicant5);
		
		

	} // main end
}






















