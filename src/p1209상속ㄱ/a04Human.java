package p1209상속ㄱ;

	/* 1. Human클래스 생성
	 * 1-1. 이름, 나이, 주소, 폰번호 담는 변수 생성
	 * 1-2. toString메소드 생성. 호출하면 "이름은 ???, 주소는 ???, 핸드폰번호는 ??? 입니다." 출력하게
	 * 1-3. 생성자를 통해 1~4개의 값을 받았을때 처리할수 있도록 수정
	 * 매개변수 1개를 받는 생성자 => 이름만 받고 폰번호, 주소는 "알수없음" 으로 저장
	 * 매개변수 2개를 받는 생성자 => 이름, 주소만 받고 폰번호는 "알수없음"
	 * 매개변수 3개를 받는 생성자 => 이름, 주소, 폰번호를 받아서 저장
	 * 매개변수 4개를 받는 생성자 => 이름, 주소, 폰번호, 나이를 받아서 저장
	 * 2. 메인메소드에서 Human 객체 생성, 생성시 매개변수 1~4개를 넣어보기(4개의 객체 생성)
	 * 3. 아무 객체에서나 toString 메소드 호출
	 * 4. System.out.println(객체이름)도 해보기 -> toString 메소드 호출한것과 같은 결과 나옴(toString이 자동으로 생략됨) -> [[[오버라이딩]]]
	 * Human도 HumanMain도 결국 다 toString을 물려받았을 뿐이다 -> 그래서 Human에서 toString을 지워도 Main에서 생략이 가능한것
	 * 카페에 있음
	 */
	
	public class a04Human {
		String name;
		String address;
		String phone;
		int age;
		
		public String toString() {
			return "이름은 " + name + ", 주소는 " + address + ", 핸드폰번호는 " + phone +" 입니다.";
			// 어떤 생성자로 출력하든 이 기본생성자의 문구는 꼭 나옴
		} 
		
		public a04Human(String name) {
			this(name, "알수없음", "알수없음");	// 괄호속이 3개라, 변수 3개짜리 생성자 호출
		}
		public a04Human(String name, String address) {
			this.name = name;
			this.address = address;
		}
		public a04Human(String name, String address, String phone) {
			this.name = "name무시하기";
			this.address = "address무시하기";
			this.phone = "phone무시하기";
		}
		public a04Human(String name, String address, String phone, int age) {
			this.name = name;
			this.address = address;
			this.phone = phone;
			this.age = age;
		}
}
	
	/*String name;
	String address;
	String phonenum; // 폰번호는 0으로 시작하고, 중간에 -도 넣기때문에 문자열로 처리하는 경우가 많다
	int age;
	
	public Human(String name) {
		this(name, "알수없음, "알수없음");
	
	
	
	public Human(String name, String address, Sring phonenum, int age) {
		this.name = name;
		this.phonenum = phonenum;
		this.address = address;
		this.age = age
		// System.out.println("이름은 " + name + ", " +  "주소는 " + address + ", " +  "핸드폰번호는 " + phonenum + " 입니다.");*/
