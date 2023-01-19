package p1130기초ㄱ;

import java.util.Scanner;

public class while합찾기미완성 {
	// 입력한 값중 양수의 합은

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수를 입력받고, 양수들만 합하여 출력하라. 0을 입력하면 종료.
		
		int sum=0; // sum은 합
		Scanner s = new Scanner(System.in);		
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");

		int n = s.nextInt(); // 정수 입력
		while(n != 0) { 
			if(n > 0) {
				sum += n; // sum = sum + n
				n = s.nextInt(); // 정수 입력
				} else if(n < 0) {
					continue;
		}
			while(n == 0) {
				break;
			}
		}
		System.out.println(sum);
	}

}
