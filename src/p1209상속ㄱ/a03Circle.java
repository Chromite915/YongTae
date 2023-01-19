package p1209상속ㄱ;


public class a03Circle {
	// 틀(구체화되지않음)
	// 퍼블릭 스테틱 보이드 체크 안하고 만들었음
	
	public int radius; // 반지름
	public String name;
	public String color;
	
	public double getArea() { 
		// 넓이, double 자리에 String이 올 수도 있고, Void가 올 수도 있다. void면 리턴이 없어도 된다.
		return 3.14 * radius * radius; // 리턴의 의미는 되돌려준다는 뜻
	}
	public String getColor() {
		return color;
	}
	

}
