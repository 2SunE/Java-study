package ch07.sec01.exam02;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1234567", 1);
		
		// 부모에게 상속받은 필드 출력
		System.out.println("name: " + student.name);
		System.out.println("ssn: " + student.ssn);
		
		System.out.println("studentNo: " + student.studentNo);
	}

}
