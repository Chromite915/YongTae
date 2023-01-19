package p1213;

public class a02OrderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a02Order order = new a02Order("202212121234", "test123", "홍길동", "2022.12.12", "인천", 0);
		
		order.setPrice(50000);
		System.out.println(order.toString());
		// toString 하나로 정답양식 다 불러옴
		// 생성자에 택배가격 자리가 없지만, toString 이라서 다 불러와짐
		// 택배가격은 정해주지 않았으므로 부모클래스에서 정의한 2500언 그대로 나옴
	}

}
