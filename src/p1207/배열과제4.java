package p1207;

import java.util.Arrays;

public class 배열과제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 오름차순으로 정렬
		
		int array[] = {30, 20, 50, 15, 25};
		
		for(int i=array.length-1; i>=0; i--) {
			for(int j=1; j<=i; j++) {
				if(array[j-1] > array[j]) {
					int temp = array[j]; 
					array[j] = array[j-1]; 
					array[j-1] = temp;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(array));
		
	}
}