package p1207;

import java.util.Arrays;

public class 배열실습5미완 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 실습4를 반복으로 압축
		
		int array[] = {3,5,2,1,4};
		int minindex = 0;
		
		for(int i=1; i<array.length; i++) {
			for(int j=1; j<array.length; j++) {
				if(array[j] < array[j-1]) {
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));

	}

}
