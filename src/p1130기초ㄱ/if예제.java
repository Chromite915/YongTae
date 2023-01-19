package p1130기초ㄱ;

public class if예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100중 3배수합
		
		int t = 0;
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0) {
				t = t+i;
			}
		}
		System.out.println("1부터 100중 3의 배수의 합 = " + t);
	}
}
