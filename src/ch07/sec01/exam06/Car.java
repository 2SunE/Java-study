package ch07.sec01.exam06;

public class Car {
	// 필드
	public int speed;
	
	// 메소드
	public void speedUp() {
		speed += 1;
	}
	
	// final 메소드
	public final void stop() { // 부모 클래스가 가진 method가 final 메소드면 자식 클래스에서 재정의 할 수 없다.
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
