package p1214;
// 카페에 있음

class Point { // 부모
	private int x, y;
	public Point(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x =x; this.y = y; }
}

class ColorPoint extends Point{ // 자식
	private String color;
	ColorPoint(){
		super(0, 0);
		this.color = "BLACK";
	}
	ColorPoint(int x, int y){
		super(x, y);
		this.color = "BLACK";
	}
	ColorPoint(int x, int y, String color){
		super(x, y);
	}
	public void setXY(int x, int y) {
		move(x, y); // private이라 move를 대신 호출
	}
	// 이 밑에는 getter setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() { // 오버라이드 재정의
		return color + "색의 " + "(" + getX() + "," + getY() + ")의 점";
	}
}

public class a02문제답안 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str+"입니다. ");
		
		ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색 점
		System.out.println(zeroPoint.toString() + "입니다.");
		ColorPoint cp2 = new ColorPoint(10, 10); // (10,10) 위치의 BLACK 색 점
		cp2.setXY(5,5);
		cp2.setColor("RED");
		System.out.println(cp2.toString()+"입니다.");
	}
}