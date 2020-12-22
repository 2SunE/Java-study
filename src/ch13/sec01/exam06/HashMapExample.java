package ch13.sec01.exam06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
		
		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> ketIterator = keySet.iterator();
		while(ketIterator.hasNext()) {
			String key = ketIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());
		
		// 객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		map.clear(); // 객체 전체 삭제
		System.out.println("총 Entry 수: " + map.size());
		 
	}

}
