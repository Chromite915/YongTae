package p1130기초ㄱ;

import java.util.Scanner;

public class for배수찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력된 값에서 3의 배수 찾기
		
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요 : ");
		int a = s.nextInt();
		int count = 0; // 갯수
		
		for(int i=1; i<=a; i++) {
			if(i % 3 == 0 ) {
				count++;
			}	
		}
		System.out.println("입력한 값에서 3의 배수의 갯수는 : " + count);
	}
}