package p1207;

public class 배열과제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 갯수만큼 * 찍기
		// ***
		// *****
		// **
		// *****
		// *
		
		int array2[] = {3,5,2,5,1};
		for(int i=0; i<array2.length; i++) {
			for(int j=1; j<=array2[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
