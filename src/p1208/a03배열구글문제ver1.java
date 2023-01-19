package p1208;

import java.util.Arrays;
import java.util.Random;

public class a03배열구글문제ver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 음수와 양수 합쳐서 n개의 정수를 가진 배열이 있다.
		 * 정렬 후 음수는 앞쪽에, 양수는 뒤쪽에 있어야할것.
		 * 또한 음수끼리, 양수끼리의 순서도 최초와 변함없을것.
		 * 카페 [22.12.08 문제풀이 1]
		 * 단순삽입방식 -> 새로운 배열에 담는다
		 */
		
		int array[] = {-1, 1, 3, -2, 2};
		int newArray[] = new int[array.length];
		int index = 0;
		for(int i=0; i<array.length; i++) { // array.length횟수(5번)만큼 훑겠다
			if(array[i] < 0) {
				newArray[index] = array[i]; // 음수이면 newArray에 담는다
				index++;   // 아래 ++와 숫자 공유                 
			}
			System.out.println(Arrays.toString(newArray));
		}
		System.out.println();
		for(int i=0; i<array.length; i++) { // array.length횟수(5번)만큼 훑겠다
			if(array[i] > 0) {
				newArray[index] = array[i]; // 음수이면 newArray에 담는다
				index++;
			}
			System.out.println(Arrays.toString(newArray));
		}
		System.out.println();
		System.out.println(Arrays.toString(newArray));
	}

}
