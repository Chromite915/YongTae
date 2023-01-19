package p1202;

public class while구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while, do-while 의 차이점
		// do-while은 조건이 false이더라도 무조건 한번은 실행해야함
		// [[[while로 구구단 하기]]]
		
		int a = 2;
		while(a<=9) {
			System.out.println(a + "단");
			int b =1; // 여기에 위치해야함. 위쪽에 하면 안됨.
			while(b<=9) {
				System.out.println(a + "x" + b + " = " + (a*b));
				b++;
			}
			System.out.println();
			a++;
		}

	}

}
