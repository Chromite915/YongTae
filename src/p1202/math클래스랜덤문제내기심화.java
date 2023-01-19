package p1202;

import java.util.Random;
import java.util.Scanner;

public class math클래스랜덤문제내기심화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제의 수 입력받기. 문제들의 답 다 매칭. 다 풀면 다시 반복.
		Random ra = new Random();
		Scanner s = new Scanner(System.in);

		while (true) { // [[[기존 수식을 while과 break 사이에 넣은것]]]
			int count = 0; // 정답 갯수
			System.out.println("문제 수 입력"); // int n 보다 위에 있어야 실행시 출력됨.
			int n = s.nextInt(); // 문제 전체수

			for (int i = 1; i <= n; i++) { // 입력한 문제 전체수만큼 반복
				int r = ra.nextInt(8) + 2; // for 안에서 정의해야 다 다른 문제가 나옴.
				int r2 = ra.nextInt(9) + 1; // for 안에서 정의해야 다 다른 문제가 나옴.
				System.out.println(r + " * " + r2 + " = "); // 문제 내용
				int a = s.nextInt(); // 답값

				if (r * r2 == a) { // 입력한 답값 일치시
					System.out.println("정답");
					count++; // 정답값수 증가
				} else { // 미일치시
					System.out.println("오답. 정답은 " + (r * r2));
				}
			}
			System.out.println(n + "문제 중 " + count + "문제 정답"); // 결산
			System.out.println("계속 하시겠습니까? (1)계속 (2)종료"); // 여기선 2만 아니면 다 반복됨
			int countinue = s.nextInt(); // 이후값
			if (countinue == 2) {
				System.out.println("종료");
				break; // 2가 아니면 위로 돌려보낸다
			}
		} // 여기까지가 while
	}
}