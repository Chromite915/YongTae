package p1130기초ㄱ;

import java.util.Scanner;

public class for입력값까지더하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [[[[[반복문]]]]]
		// for, while
		// for를 더 많이 씀
		
		// i값까지 다 더하기
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요 : ");
		int a = s.nextInt();
		int total = 0;
		for(int i=1; i<a+1; i++) {
	    // (변수선언, 조건선언, 증감선언)
//			System.out.println(i);
			total = total+i; // total += i;
			
//			
		}
		System.out.println(total);

		
	}
}