package p1213;

public class a05Student extends a05person{
	
	void set() { // 메소드
		age = 30;
		name = "홍길동";
		height = 175;
		// weight = 99;   // private라서 몸무게값 불가능
		setWeight(99); // 우회했더니 가능
	}

}
