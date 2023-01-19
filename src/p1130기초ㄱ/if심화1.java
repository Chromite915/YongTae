package p1130기초ㄱ;

import java.util.Scanner;

public class if심화1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner s = new Scanner(System.in);
				System.out.println("점수를 입력해 주세요(0~100) : ");
				int score = s.nextInt();
				System.out.println("학년을 입력해 주세요(1~4) : ");
				int grade = s.nextInt();
				
				if(grade <= 2) {
					if(score >= 70) {
						System.out.println("합격");
					} else {
						System.out.println("불합격");
					}
				} else {
				   if(score >= 80) {
						System.out.println("합격");
					} else {
						System.out.println("불합격");
				    }
		          }
	}
}
		