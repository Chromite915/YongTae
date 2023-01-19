package p1202;

import java.util.Scanner;

public class for구구단역순 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단 역순 + 입력값 까지만 구구단
		
		Scanner s = new Scanner(System.in);
		System.out.println("1~9 숫자를 입력하시오");
		int a = s.nextInt();
		for(int i=9; i>=a; i--) {
			System.out.println(i + "단");
			for(int j=1; j<=9; j++) {
				System.out.println(i + "x" + j + " = " + (i*j));
			}
			System.out.println("");
		}
	}

}
