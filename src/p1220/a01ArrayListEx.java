package p1220;

import java.util.ArrayList;
import java.util.Scanner;
	
public class a01ArrayListEx {
		// 입력한 숫자중 가장 큰 숫자 찾기

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<int> a = new ArrayList<int>(); // 숫자로 배열 하려면 어떻게?
		Random ra = new Random();
			
		// 키보드로부터 4개 입력받아 삽입
		Scanner scanner = new Scanner(System.in);
		System.out.println("배열이 가질 수의 양을 입력");
		int n = nextint();
		for(int i=0; i<n+1; i++) {
			System.out.print("숫자를 입력하시오>>");
			String s = scanner.next();
			a.add(s); // ArrayList 컬렉션에 삽입
		}
		for(int i=0; i<a.size(); i++) {
			// ArrayList의 i번째 숫자 얻어오기
			String name = a.get(i);
			System.out.print(name + " ");
		}
		// 가장 큰 숫자 출력
		int longestIndex = 0;
		for(int i=1; i<a.size(); i++) {
			if(a.get(longestIndex).length() < a.get(i).length())
				longestIndex = i;
		}
		System.out.println("\n가장 큰 수는 : " + a.get(longestIndex));
	}
}
