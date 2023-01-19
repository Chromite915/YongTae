package p1202;

import java.util.Scanner;

public class 배열스캐너나열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 배열 5개짜리
		// 2. scanner 이용해서 값 5개 입력받기
		
		Scanner s = new Scanner(System.in);
		int array[] = new int[5];          // array에 있는 자리 5개
		
		for(int i=0; i<array.length; i++) {// 0부터 시작해서 array - 1의 횟수만큼
			array[i] = s.nextInt();        // 숫자를 입력한다
			
		}
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);  // 위에서 입력한 값들을 나열
		}
	}
}
