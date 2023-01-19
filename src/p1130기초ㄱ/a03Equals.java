package p1130기초ㄱ;

import java.util.Scanner;

public class a03Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해 주세요 : ");
		int a = s.nextInt();
		System.out.println("두번째 숫자를 입력해 주세요 : ");
		int b = s.nextInt();
		System.out.println("수식을 선택해 주세요." + "[+, -, *, /]");
		String cal = s.next();
		// int c = s.nextInt();를 String cal = s.next(); 로 바꿈.
		// 숫자가 아닌 기호나 문자를 값으로 입력 가능하다.
		
		System.out.println(cal); // cal을 +-*/ 중 하나로 쓰면 아래의 결과
		
		if(cal.equals("+")) {
			System.out.println("두 수의 더하기는 " + (a + b) + " 입니다.");
		} else if(cal.equals("-")) {
			System.out.println("두 수의 빼기는 " + (a - b) + " 입니다.");
		} else if(cal.equals("*")) {
			System.out.println("두 수의 곱하기는 " + (a * b) + " 입니다.");
		} else if(cal.equals("/")) {
			System.out.println("두 수의 나누기는 " + (a / b) + " 입니다.");
		}
	}

}
