package p1215;

import java.util.Scanner;

public class a02PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		a02Phone galaxy = new a02Phone("갤럭시", 1, 1500);	// 이름, 구매량, 가격
		a02Phone iphone = new a02Phone("아이폰", 2, 2000);
		
		while(true) {
			System.out.println("갤럭시 구매 갯수 입력 : ");
			galaxy.buy(s.nextInt());
			System.out.println("현재까지 총 구매 갯수 : " + galaxy.getBuyNum()); // 입력할때마다 구매갯수 누적됨 (this.buyNum += num)
			System.out.println("계속구매1, 종료2");
			if(s.nextInt() == 2) {
				break;
			}
		}

	}

}
