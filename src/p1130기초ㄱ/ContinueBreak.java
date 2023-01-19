package p1130기초ㄱ;

public class ContinueBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=10; i++) {
			if(i == 6) {
				break; // 5까지만 출력
				// continue; // 6만 빼겠다
			}
			System.out.println(i);
		}

	}

}
