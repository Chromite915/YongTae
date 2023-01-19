package p1130기초ㄱ;

import java.util.Scanner;

public class if홀짝구분1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		/* 위의 뜻은
		Scanner s;
		s = new Scanner(System.in); 와 같다.
		즉, s에 new Scanner(System.in)를 선언한다는 뜻
		일종의 모듈화.
		빨간x 뜬건 당연함.
		빨간엑스 클릭하고 임포트 하면 위에 import 라인이 추가되고 빨간엑스 사라짐.
		컨트롤시프트o 눌러도 정의를 자동으로 해줌. 그러나 동명의 스캐너를 혼동할 수도 있음.*/
		
		//빨간엑스가 뜨면 임포트 부분을 살펴봐라.
		System.out.print("숫자를 입력해 주세요 : ");
		
		//int a = 123를 아래로 대체;
		int a = s.nextInt(); // 숫자를 입력받는 요소
		if(a < 1) {
			System.out.println("1이상의 숫자를 입력해주세요");
		} else if(a % 2 == 0) {
			System.out.println("짝");
		} else {
			System.out.println("홀");
			//if, else, else if
		}
	}
}
