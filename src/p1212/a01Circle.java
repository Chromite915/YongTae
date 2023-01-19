package p1212;

public class a01Circle {
	/* 객체를 배열
	 * 여기에선 배열 안나옴 */
	
	int radius;
	
	public a01Circle(int radius) { // 매개변수 가진 생성자
		this.radius = radius;
	}
	public double getArea() {     // 메소드
		return 3.14 * radius * radius;
	}
}
