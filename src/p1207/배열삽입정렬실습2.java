package p1207;

import java.util.Arrays;

public class 배열삽입정렬실습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 실습1 전체를 반복문으로 짧게 압축한것
		
		int array[] = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
		
		for(int j=1; j<array.length; j++) { // 첫번째것 고정, length-1 아님
			for(int i=j; i>0; i--) {
				if(array[i] < array[i-1]) {
					int temp = array[i-1];
					array[i-1] = array[i];
					array[i] = temp;
				}
			}
			System.out.println(Arrays.toString(array));
		}
		

	}

}
