package p1221;

import java.util.ArrayList;
import java.util.HashMap;

public class 복습ArrayHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Cal cal = new Cal(); = 기존 방식
		// ArrayList<원하는 형태의 데이터타입 클래스>
		ArrayList<String> array = new ArrayList<String>();
		array.add("test");
		array.add(0, "test0");
		System.out.println(array.size());
		System.out.println(array.get(0));
		array.remove(0);
		
		
		
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		array2.add(10);

		
		
		
		// HashMap<2개의 값String, Integer> = new HashMap<2개의 값String, Integer>();
		HashMap<String, Integer> map = new HashMap<String, Integer>(); // 이건 <>안에 값 2개
		map.put("홍길동", 80);
		// map.put("유재석", 숫자);
		// map.put("글자", 숫자);
		
		System.out.println(map.get("홍길동")); // T값으로 가져옴
		if(map.containsKey("홍길동")); // [[[containsKey]]] 홍길동이라는 값이 있는지 없는지 판별
		map.size();
		
		
		
		// 해쉬맵 자체를 포함할 수 있음
		HashMap<HashMap<String, Integer>> map2 = new HashMap<HashMap<String, Integer>>();
		map2.put("name", "홍길순");
		map2.put("age", 30);
		map2.put("java", 70);
		map2.put("python", 80);
		
		list.add(map2);
		
	    System.out.println(list);
		
		

	}

}
