package p1205;

import java.util.Arrays;

public class 배열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int list[] = {7, 4, 5, 1, 3};
		
		for(int i=list.length-1; i>0; i--) { 
			for(int j=0; j<i; j++) {         
				if(list[j] > list[j+1]) {
					int temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(list));

	}

}
