package p1209상속ㄱ;

public class a04HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		a04Human lee = new a04Human("");
		a04Human hong = new a04Human("홍길동");
		a04Human yu = new a04Human("유재석", "인천");
		a04Human kang = new a04Human("강호동", "서울", "010-1234-5678"); // this(3개짜리) 때문에 lee, hong, yu의 변수는 전부 kang의 변수로 귀속되었다.
		a04Human park = new a04Human("박명수", "부산", "010-9876-4321", 50);
		
		System.out.println(lee); // System.out.println(park.toString());
		System.out.println(hong);
		System.out.println(yu);
		System.out.println(kang);
		System.out.println(park);

	}

}
