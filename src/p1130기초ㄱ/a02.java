package p1130기초ㄱ;

public class a02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a = 10;
		int b = 5;
		int c = 5;
		
		int d = a + b;
		System.out.println(d);
		d = a - b;
		System.out.println(d);
		d = a * b;
		System.out.println(d);
		d = a / b;
		System.out.println(d);
		d = a % b; // 나머지 연산(나누고 남은거)
		System.out.println(d);
		
		a += b; // a = a + b
		System.out.println(a);
		a -= b;
		System.out.println(a);
		a *= b;
		System.out.println(a);*/
		
		// 증감 연산자
		int num1 = 10;
		int num2;
		
		//++num1 은 num1++와 같지만, 다른것과 연산할땐 의미가 달라진다
		
		num2 = ++num1; // num1은 11, 그 다음에 num2를 구해보니 num2도 11(num1을 +1한 후에 num2 정의했기에)
		System.out.println("num2 ==>" + num2); // 11
		System.out.println("num1 ==>" + num1); // 11
		
		//위에서 num1이 11로 정의된 상태
		num2 = num1--; // num1은 10(11에서 1 뺐으니까), 그 다음에 num2를 구해보니 num2은 11(여기선 -1을 하기 전의 num1이기에)
		System.out.println("num2 ==>" + num2); // 11
		System.out.println("num1 ==>" + num1); // 10
		

	}

}
