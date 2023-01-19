package p1202;

import java.util.Random;
import java.util.Scanner;

public class math클래스랜덤문제내기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 랜덤으로 문제 내기
		
		Random ra = new Random(); //랜덤 숫자
		Scanner s = new Scanner(System.in); // 입력값
		int r = ra.nextInt(8)+2;
		int r2 = ra.nextInt(9)+1;
		
		System.out.println(r + " * " + r2 + " = "); // 문제 냄
		int a = s.nextInt();
		
		if(a != r*r2) {
			System.out.println("오답입니다. 정답은" + r*r2 + "입니다.");
		} else if(a == r*r2) {
			System.out.println("정답입니다.");
		}

	}

}
