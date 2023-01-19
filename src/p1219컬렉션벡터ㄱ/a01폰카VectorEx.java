package p1219컬렉션벡터ㄱ;

import java.util.Vector;

public class a01폰카VectorEx {
	// 폰카에 나머지 있음
	// 배열은 정적, 벡터는

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		v.add(5); // 벡터에 5 삽입
		v.add(4);
		v.add(-1);
		
		// 벡터의 중간에 삽입하기
		v.add(2, 100);
		
		System.out.println("벡터 내의 요소 객체 수 : " + v.size());
		System.out.println("벡터의 현재 용량 : " + v.capacity());
		
		// 모든 요소 정수 출력하기
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		// 벡터 속의 모든 정수 더하기
		int sum = 0;
		for(int i=0; i<v.size(); i++) {
			int n = v.elementAt(i);
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합 : " + sum);
		

	}

}
