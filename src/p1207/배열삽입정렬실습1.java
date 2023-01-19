package p1207;

import java.util.Arrays;

public class 배열삽입정렬실습1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
		
		for(int i=1; i<2; i++) {
			if(array[1] < array[0]) {
				int temp = array[0];
				array[0] = array[1];
				array[1] = temp;
			}
		}
		System.out.println(Arrays.toString(array));
				
		for(int i=3; i>0; i--) {                     
			if(array[i] < array[i-1]) {
				int temp = array[i-1];
				array[i-1] = array[i];
				array[i] = temp;
			} 
		}
		System.out.println(Arrays.toString(array));
		
		for(int i=4; i>0; i--) {                     
			if(array[i] < array[i-1]) {
				int temp = array[i-1];
				array[i-1] = array[i];
				array[i] = temp;
			} 
		}
		System.out.println(Arrays.toString(array));
		
		for(int i=5; i>0; i--) {                     
			if(array[i] < array[i-1]) {
				int temp = array[i-1];
				array[i-1] = array[i];
				array[i] = temp;
			} 
		}
		System.out.println(Arrays.toString(array));
		
		for(int i=6; i>0; i--) {                     
			if(array[i] < array[i-1]) {
				int temp = array[i-1];
				array[i-1] = array[i];
				array[i] = temp;
			} 
		}
		System.out.println(Arrays.toString(array));
		
		for(int i=7; i>0; i--) {                     
			if(array[i] < array[i-1]) {
				int temp = array[i-1];
				array[i-1] = array[i];
				array[i] = temp;
			} 
		}
		System.out.println(Arrays.toString(array));
		
		for(int i=8; i>0; i--) {                     
			if(array[i] < array[i-1]) {
				int temp = array[i-1];
				array[i-1] = array[i];
				array[i] = temp;
			} 
		}
		System.out.println(Arrays.toString(array));
		
		for(int i=9; i>0; i--) {                     // i=9; 는 i=array.length-1; 과 같다
			if(array[i] < array[i-1]) {
				int temp = array[i-1];
				array[i-1] = array[i];
				array[i] = temp;
			} 
		}
		System.out.println(Arrays.toString(array));
	}
}
