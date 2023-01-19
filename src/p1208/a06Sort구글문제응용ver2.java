package p1208;

import java.util.Arrays;

public class a06Sort구글문제응용ver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 홀수와 짝수의 갯수가 같을때
		// 홀수는 오름차순, 짝수는 내림차순
		// 홀->짝->홀->짝 순으로 출력
		
		int array[] = {10, 25, 32, 54, 23, 16, 27, 61};
		Arrays.sort(array);
		int newArray[] = new int[array.length];
		int oIndex = 0; // 홀짝순이니까 oIndex가 0부터 시작
		int eIndex = array.length-1; // 내림차순이라 뒤쪽부터 시작
		for(int i=0; i<array.length; i++) {
			if(array[i] % 2 == 1) {
				newArray[oIndex] = array[i];
				oIndex += 2; // 오름차순이니 ++
			} else {
				newArray[eIndex] = array[i];
				eIndex -= 2; // 내림차순이라 --
			}
		}
		System.out.println(Arrays.toString(newArray));

	}

}
