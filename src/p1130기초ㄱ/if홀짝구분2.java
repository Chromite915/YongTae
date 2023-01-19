package p1130기초ㄱ;

import java.util.Scanner;

public class if홀짝구분2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("100 이상인 숫자를 입력해 주세요 : ");
		// 이거 안쓰면 f11 눌러도 아무것도 안떠서 작동 안되는줄 햇갈릴 수 있음
		int a = s.nextInt();
		
		// if나 else 안에 또 다른 if를 넣을 수도 있다.
		//내가 만든 오답@@@
		/*if(a % 5 == 0) {
			System.out.println("짝수이면서 5의 배수 입니다.");
		}	else if(a % 2 == 0) {
				System.out.println("짝수입니다.");
			}
		if(a % 3 == 1) {
			System.out.println("홀수입니다.");
		}	else if(a % 3 == 1) {
				System.out.println("홀수이면서 3의 배수입니다.");*/
		
		// 답안
		if(a % 2 == 0) {
			if(a % 5 == 0) {
				System.out.println("짝수이면서 5의 배수이다.");
			} else {
				System.out.println("짝수");
			}	
	    } else { // 위에서 홀짝 여부 결정했으므로 여기서부터는 무조건 홀수
		   if(a % 3 == 0) {
			   System.out.println("홀수이면서 3의 배수이다.");
		   } else {
			   System.out.println("홀수");
		   }
	    }
	}
}