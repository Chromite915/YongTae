package p1208;

public class a07mathmin질문하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1차원의 점들이 주어졌을때, 그 중 가장 거리가 짧은 쌍을 출력하는 함수를 작성하기.
		 * 배열이 {1, 3, 4, 8, 13, 17, 18, 20} 이라면,
		 * 결과값은 (3, 4)와 (17, 18)이 된다.
		 * 카페에 있음
		 */
		int array[] = {1, 3, 4, 8, 13, 17, 18, 20};
		int min = array[array.length-1];
		
		for(int i=1; i<array.length; i++) {
			min = Math.min(min, array[i] - array[i-1]);
		}
		for(int i=1; i<array.length; i++) {
			if(array[i] - array[i-1] == min) {
				System.out.println("(" + array[i-1] + "," + array[i] + ")");
			}
		}

	}

}
