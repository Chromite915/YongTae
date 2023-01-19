package p1214;

/*
 * 인터페이스(interface)란?
 * 자식 클래스가 여러 부모 클래스를 상속받을 수 있다면, 다양한 동작을 수행할 수 있다는 장점을 가지게 될 것입니다.
 * 하지만 클래스를 이용하여 다중 상속을 할 경우 메소드 출처의 모호성 등 여러 가지 문제가 발생할 수 있어 자바에서는 클래스를 통한 다중 상속은 지원하지 않습니다.
 * 하지만 다중 상속의 이점을 버릴 수는 없기에 자바에서는 인터페이스라는 것을 통해 다중 상속을 지원하고 있습니다.
 * 인터페이스(interface)란 다른 클래스를 작성할 때 기본이 되는 틀을 제공하면서, 다른 클래스 사이의 중간 매개 역할까지 담당하는 일종의 추상 클래스를 의미합니다.
 * 자바에서 추상 클래스는 추상 메소드뿐만 아니라 생성자, 필드, 일반 메소드도 포함할 수 있습니다.
 * 하지만 인터페이스(interface)는 오로지 추상 메소드와 상수만을 포함할 수 있습니다.
 * 
 * 단, 클래스와는 달리 인터페이스의 모든 필드는 public static final이어야 하며, 모든 메소드는 public abstract이어야 합니다.
 * 이 부분은 모든 인터페이스에 공통으로 적용되는 부분이므로 이 제어자는 생략할 수 있습니다.
 * 이렇게 생략된 제어자는 컴파일 시 자바 컴파일러가 자동으로 추가해 줍니다.
 */

interface AdderInterface{
	int add(int x, int y);
	int add(int n);
}

class MyAdder implements AdderInterface{	// implements
	
	// 생성자를 오버라이딩 하여 변수 내용에 따라 다른 메소드로 활용
	@Override
	public int add(int x, int y) {			// x, y 생성자는 덧셈
		// TODO Auto-generated method stub
		return x+y;
	}
	@Override
	public int add(int n) {					// n 생성자는 누적덧셈
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		return sum;
	}
}

public class test인터페이스 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAdder adder = new MyAdder();
		System.out.println(adder.add(5,10));
		System.out.println(adder.add(10));
	}
}
