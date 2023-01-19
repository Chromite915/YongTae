package p1205;

import java.util.Scanner;

public class 배열MaxIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int array[] = new int[5]; // 공간만 5개 할당. 입력된 값 없음.
		
		int max=0; // 현재 가장 큰 수
		System.out.println("양수 5개를 입력하시오");
		for(int i=0; i<5; i++) {
			array[i] = (int) scanner.nextInt(); // 입력받은 정수 5개를 배열에 지정한다.
			if(array[i] > max) // array[i] 가 현재 가장 큰 수보다 크면
				max = array[i]; // array[i] 를 max로 변경
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
		System.out.println();
		
		//예제 : 위 입력한 5개의 값들 출력, 5개 값의 총합
		int sum = 0;                           // 총합수 자격 할당
		for(int i=0; i<array.length; i++) { // 나열한 값들 자격 할당
			System.out.println(array[i]); // 위에서 뽑힌 정수들 출력
			sum += array[i]; // 총합하기
		}
		System.out.println();
		System.out.println("총합 : " + sum); // 총합 출력
	}
} // 공간 할당 ㅡ 반복문 공간만큼 설정 ㅡ 변수 주입 ㅡ 비교 ㅡ 적용 ㅡ 출력
  // 합값 할당 ㅡ 반복문 공간만큼 설정 ㅡ 변수들 나열 ㅡ 총합
