package p1209상속ㄱ;

public class Car {
	
	/* Car클래스를 생성
	 * 1-1. 변수 int speed, int maxSpeed, String color, Strinf kind 생성
	 * 1-2. 메소드 speedUp 메소드 생성. 호출시 speed값 10 증가, maxSpeed값 초과 불가
	 * 1-3. 메소드 getSpeed 메소드 생성. 호출시 현재 speed값 리턴
	 * 1-4. 메소드 getMaxSpeed 메소드 생성. 호출시 현재 maxSpeed값 리턴
	 * 1-5. 메소드 getColor 메소드 생성. 호출시 color값 리턴
	 * 2. 메인 메소드에서 car1 객체 생성(Car클래스를 이용)
	 * 3. car1 객체의 speed를 0, maxSpeed를 200, color를 black, kind를 소나타로 초기화
	 * 4. getSpeed, getMaxSpeed, getColor 메소드 호출 후 변수에 담기, 출력
	 * 5. speedUp을 호출 후 다시 getSpeed 호출하기
	 */
	
	public int speed;
	public int maxSpeed;
	public String color;
	public String kind;
	
	
	// [[[기본 생성자]]]
	// 클래스와 이름이 완전이 같다.
	// CarMain클래스에서 새로운 car1, car2, car3 등을 만들때마다 계속 실행된다.
	// 호출하지 않아도 자동으로 실행된다.
	// 매개변수를 가진 생성자가 있으면 기본생성자는 자동으로 생성되지 않는다
	public Car() {
		System.out.println("자동차를 생산했습니다.");
	}
	
	public Car(String color, String kind) {
		System.out.println("자동차를 생산했습니다.");
		speed = 0;
		maxSpeed = 200;
		this.color = color; // this를 쓰면 이름이 똑같은 변수라도 차별화한 선언이 가능하다
		this.kind = kind;
	} // 생성자라도, 괄호 안에 이러한 조건이 들어가면 위에 반드시 공백의 생성자를 넣어줘야만 한다.
	  // 조건이 들어간 생성자가 있으면 Main클래스에서도 car의 괄호 안에 다이렉트로 변수를 지정해줄 수 있다.
	
	
	// [[[메소드]]]
	// 4개 다 똑같은 이름의 speedUP 메소드이지만, 4개 다 다른 방식이라 동시에 사용 가능하다.
	public void speedUp() {
		speed += 10;
		if(maxSpeed < speed) {
			speed = maxSpeed;
		}
	}
	public void speedUp(int sp) { // void면 return을 안쓰지만, 괄호 안에 이렇게 넣어주면 주고받을 수 있게됨
		speed += sp; // 입력값만큼 speed 증가
		if(maxSpeed < speed) {
			speed = maxSpeed;
		}
	}
	public void speedUp(double sp) { // void면 return을 안쓰지만, 괄호 안에 이렇게 넣어주면 주고받을 수 있게됨
		speed += sp;
		if(maxSpeed < speed) {
			speed = maxSpeed;
		}
	}
	public void speedUp(int sp, int sp2) { // void면 return을 안쓰지만, 괄호 안에 이렇게 넣어주면 주고받을 수 있게됨
		speed += (sp+sp2);
		if(maxSpeed < speed) {
			speed = maxSpeed;
		}
	}
	// 4개 다 똑같은 이름의 speedUP 메소드이지만, 4개 다 다른 방식이라 동시에 사용 가능하다.
	// 메소드 오버로딩
	// ex)똑같은 print라도 종류가 엄청 많다
	
	
	public int getSpeed() {
		return speed;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public String getColor() {
		return color;
	}

}
