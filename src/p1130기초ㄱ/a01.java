package p1130기초ㄱ;

public class a01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "박용태";
		int age = 30; //21억 이상은 long
		double height = 170.1; // float
		//boolean b = true;
		
		// 내가 한것
		System.out.println("이름은 " + "\"name\"" + ",");
	    System.out.println("나이는 " + age + "키는 " + height + " 입니다.");
	    
	    //정답
	    System.out.println("이름은 " + "\"" + name + "\"," + "\n나이는 " + age + "키는 " + height + " 입니다.");
	    // \는 escape라는 의미
	    // \n(줄바꿈), \", \t(탭 크기만큼 띄어쓰기) 3가지를 가장 많이 씀.
	    
	    // 형변환
	    int a =10;
	    double b = 20.5;
	    b = a; 		// 형변환
	    a = (int) b; 	// 강제 형변환
	    // int로 강제로 변환하는 과정에서 소수점 유실
	    
	    
	    
	    
	    int num1 = 100;
	    int num2 = 50;
	    int num3 = 50;

	}

}
