package p1207;

import java.util.Arrays;

public class 배열버블정렬2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {7, 4, 5, 1, 3};
		for(int j=array.length-1; j>0; j--) { // 
			for(int i=1; i<=j; i++) {         // 
				if(array[i-1] > array[i]) {
					int temp = array[i];      //
					array[i] = array[i-1];    //
					array[i-1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}

}
