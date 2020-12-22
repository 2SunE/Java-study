package ch13.exam01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // 동일한 문자는 한번만 저장됨
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		// 인덱스로 객체를 검색해서 가져오는 메소드가 없다.
		// 대신, 전체 객체를 대상으로 한 번씩 반복해서 가져오는 반복자를 제공한다.
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			// 객체 수만큼 
			String element = iterator.next(); // 1개의 객체를 가져온다.
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: " + set.size());
		
		iterator = set.iterator(); // 반복자 얻기
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear(); // 모든 객체를 제거하고 비움
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
		
	}

}
