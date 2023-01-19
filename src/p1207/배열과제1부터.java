package p1207;

import java.util.Arrays;

public class 배열과제1부터 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {30, 20, 50, 15, 25};
		if(array[2] % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		//
		
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		System.out.println(sum/array.length);
		
		
		int max = 0;
		int min = 9999;
		for(int i=0; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
			if(min > array[i]) {
				min = array[i];
			}
		}
		System.out.println(max);
		System.out.println(min);

	}

}
