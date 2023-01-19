package p1130기초ㄱ;

import java.util.Scanner;

public class if홀짝구분3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("100 이상인 숫자를 입력해 주세요 : ");
		int a = s.nextInt();
		
		if(a % 2 == 0) {
			if(a >= 100) {
				System.out.println("100이상인 짝수");
			} else {
				System.out.println("짝수");
			}
		} else {
			if(a >= 100) {
				System.out.println("100이상인 홀수");
			} else {
				System.out.println("홀수");
			}
		}

	}

}
