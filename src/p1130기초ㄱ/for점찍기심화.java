package p1130기초ㄱ;

import java.util.Scanner;

public class for점찍기심화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("줄의 수 입력");
		int a = s.nextInt();
		
		for(int i=1; i<=a; i++) {      // i-> j
			for(int j=1; j<=i; j++) {  // j -> *
				System.out.print("*"); // * -> ""
			}
			System.out.println("");    // "" -> i
		}
	}	
}