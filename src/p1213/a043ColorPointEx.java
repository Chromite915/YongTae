package p1213;

public class a043ColorPointEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a041Point p = new a041Point(); // Point클래스의 점 p 생성
		p.set(1, 2); 
		/* Point 클래스의 메소드 호출*/
		p.showPoint();
		/* Point 클래스의
		 * public void showPoint() { // 점의 좌표 출력
		 * System.out.println("(" + x + "," + y + ")");
		 * 를 호출
		 */
		
		a042ColorPoint cp = new a042ColorPoint(); // ColorPoint클래스의 점 cp 생성
		cp.set(3, 4);
		cp.setColor("red"); // a4ColorPoint의 setColor(); 호출해서 색을 red로 정의
		cp.showColorPoint(); // 자식의 메소드가 부모의 메소드를 포함하고있음

	}

}
// 호출한 메소드가 자체적으로 print문을 갖고있어서, 메인클래스에서 print문이 필요가 없음
