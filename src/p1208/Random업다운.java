package p1208;

import java.util.Random;
import java.util.Scanner;

public class Random업다운 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random ra = new Random();
		Scanner s = new Scanner(System.in);
		int com = ra.nextInt(100)+1;
		int count = 1;
		System.out.println("1 ~ 100 사이의 랜덤한 숫자를 맞추시오");
		System.out.println("숫자 입력 : ");
		for(int i=1; i<=10; i++) {
			int a = s.nextInt();
			if(com > a) {
				System.out.println("UP");
				count++;
			} else if(com < a) {
				System.out.println("DOWN");
				count++;
			} else {
				System.out.println("CORRECT! " + "시도 횟수 : " + (count));
				break;
			}
		}
	}

}
