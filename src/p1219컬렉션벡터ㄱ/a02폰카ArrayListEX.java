package p1219컬렉션벡터ㄱ;

import java.util.ArrayList;
import java.util.Scanner;

public class a02폰카ArrayListEX {
	// 입력문중 가장 긴것 찾기

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 폰카에 전체 있음
		ArrayList<String> a = new ArrayList<String>();
		// 문자열만 삽입 가능한 ArrayList 컬렉션 생성
		
		// 키보드로부터 4개의 이름 입력받아 삽입
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.print("이름을 입력하시오>>");
			String s = scanner.next();
			a.add(s); // 입력값 s를 ArrayList 컬렉션에 삽입
			
		}
		for(int i=0; i<a.size(); i++) {
			// ArrayList의 i번째 문자열을 name으로 지정
			String name = a.get(i);
			System.out.print(name + " ");
			
		}
		
		// 가장 긴 이름 출력
		int longestIndex = 0;
		for(int i=1; i<a.size(); i++) {
			if(a.get(longestIndex).length() < a.get(i).length())
				longestIndex = i;
		}
		System.out.println("\n가장 긴 이름은 : " + a.get(longestIndex));
	}
}
