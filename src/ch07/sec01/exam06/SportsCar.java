package ch07.sec01.exam06;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	// stop 메소드는 재정의할 수 없음
}
