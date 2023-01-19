package p1208;

import java.util.Arrays;
import java.util.Random;

public class a04배열구글문제ver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 음수와 양수 합쳐서 n개의 정수를 가진 배열이 있다.
		 * 정렬 후 음수는 앞쪽에, 양수는 뒤쪽에 있어야할것.
		 * 또한 음수끼리, 양수끼리의 순서도 최초와 변함없을것.
		 * 카페 [22.12.08 문제풀이 1]
		 * 정렬 방식
		 */
		int array[] = {-1, 1, 3, -2, 2};
		for(int i=1; i<array.length; i++) {          // array.length-1 횟수만큼 아래를 시행
			for(int j=i; j>0; j--) {                 // ???
				if(array[j] < 0 && array[j-1] > 0) { // [양수 -> 음수] 순서일때
					int temp = array[j];             // j-1 , [[j]]
					array[j] = array[j-1];           // j-1 , [[j-1]]
					array[j-1] = temp;               // [[j]] , j-1
				}
				System.out.println(Arrays.toString(array));
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(array));
	}

}
