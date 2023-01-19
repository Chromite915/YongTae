package p1209상속ㄱ;

public class a03CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 원 생성
		a03Circle c1 = new a03Circle(); // 1번째 Circle과 3번째 Circle은 Circle 클래스에 종속된것
		a03Circle c2 = new a03Circle();
		c1.color = "Red";
		c1.radius = 3;
		
		c2.color = "Blue";
		c2.radius = 5;
		
		/* 이름이 c3인 circle 개체 생성
		 * radius = 10
		 * color = yellow
		 * c3의 getArea() 호출해서 변수 area에 담은 후
		 * area 출력
		 * Circle클래스에 getColor 이름의 메소드 만들고
		 * return으로 변수 color에 있는 값
		 * getColor() 호출해서 변수  color에 담고
		 * color 출력
		 */
		a03Circle c3 = new a03Circle();
		c3.radius = 10;
		c3.color = "Yellow";
		double area = c3.getArea(); // area 정의
		System.out.println(area);
		String color = c3.getColor();
		System.out.println(color);
		System.out.println(c3);
		

	}

}
