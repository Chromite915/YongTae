package p1213;

public class a02Order {
	private static final int TRAN_PRICE = 2500;
	private String orderNum;
	private String customerId;
	private String customerName;
	private String orderDate;
	private String orderAddress;
	private int price;
	
	a02Order(){} // 기본 생성자
	
	a02Order(String orderNum, String customerId, String customerName, String orderDate // 조건을 택배가격 빼고 준 생성자
			, String orderAddress , int price)	{
		this.orderNum = orderNum;
		this.customerId = customerId;
		this.customerName = customerName;
		this.orderDate = orderDate;
		this.orderAddress = orderAddress;
		this.price = price;
		// 우회접근
	}
	
	public String toString() {                    // toString은 택배가격까지 전부 출력하도록 만듬 
		String orderInfo = "주문번호 : " + orderNum
							+ "\n주문자 아이디 : " + customerId // \n 기억하기
							+ "\n주문자 이름 : " + customerName
							+ "\n주문 날짜 : " + orderDate
							+ "\n배송 주소 : " + orderAddress
							+ "\n가격 : " + price
							+ "\n택배가격 : " + TRAN_PRICE;
		return orderInfo;
		
		
		// 여기부터 getter setter
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderAddress() {
		return orderAddress;
	}
	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getTranPrice() {
		return TRAN_PRICE;
	}
	
}
