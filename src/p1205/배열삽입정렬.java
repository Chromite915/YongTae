package p1205;

import java.util.Arrays;

public class 배열삽입정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 삽입정렬 : 특정한 데이터가 적절한 위치에 들어가기 이전에, 그 앞까지의 데이터는 이미 정렬되어 있다고 가정한다.
		// 왼쪽방향으로 비교한다
		// 7 [5] 9 0 3 1 6 2 4 8
		// 5 7 9 [0] 3 1 6 2 4 8
		// 5 7 [0] 9 3 1 6 2 4 8
		// 5 [0] 7 9 3 1 6 2 4 8 
		// 0 5 7 9 [3] 1 6 2 4 8
		// 0 5 7 [3] 9 1 6 2 4 8
		// 0 5 [3] 7 9 1 6 2 4 8
		// 0 [3] 5 7 9 1 6 2 4 8
		// 중략
		// 0 1 2 3 4 5 6 7 8 [9]
		// 완성
		
		int []arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8}; // 10개
        
        for(int i=1; i < arr.length; i++){ // 0이 아닌 1부터 시작하는 이유는 앞의것(0번째)이 정렬되어있다고 가정하기 때문
            for(int j=i; j>=1; j--){
                if(arr[j] < arr[j-1]){  // j번째 수가 j의 왼쪽수보다 작으면
                    int tmp = arr[j];   // 교체
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                } else break;  // j번째가 j-1번째보다 크면 패스하고 맨위 for로 복귀
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
