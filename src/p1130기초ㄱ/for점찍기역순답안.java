package p1130기초ㄱ;

public class for점찍기역순답안 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 점찍기문제의 답안
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) { 
				if(j<=5-i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
					// 만족하면 공백, 불만족하면 else로 가서 * 를 반복하면 아래 답이 나옴
				}
			}
			System.out.println("");
		}
	}	
}