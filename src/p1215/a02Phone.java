package p1215;

public class a02Phone {
	private String name;
	private int buyNum;
	private int price;
	
	// 이건 메인에서 new 생성하자 자동으로 만들어진거
	a02Phone(String name, int buyNum, int price){ // buyNum이 buyName로 오타 났었음
		this.name = name;
		this.buyNum = buyNum;
		this.price = price;
		
		
	}
	public int buy(int num) {
		this.buyNum += num;		// 구매량 누적 메소드
		return this.buyNum;
	}
	
	// 밑에는 getter setter로 만든것
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBuyNum() {
		return buyNum;
	}

	public void setBuyNum(int buyNum) {
		this.buyNum = buyNum;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


}
