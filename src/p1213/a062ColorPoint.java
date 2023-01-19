package p1213;

class a062ColorPoint extends a061Point { 
	private String color; // 점의 색
	
	a062ColorPoint() {                    // 어떤 생성자를 호출하든 기본 생성자는 꼭 같이 호출됨
		System.out.println("ColorPoint 클래스의 기본 생성자");
	}
	public a062ColorPoint(int x, int y, int z) {
		super(x, y, z);                   // super = 부모클래스의 변수를 골라서 호출하겠다
		// 지금은 부모클래스에 매개변수가 3개 있는 생성자를 다 호출하겠다는 뜻. z를 없애면 2개짜리 매개변수를 호출한다.
		System.out.println("ColorPoint 클래스의 매개변수 있는 생성자");
	}
	public a062ColorPoint(int x, int y, String color) {
		super(x, y); // Point의 생성자 Point(x, y) 호출
		this.color = color;
	}
	public void showColorPoint() { // 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint(); // Point 클래스의 showPoint() 호출
	}
}
// 쇼포인트 = 좌표 출력
// 쇼컬러포인트 = 쇼포인트의 좌표출력을 포함했으니, 색상출력문만 추가함