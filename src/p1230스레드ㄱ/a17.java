package p1230스레드ㄱ;

import java.util.Scanner;

/* 아무 키나 입력시 스레드 실행 시작
 * 콘솔창에 1~0 출력하고 스레드 종료되도록 코딩
 */
public class a17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("아무 키나 입력");
		scanner.nextLine();
		scanner.close();
		Thread th = new Thread(new CountingThread());
		th.start();
	}
}
class CountingThread implements Runnable {
	@Override
	public void run() {
		System.out.println("스레드 실행 시작");
		for(int i=0; i<=10; i++)
			System.out.print(i + " ");
		System.out.println();
	}
}