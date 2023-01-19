package p1209상속ㄱ;

public class Rectangle우회접근 {
	private int width; // private : 자신의 클래스 내에서만 width에 접근할 수 있도록 한다.(Main클래스에서 참조 불가능)
	private int height;
	
	/* private으로 잠근 width값을 우회적으로 활용하기 위해 추가함
	// private 되어있지 않을땐 바로 매소드(getArea) 로 갔음
	public void setwidth(int width) { 
		this.width = width;
	}
	public void setheigth(int heigth) {
		this.height = heigth;
	}*/
	
	
	// 우클릭 - 소스 - 제너레이트 개터 앤 세터 - get메소드 자동 생성
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
	
	public int getArea() {
		return width*height;
	}

}
