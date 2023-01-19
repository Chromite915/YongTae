package p1130기초ㄱ;

public class for점찍기역순내가푼것 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int a=1; a<=5; a++) {
			for(int b=4; b>=a; b--) {
				System.out.print(" ");
			} for(int c=1; c<=a; c++) { // 변수 수정하면 역순으로도 점 찍을 수 있음
				System.out.print("*");
			}
			System.out.println("");
		}
	}	
}
// for를 너무 많이 쓰면 퍼포먼스에 문제가 생길 수도 있어서 비추천