package p1214;

import java.util.Scanner;

public class a053중요FruitSellMain2 {
	static void buy(a053FruitSell2[] fruit) {
		for(a053FruitSell2 f : fruit) {
			if(f.getNum() > 0) {
				System.out.println(f.toString());
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("과일 구매 서비스.");
		System.out.println("구매할 과일을 선택해주세요.");
		a053FruitSell2 apple = new a053FruitSell2("사과", "빨간색", 1000);
		a053FruitSell2 kiwi = new a053FruitSell2("키위", "초록색", 2000);
		a053FruitSell2 banana = new a053FruitSell2("바나나", "노란색", 1500);
		
		while(true) {
			System.out.println("사과-1000원(1), 키위-2000원(2), 바나나-1500원(3)");
			int fruitNum = s.nextInt();
			System.out.print("구매 개수 입력 : ");
			int num = s.nextInt();
			if(fruitNum == 1) {
				apple.buy(num);
			} else if(fruitNum == 2) {
				kiwi.buy(num);
			} else {
				banana.buy(num);
			}
			System.out.print("추가구매(1), 종료(2) ");
			if(s.nextInt() == 2) {
				break;
			}
		}
		a053FruitSell2[] f = {apple, kiwi, banana};
		buy(f);
	}
}
