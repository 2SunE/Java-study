package ch07.sec01.exam02;

public class People {
	public String name;
	public String ssn;
	
	// People클래스는 기본 생성자가 없고 name과 ssn을 매개값으로 받아 객체를 생성시키는 생성자만 있다.
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}
