package p1130기초ㄱ;

public class if예제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10의 합, 짝수합과 홀수합, 반복문
		
		int t1 = 0;
		int t2 = 0;
		for(int i=1; i<=10; i++) {
			if(i % 2 == 1) {
				t1 = t1+i;
			} else if(i % 2 == 0) {
			t2 = t2+i;
			}	
		}
		int c = t1+t2;
		System.out.println(c);
		System.out.println("홀수의 합 = " + t1);
		System.out.println("짝수의 합 = " + t2);
	}
}
