package p1214;

class Circle{
	private int radius;
	
	public Circle(int radius){		// 생성자
		this.radius = radius;
		}
	public int getRadius(){			// 메소드
		return radius;
		}
}
class NamedCircle extends Circle{
	String name;
	
	NamedCircle(int radius, String name){	// 생성자
		super(radius);
		this.name = name;
	}
	void show() {							// 메소드
		System.out.println(this.name + ", 반지름 = " + getRadius());
	}
}




public class test상속 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NamedCircle w = new NamedCircle(5, "waffle");
		w.show();
	}

}
