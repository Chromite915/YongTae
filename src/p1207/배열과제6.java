package p1207;

import java.util.Arrays;

public class 배열과제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 중복된 값들 제거하기
		// 결과 30, 20, 60, 25, 10
		// 제거 외에 새로운 배열을 만들어서 중복되지 않은 값을 넣는법도 있다
		// 새로 만든 배열도 원래 배열 크기만큼 만들어줘야한다
		
		int array3[] = {30, 20, 60, 0, 25, 20, 60, 0, 10, 30};
		int tempArray[] = new int[array3.length];
		int index = 0;
		boolean zeroFlg = true;
		for(int i=0; i<array3.length; i++) {
			boolean flg = false;
			if(array3[i] == 0 && zeroFlg) {
				tempArray[index] = array3[i];
				index++;
				zeroFlg = !zeroFlg;
			}
			for(int j=0; j<tempArray.length; j++) {
				if(array3[i] == tempArray[j]) {
					flg = true;
					break;
				}
			}
			if(!flg) {
				tempArray[index] = array3[i];
				index++;
			}
		}
		int newArray[] = new int[index];
		for(int i=0; i<newArray.length; i++) {
			newArray[i] = tempArray[i];
		}
		System.out.println(Arrays.toString(newArray));
	}
}