package ch13.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Java");
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
			System.out.println(i + ": " + list.get(i));
		}
		System.out.println();
		
		list.remove(2); // Database 삭제
		list.remove(2); // Servlet/JSP 삭제
		list.remove("iBATIS"); // iBATIS 삭제
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
		}
		
	}
}
