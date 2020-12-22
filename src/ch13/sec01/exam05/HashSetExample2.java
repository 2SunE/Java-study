package ch13.sec01.exam05;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<>();
		
		// 인스턴스가 달라도 이름과 나이가 동일하다면 동일한 객체로 간주하여 중복 저장되지 않음
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println("총 객체수: " + set.size());
	}
}
