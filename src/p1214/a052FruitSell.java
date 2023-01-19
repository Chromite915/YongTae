package p1214;

public class a052FruitSell extends a051Fruit{
	private int price;
	private int num;
	// 가격과 갯수 변수 추가
	
	a052FruitSell(String name, String color, int price){	// 이름, 색, 가격은 고정
		super(name, color);						// 이름, 색은 부모의 변수
		System.out.println(name +  "를 판매합니다.");
		this.price = price;
		this.num = 0;									// 갯수는 변화
	}
	public int getNum() {
		return num;
	}
	public void buy(int num) {				// buy메소드로 구매 갯수 증가시키기
		System.out.println(getName() + " " + num + "개 추가.");
		this.num += num;				// 갯수 누적
	}
	public String toString() {
		return getColor() + " 과일 " + getName()+ "를 " + "개당 " + price + "원에 " + num + "개 구매 "
						+ "(총 금액 : " + (price * num )+")";
	}
}
