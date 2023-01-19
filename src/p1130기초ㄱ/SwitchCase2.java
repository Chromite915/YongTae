package p1130기초ㄱ;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//06번 if, else 클래스를 switch, case 형태로 바꿔서 해보는것
		
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해 주세요 : ");
		int a = s.nextInt();
		System.out.println("두번째 숫자를 입력해 주세요 : ");
		int b = s.nextInt();
		System.out.println("수식을 선택해 주세요." + "[+, -, *, /]");
		char c = s.next().charAt(0); // 0은 index 관점에서 첫번째라는 의미
		
		int value=0;
		switch (c) {
			case '+':
				value = a + b;
				break;
			case '-':
				value = a - b;
				break;
			case '*':
				value = a * b;
				break;
			case '/':
				value = a / b;
				break;
			
		}
		System.out.println(a + "" + c + "" + b + "=" + value);
		// "" 2개 뺐더니 정답 나왔지만 과정이 이상해졌다.
		// 이상한 ""가 2개가 들어간 이유는? char로 하면 아스키코드 때문에 숫자로 인식되서 계산이 이상해짐.
		// 문자열로 변환하려고 ""을 넣은것
	}

}