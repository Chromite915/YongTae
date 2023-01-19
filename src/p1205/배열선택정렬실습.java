package p1205;

import java.util.Arrays;

public class 배열선택정렬실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 우측으로 탐색하면서 찾은 [[[가장 작은 숫자]]] 를 가장 왼쪽 수와 교환
		// 제일 왼쪽으로 정렬한 수는 더이상 건드리지않음(-1)
		// 한번만 실행 -> 여러번 실행으로 바꾼것
		
		int array[] = {3, 5, 2, 1, 4};
		int minindex = 0;
		
		for(int j=0; j<array.length; j++) { // [[[횟수가 아니라, 자리 비교]]]
			minindex = j;
			
			for(int i=j+1; i<array.length; i++) { // index가 오른쪽으로 갈수록 우측은 좁아진다
				if(array[minindex] > array[i]) {
					minindex = i; // 여기가 다 끝나야 밑에 교환으로 내려간다
					// 스캔이 다 끝난 후 교환한다는 뜻(전체중 단 한개의 숫자를 찾겠다는 뜻)
						
				}
			}
			int temp = array[j]; 
			array[j] = array[minindex];
			array[minindex] = temp;
		}
		System.out.println(Arrays.toString(array));
	}
}
