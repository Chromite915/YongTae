package p1221;

import java.util.InputMismatchException;
import java.util.Scanner;

public class a03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 정수 3개를 입력받아 전부 더함 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개 입력");
		int sum = 0, n = 0;
		for(int i=0; i<3; i++) {
			System.out.println(i+">>");
			try {
				n = scanner.nextInt(); // 정수 입력하기. 정수가 아니면 catch를 실행
			}
			catch(InputMismatchException e) {
				System.out.println("입력된 값이 정수가 아님. 다시 입력.");
				scanner.next(); // 입력스티림에 있는 정수가 아닌 토큰을 버린다(버퍼에 남아있는것을 버린다)
				i--; // 인덱스가 증가하지 않도록 미리 감소
				continue;
			}
			sum += n;
		}
		System.out.println("합 = " + sum);
		scanner.close();
	}

}
