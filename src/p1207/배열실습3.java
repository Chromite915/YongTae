package p1207;

import java.util.Arrays;

public class 배열실습3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 실습2 에서 위치변경을 추가로 수행(한번만 정렬한 상태)
		
		int array[] = {3,5,2,1,4}; // index 0 ~ 4
		int index = 0; // 가장 작은수의 자리
		
		for(int i=1; i<array.length; i++) {
			if(array[i-1] > array[i]) { // i와 i+1로 하면 0번째 수를 계산 못함
				index = i;
			}
		}
		int temp = array[0];
		array[0] = array[index];
		array[index] = temp;
		System.out.println(Arrays.toString(array));

	}

}
