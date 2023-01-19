package p1130기초ㄱ;

import java.util.Scanner;

public class while기본 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for() {}
		// while() {}
		// while(true) = true일때만 반복하겠다
		// while로 구구단 해보기
		
		/*Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요 : ");
		int a = s.nextInt();
		int i = 1; // i는 1부터 시작
		while(i<10) { // i가 9까지만 반복하도록 제한
			System.out.println(a + "*" + i + "=" + (a*i));
			i++;
			if(i == 6) {
				break;
			}
		}
		
		while(true) {
			System.out.println(i++); // 여기까지는 무한루프
			if(i == 1000) {
				break; // 999로 제한
			
			}
		}*/
		
/*		int i = 1;
		int total = 0;
		while(true) {
			total += i;
			if(total == 10000) {
			break;
			}
			i++;
		}
		System.out.println(i);*/
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요.");
			int i = s.nextInt();
			if(i % 2 == 0) {
				System.out.println("짝수");
			} else
				System.out.println("홀수");
			
			System.out.println("계속(1), 종료(2)");
			int a = s.nextInt();
			if(a == 2) {
				break;
			}
		}	
		System.out.println("종료");
	}
}
