package ch13.sec01.exam06;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("홍길동", 85);
		map.put("김철수", 95);
		map.put("김영희", 80);
		map.put("홍길동", 95); // "홍길동" 키가 같기 때문에 제일 마지막에 저장한 값으로 대체
		System.out.println("총 Entry 수: " + map.size());
		
		System.out.println("\t홍길동: " + map.get("홍길동")); // 이름(홍길동)으로 점수를 검색
		System.out.println();
		
		
	}

}
