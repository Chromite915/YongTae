package p1213;

class Shape {
	protected String name;
	
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println(name);
	}
}


public class a11Circle extends Shape {
	protected String name; // 이 name은 a11Circle의 name "Circle".
	
	@Override
	public void draw() {		// 부모의 draw 메소드를 재정의
		name = "Circle";
		super.name = "Shape"; // 부모의
		super.draw();         // 부모의
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape b = new a11Circle();
		b.paint(); // paint는 Shape의 draw이지만, draw도 a11Circle에서 재정의 되었으므로 a11Circle의 draw들을 출력한다 
	}

}
