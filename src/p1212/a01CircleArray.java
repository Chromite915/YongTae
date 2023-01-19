package p1212;


public class a01CircleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		a01Circle[] array = new a01Circle[5];  // 배열 생성
		for(int i=0; i<5; i++) {
			array[i] = new a01Circle(i);      // 각 원 생성, radius 생성
		}
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i].getArea()); // getArea메소드 호출
		}
	}

}

