package ch13.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Java"); // 객체를 추가할 때 add() 메소드를 사용한다.
		list.add("JDBC");
		list.add("Database");
		list.add("Servlet/JSP");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("총 객체수: " + size); // 총 객체수: 5
		System.out.println();
	
		String skill = list.get(2);
		System.out.println("2: " + skill); // 2: Database
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + ": " + list.get(i)); // 객체를 찾아올 때에는 get() 메소드를 사용한다.
		}
		System.out.println();
		
		// 객체 삭제는 remove() 메소드를 사용한다.
		list.remove(2); // Database 삭제
		list.remove(2); // Servlet/JSP 삭제
		list.remove("iBATIS"); // iBATIS 삭제
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
		}
		System.out.println();
		
		// List 컬렉션에 저장된 객체 수 만큼 반복하면서 객체를 하나씩 str 변수에 대입한다.
		for(String str : list) {
			System.out.println(str);
		}
		
	}
}
