package p1130기초ㄱ;

import java.util.Scanner;

public class for홀짝의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i값까지 다 더하기
		
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요 : ");
		int a = s.nextInt();
		int oddsum = 0;
		int evensum = 0;
		for(int i=1; i<=a; i++) {
			if(i % 2 == 1) {
				oddsum = oddsum+i;
			} else {
				evensum = evensum+i;
			}
		}
		System.out.println("홀수 합 : " + oddsum);
		System.out.println("짝수 합 : " + evensum);
	}
}