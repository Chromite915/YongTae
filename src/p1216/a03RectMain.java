package p1216;
// int 타입의 너비와 높이 필드를 가지는 Rect클래스
// 면적이 같으면 두 Rect 객체가 같은것으로 판별하는 Equals()를 작성하기.
// 생성자에서 너비와 높이를 받아 너비와 높이 필드를 초기화하기.

class Rect {
	private int w, h; // w = width, h = height
	
	public Rect(int w, int h) {
		this.w = w; this.h = h;
	}
	public boolean equals(Object obj) { // 업캐스팅. Rect가 Object로 바뀌므로 w자리과 h자리가 사라짐.
		Rect r = (Rect)obj; // 다시 다운캐스팅. w자리과 h자리 복원하기 위해.
		
		if((w * h) == (r.w * r.h)) {
			return true; 	// 메인클래스로 true를 돌려보낸다
		} else {
			return false; 	// 메인클래스로 false를 돌려보낸다
		}
	}
}

public class a03RectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect a = new Rect(3, 4);
		Rect b = new Rect(3, 4);
		Rect c = new Rect(4, 5);
		
		if(a == b)
			System.out.println("a==b"); // 면적이 같아도 a와 b는 다른 객체이므로 [[[false]]]
		if(a.equals(b))                  // equals 호출. 주체는 a, obj는 b
			System.out.println("a와 b의 면적이 같으므로 a와 b를 같은 객체로 간주하도록 정한다"); // [[[true]]]
		if(a.equals(c))
			System.out.println("a와 c의 면적이 같으므로 a와 c를 같은 객체로 간주하도록 정한다"); // [[[false]]]

	}

}