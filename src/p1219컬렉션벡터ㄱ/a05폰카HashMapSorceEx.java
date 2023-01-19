package p1219컬렉션벡터ㄱ;

import java.util.*;


public class a05폰카HashMapSorceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 폰카에 있음
		// 사용자 이름과 점수를 기록하는 HashMap 컬렉션 생성
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();
		
		// 5개의 이름과 점수를 put
		javaScore.put("김성동", 97);
		javaScore.put("황기태", 88);
		javaScore.put("김남윤", 98);
		javaScore.put("이재문", 70);
		javaScore.put("한원선", 99);
		
		System.out.println("HashMap의 요소 갯수 : " + javaScore.size());
		
		// 모든 사람의 점수 출력
		
		// javaScore에 들어있는 모든 (key, value) 쌍 출력
		// key 문자열을 가진 집합 Set 컬렉션 리턴
		Set<String> keys = javaScore.keySet();
		
		// key 문자열을 순서대로 접근할 수 있는 Iterator 리턴
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {		// 다음값이 없을때까지 반복
			String name = it.next();
			int score = javaScore.get(name);
			System.out.println(name + " : " + score);
		}
	}
}
