package p1130기초ㄱ;

public class for구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for 안에 또 다른 for, 구구단
		// 스스로 작성할 수 있을것
		
		for(int i=2; i<=9; i++) { // 할당과 반복
			if(i == 6) {
				// break; 6이 되는순간 빠져나가겠다
				continue; //6만 빼겠다
			}
			System.out.println(i + "단");
			for(int j=1; j<=9; j++) { // 할당과 반복
				System.out.println(i + " * " + j + " = " + i*j); 
			}
			System.out.println();
		}
	}
}