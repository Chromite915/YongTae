package p1130기초ㄱ;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char grade;
		System.out.print("점수를 입력하세요(0~100) : ");
		int score = scanner.nextInt();
		switch (score/10) { // 점수를 10으로 나눈다(int라서 소수점은 버려진다)
			case 10: // 10에는 break;를 넣지 않은 이유는 어차피 A학점이라서 9랑 마찬가지라
			case 9: // 90~99
				grade = 'A';
				break;
			case 8: // 80~89
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default: // 59 이하
				grade = 'F';
		}
		System.out.println("등급은 " + grade + "입니다.");
		
		
		
		
		
	}

}
