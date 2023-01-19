package p1209상속ㄱ;

import java.util.Scanner;

public class RectangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Rectangle우회접근 rect = new Rectangle우회접근();	// 부모클래스 정보로 객체 생성
			Scanner scanner = new Scanner(System.in);
			System.out.print(">> ");
			
			/* rect.width = scanner.nextInt();
			rect.height = scanner.nextInt();
			는 Rectangle클래스의 width, heigth 선언이 private 되어있지 않을때 쓰는것 */
			
			// 상위클래스에서 private 선언 되어있고, 우회적으로 접근하려할때 쓰는것
			int widthM = scanner.nextInt();
			rect.setWidth(widthM);
			int heightM = scanner.nextInt();
			rect.setHeight(heightM);
			
			System.out.println("사각형의 면적은 " + rect.getArea()); // 호출
			
			scanner.close(); // scanner를 다시 닫는다(컴퓨터에 걸리는 부하를 덜어주기 위해)

	}

}
