package p1213;

		public class a063SuperEX {
			
			public static void main(String[] args) {
				a062ColorPoint cp1 = new a062ColorPoint(5, 6, "blue");
				cp1.showColorPoint();
				
				// Point p = new Point();
				a062ColorPoint cp2 = new a062ColorPoint(5, 6, 7);
				// 자식클래스에서 부모클래스는 무조건 기본 생성자이나, super을 붙이면 부모클래스의 생성자를 지정 가능
				// 호출은 자식-부모 순. 출력은 부모-자식 순.
			}

		}
		

