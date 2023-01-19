package p1208;

import java.util.Arrays;

public class a05Sort구글문제응용ver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 홀수는 오름차순, 짝수는 내림차순
		 * 홀->짝->홀->짝 순으로 출력
		 * {23, 54, 25, 32, 27, 16, 61, 10}
		 * 카페에 있음
		 */
		
		//답안 ver1
		int array[] = {10, 25, 32, 54, 23, 16, 27, 61}; // 첫 배열
		int oddArray[] = new int[array.length];     // 배열 추가
		int evenArray[] = new int[array.length];    // 배열 추가
		Arrays.sort(array);                         // 자동 정렬
		int index = 0;
		for(int i=0; i<array.length; i++) {         // -> 방향으로 스캔해서
			if(array[i] % 2 == 1) {                 // 홀수 걸리면
				oddArray[index] = array[i];         // 걸린 숫자 oddArray배열에 체우기
				index++;                            // 반복해서 또 홀수 나올때마다 oddArray배열의 다음 다리에 체우기
				System.out.println("오드어레이 " + Arrays.toString(oddArray));
			}
		}
		int index2 = 0;
		for(int i=array.length-1; i>=0; i--) {      // <- 방향으로 스캔해서(짝수는 내림차순으로 하라고 했으니까)
			if(array[i] % 2 == 0) {                 // 짝수 걸리면
				evenArray[index2] = array[i];       // 걸린 숫자 evenArray배열에 체우기
				index2++;                           // 반복해서 또 짝수 나올때마다 evenArray배열의 다음 자리에 체우기
				System.out.println("이븐어레이 " + Arrays.toString(evenArray));
			}
		}
		int newArray[] = new int[array.length];     // 배열 추가
		index = 0;
		for(int i=0; i<array.length; i++) {         // -> 방향으로 array번 스캔
			if(oddArray[i] != 0) {                  // -> 방향으로 oddArray배열 스캔해서 0이 아닌 수 걸릴때마다
				newArray[index++] = oddArray[i];
				System.out.println("오드-뉴어레이 과정 " + Arrays.toString(newArray));
			}
			if(evenArray[i] != 0) {                 // -> 방향으로 evenArray배열 스캔해서 0이 아닌 수 걸릴때마다
				newArray[index++] = evenArray[i];   
				System.out.println("이븐-뉴어레이 과정 " + Arrays.toString(newArray));
			}
		}
		System.out.println();
		System.out.println("최종값 " + Arrays.toString(newArray));
		
	}
}