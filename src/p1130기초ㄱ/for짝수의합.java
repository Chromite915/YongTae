package p1130기초ㄱ;

import java.util.Scanner;

public class for짝수의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요 : ");
		int a = s.nextInt();
		int total = 0;
		for(int i=1; i<=a; i++) {
			if(i % 2 == 0) {
				total = total+i;
			}
		}
		System.out.println("짝수의 합 : ");
		System.out.println(total);
		// 여기까지가 내가 한것
	}
}
