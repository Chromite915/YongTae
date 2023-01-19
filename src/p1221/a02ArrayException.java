package p1221;

public class a02ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 배열이 벗어났을때 */
		
		int[] intArray = new int[5];
		intArray[0] = 0;
		try {                         // [[[try]]]
			for(int i=0; i<5; i++) {
				intArray[i+1] = i+1 + intArray[i];
				System.out.println("intArray["+i+"]"+"="+intArray[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {  // [[[catch]]], 예외 발생시 예외에 대한 내용, 배열에 관한 오류만 담당하는 catch임
			System.out.println(e.getMessage());    // e.getMessage
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
		// 다른 유형의 예외도 catch하려면 다른 유형의 catch-Exception문 추가해야함

	}

}
