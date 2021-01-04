package ch07.sec01.exam04;

public class SupersonicAirplane extends Airplane {
	// 상수 선언 - 자주 사용되는 고정값들은 상수를 사용함으로써 가독성을 높여준다.
	public static final int NORMAL = 1; 
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override // fly() 메소드 재정의
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			super.fly(); // Airplane 객체의 fly() 메소드 호출
		}
	}
}
