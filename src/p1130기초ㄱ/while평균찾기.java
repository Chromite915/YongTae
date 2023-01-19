package p1130기초ㄱ;

import java.util.Scanner;

public class while평균찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0; // count는 입력된 정수의 개수
		int sum=0; // sum은 합
		Scanner s = new Scanner(System.in);		
		System.out.println("정수들을 입력하고, 종료시 -1을 입력하세요.");

		int n = s.nextInt(); // 정수 입력
		while(n != -1) { // -1이 입력되면 while을 벗어나 if else로 간다
			sum += n; // sum = sum + n
			count++;
			n = s.nextInt(); // 정수 입력
		}
		if(count == 0) {
			System.out.println("입력된 수가 없습니다.");
		} else {
			System.out.print("정수의 개수는 " + count + "개이며 ");
			System.out.println("평균은 " + (double)sum/count + "입니다.");
		}

	}

}
