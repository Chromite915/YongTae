package p1221;

public class a12StringFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 자바 책들도 다루는 책이 있고 안다루는 책이 있다 */
		
		String name = "홍길동";
		int age = 30;
		
		System.out.println("이름은 " + name + ", 나이는 " + age); // 지금까지의 방식
		
		System.out.printf("이름은 %s, 나이는 %d", name, age); // printf 방식
		// [[[포멧 지정자]]] : %s => 모든 자료형을 문자열로 반환, %d => 정수형, %f
		
		System.out.println();
		System.out.printf("%s", name);
		System.out.println();
		System.out.printf("%5s", name);
		System.out.println();
		System.out.printf("%9s", name);
		
		System.out.println();
		System.out.printf("%9d", age);
		// %와 d 사이 숫자의 의미 = 공간

	}

}
