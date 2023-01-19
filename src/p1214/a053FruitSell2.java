package p1214;

public class a053FruitSell2 extends a051Fruit{
	private int price;
	private int num;
	
	a053FruitSell2(String name, String color, int price){
		super(name, color);
		this.price = price;
		this.num = 0;
	}
	public int getNum() {
		return num;
	}
	public void buy(int num) {
		System.out.println(getName() + " " + num + "개 추가.");
		this.num += num;
	}
	public String toString() {
		return getColor() + " 과일 " + getName()+ "를 " + "개당 " + price + "원에 " + num + "개 구매 "
						+ "(총 금액 : " + (price * num )+")";
	}
}
