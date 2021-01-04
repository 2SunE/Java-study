package ch07.sec01.exam07.pack2;

import ch07.sec01.exam07.pack1.A;

/*C 클래스는 A 클래스와 다른 패키지에 있다. default 접근 제한과 마찬가지로
C 클래스의 생성자와 메소드에서는 A 클래스의 protected 필드, 생성자, 메소드에 접근할 수 없다.*/

public class C {
	public void method() {
		//A a = new A(); 
	}
}
