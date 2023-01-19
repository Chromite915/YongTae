package p1213;

public class a042ColorPoint extends a041Point{ // 상속받음

		private String color;
		
		public void setColor(String color) {
			this.color = color;
		}
		public void showColorPoint() { // 자식의 메소드가 부모의 메소드를 포함하고있음
			System.out.print(color);
			showPoint(); // a4Point클래스의 showPoint 호출
		}
}
