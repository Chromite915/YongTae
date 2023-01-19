package p1214;

import java.util.Scanner;

public class a052FruitSellMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		a052FruitSell banana = new a052FruitSell("바나나", "노란색", 1500);
		
		while(true) {
			System.out.print("구매 개수 입력 : ");
			banana.buy(s.nextInt());			// s.nextInt() 에 입력한 값으로 buy 메소드 호출
			System.out.print("추가구매(1), 종료(2) ");
			if(s.nextInt() == 2) {
				break;
			}
		}
		System.out.println(banana.toString());	// 2 눌러서 종료시 toString 호출
	}

}
