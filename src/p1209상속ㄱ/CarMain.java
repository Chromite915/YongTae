package p1209상속ㄱ;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*2. 메인 메소드에서 car1 객체 생성(Car클래스를 이용)
		 * 3. car1 객체의 speed를 0, maxSpeed를 200, color를 black, kind를 소나타로 초기화
		 * 4. getSpeed, getMaxSpeed, getColor 메소드 호출 후 변수에 담기, 출력
		 * 5. speedUp을 호출 후 다시 getSpeed 호출하기
		 * */
		
		Car car1 = new Car(); // 공백의 생성자로 만든 차
		car1.speed = 0;
		car1.maxSpeed = 200;
		car1.color = "black";
		car1.kind = "소나타";
		
		int getSpeedc1 = car1.getSpeed();
		int getMaxSpeed = car1.getMaxSpeed();
		String getColor = car1.getColor();
		
		System.out.println(getSpeedc1);
		System.out.println(getMaxSpeed);
		System.out.println(getColor);
		
		car1.speedUp();		// +10
		car1.speedUp(30);	// +30
		car1.speedUp(50.5);	// +50.5
		car1.speedUp(50, 50); // 4개 다 똑같은 이름인 speedUp 메소드를 호출했으나, 데이터 오버로딩 원리에 따라 동시에 사용 가능
		double speed = car1.getSpeed();
		System.out.println(speed); // 입력한 speedUP 값들 누적됨, speed값 분류가 int가 아니라 double였으면 140.1로 출력
		System.out.println(getMaxSpeed);
		System.out.println();
		
		
		
		
		Car car2 = new Car("Red", "로디우스"); // 괄호 안이 차있는 생성자로 만든 차
		System.out.println(car2.color);
		System.out.println(car2.kind);
		System.out.println(car2.speed);
		System.out.println(car2.maxSpeed);
		

	}

}
