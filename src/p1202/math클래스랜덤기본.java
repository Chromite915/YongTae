package p1202;

import java.util.Random;

public class math클래스랜덤기본 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정의된것들을 가져다가 쓰기만 한다
		
		// random메소드 = 0.0 ~1.0 사이의 값을 다룸.
		// 보통 랜덤의 뒤에 10을 곱하고, 앞에 (int)를 붙여서 정수로 변환.
		// int x = (int)(Math.random()*8)+2;
		Random ra = new Random();
		for(int i=1; i<=5; i++) {
			// System.out.println((int)(Math.random() * 10) + 1); // 1 ~ 10 사이의 정수를 랜덤으로 출력. 마지막에 1을 더한 이유는 10도 나오게하기 위해.
			// System.out.println((int)(Math.random() * 10) + 2); // 2 ~ 11 사이의 정수를 랜덤으로 출력.
			int r = ra.nextInt(8)+2; // 2 ~ 9 사이. [[[곱하기 10이 포하되어있는가?]]]
			System.out.println(r);
		}
		System.out.println();
		System.out.println((int)(Math.random() * 100) + 1); // 1 ~ 10 사이의 정수를 랜덤으로 출력. 마지막에 1을 더한 이유는 10도 나오게하기 위해.
	}
}
