package p1213;

class a061Point {
	
	private int x, y, z; // 한 점을 구성하는 x, y 좌표
	
	
	
	public a061Point() {
		System.out.println("Point 클래스의 기본 생성자");
		this.x = this.y = 0;
	}
	public a061Point(int x, int y) {
		System.out.println("Point 클래스의 매개변수 2개 있는 생성자");
		this.x = x; this.y = y;
	}
	public a061Point(int x, int y, int z) {
		System.out.println("Point 클래스의 매개변수 3개 있는 생성자");
		this.x = x; this.y = y; this.z = z;
	}
	
	
	
	public void showPoint() { // 점의 좌표 출력
		System.out.println("(" + x + "," + y + ")");
	}
}