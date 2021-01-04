package ch07.sec01.exam04;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff(); // 이륙합니다.
		sa.fly(); // 일반비행합니다.
		sa.flyMode = SupersonicAirplane.SUPERSONIC; // 1 -> 2
		sa.fly(); // 초음속비행합니다.
		sa.flyMode = SupersonicAirplane.NORMAL; // 2 -> 1
		sa.fly(); // 일반비행합니다.
		sa.land(); // 착륙합니다.
	}
}
