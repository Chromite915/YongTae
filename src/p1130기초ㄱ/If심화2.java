package p1130기초ㄱ;

import java.util.Scanner;

public class If심화2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해 주세요 : ");
		int a = s.nextInt();
		System.out.println("두번째 숫자를 입력해 주세요 : ");
		int b = s.nextInt();
		System.out.println("수식을 선택해 주세요." + "[1 => +, 2 => -, 3 => *, 4=> /]");
		// 난 여기까지밖에 못했다
		int c = s.nextInt();
		
		if(c == 1) {
			System.out.println("두 수의 더하기는 " + (a + b) + " 입니다.");
		} else if(c == 2) {
			System.out.println("두 수의 빼기는 " + (a - b) + " 입니다.");
		} else if(c == 3 ) {
			System.out.println("두 수의 곱하기는 " + (a * b) + " 입니다.");
		} else if(c == 4) {
			System.out.println("두 수의 나누기는 " + (a / b) + " 입니다.");
		}
		
		
	}	
}
