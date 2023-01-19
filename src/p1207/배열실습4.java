package p1207;

import java.util.Arrays;

public class 배열실습4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 실습3에서 추가 작업
		
		int array[] = {3,5,2,1,4}; // index 0 ~ 4
		int index = 0; // 가장 작은수의 자리
		
		for(int i=1; i<array.length; i++) {
			if(array[i-1] > array[i]) { // i와 i+1로 하면 범위를 벗어난다. i가 1부터 시작했으니까
				index = i;
			}
		}
		int temp = array[0];
		array[0] = array[index];
		array[index] = temp;
		System.out.println(Arrays.toString(array));
		// 1, 5, 2, 3, 4
		
		
		index = 1; // 변경
		for(int i=2; i<array.length; i++) { // 변경
			if(array[i-1] > array[i]) { 
				index = i;
			}
		}
		temp = array[1]; // 변경
		array[1] = array[index]; // 변경
		array[index] = temp;
		System.out.println(Arrays.toString(array));
		// 1, 2, 5, 3, 4
		
		
		index = 2; // 
		for(int i=3; i<array.length; i++) { // 
			if(array[i-1] > array[i]) { 
				index = i;
			}
		}
		temp = array[2]; // 
		array[2] = array[index]; // 
		array[index] = temp;
		System.out.println(Arrays.toString(array));
		// 1, 2, 3, 5, 4

	}

}
