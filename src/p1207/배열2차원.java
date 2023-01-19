package p1207;

import java.util.Arrays;

public class 배열2차원 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 123
		// 456
		// 789 숫자는 임의로 넣은것
		// array[0][2] -> 3
		// array[1][1] -> 5
		// array[2][0] -> 7
		
		int array[][] = {{0,1,2},{3,4,5}};
		//      [i][j]
		/*
		0 -> 0,0
		1 -> 0,1
		2 -> 0,2
		3 -> 1,0
		4 -> 1,1
		5 -> 1,2
		*/
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.println(array[i][j]);
			}
			
		}
	}
}
