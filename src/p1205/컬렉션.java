package p1205;

import java.util.ArrayList;

public class 컬렉션 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>(); 
		// 가변크기라서 괄호 안에 숫자 안넣어도 됨.
		
		a.add("hell");
		a.add("JAVA");
		a.add("HELL");
		a.add(2, "TEST"); // HELL을 TEST로 대체
		
		System.out.println("");
		
		for(int i=0; i<3; i++) {
			System.out.println(a.get(i));
		}

	}

}
