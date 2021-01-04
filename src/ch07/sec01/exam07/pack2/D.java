package ch07.sec01.exam07.pack2;

import ch07.sec01.exam07.pack1.A;

/*D 클래스는 A 클래스와 다른 패키지에 있다. 하지만 C 클래스와는 달리 D는 A의 자식 클래스다.
그렇기 때문에 A 클래스의 protected 필드, 생성자, 메소드에 접근이 가능하다.abstract
단 new 연산자를 상ㅇ해서 생성자를 직접 호출할 수는 없고, 자식 생성자에서 super()로 A 생성자를 호출할 수 있다.
*/
public class D extends A{
	public D() {
		// A a = new A(); -> public일 경우 가능
		super();
		this.field = "value";
		this.method();
	}
}
