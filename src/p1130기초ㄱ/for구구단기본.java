package p1130기초ㄱ;

public class for구구단기본 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int a=2; a<=9; a++) {
			System.out.println(a + "단");
			for(int b=1; b<=10; b++) {
				System.out.println(a + " x " + b + " = " + (a*b));
			}
			System.out.println("");
		} 
	}

}
