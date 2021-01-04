package ch07.sec01.exam03;

public class Computer extends Calculator{
	
	// 메소드 재정의 (Method Overriding)
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
