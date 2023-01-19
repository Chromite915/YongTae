package p1208;

import java.util.Arrays;
import java.util.Scanner;

public class a08예제6개답안 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 카페에 답안 나와있으니, 내가 풀은것과 비교해볼것 */
		
		/* 1-1번 문제 [자력해결]
		 * Scanner클래스를 통해 6개의 공간을 가지는 int형 배열에 값을 입력한다.
		 * 단 0 이하의 숫자를 입력할 경우, 저장하지 않고 1이상의 숫자를 입력하라는 안내문구를 출력하기
		 */
				Scanner s = new Scanner(System.in);
				int array[] = new int[6];
				System.out.println("숫자 6개 입력해주세요. (양수)");
				for(int i=0; i<array.length; i++) {
					int num = s.nextInt();
					if(num <= 0) {
						System.out.println("1이상의 숫자를 입력해 주세요.");
						i--;
					} else {
						array[i] = num;
					}
				}
                // int array[] = {10, 5, 3, 7, 9, 10, 8, 20, 15};
				System.out.println(Arrays.toString(array));
				
				// 1-2번 문제 [자력해결]
				for(int i=0; i<array.length; i++) {
					if(array[i] % 2 == 1) {
						array[i] = -array[i];
					}
				}
				System.out.println(Arrays.toString(array));
				
				/* 1-3, 1-4번 문제 [자력해결]
				 * 배열 내 양수의 평균을 구한다
				 */
				int sum = 0;
				int cnt = 0;
				for(int i=0; i<array.length; i++) {
					if(array[i] > 0) {
						sum += array[i];
						cnt++;
					}
				}
				System.out.println((double)sum/cnt);
				System.out.println(array.length - cnt); // 음수 갯수

				/*1-5번 문제 [자력해결 실패]
				 * 배열 내 수를 재정렬하기
				 * {양, 음, 양, 음, ...} 이런식으로
				 * 순서는 그대로
				 */
				for(int i=1; i<array.length; i++) {
					for(int j=i; j>0; j--) {
						if((array[j] > 0 && array[j-1] < 0) && j % 2 == 1 ) {
							int temp = array[j];
							array[j] = array[j-1];
							array[j-1] = temp;
						}
					}
				}
				System.out.println(Arrays.toString(array));
				
				/*1-6번 문제 [해결 실패]
				 * 배열 내에서 2개의 수의 차가 가장 큰 경우를 구하기.
				 * 단 음수는 절대값을 씌운다.(양수로 바꾼다는 뜻)
				 * ex) 가장 큰 수의 20과 작은 수인 3(-3이면 3으로 규정)을 선정.
				 * 1. 절대값 씌우기
				 * 2. 가장 큰 수와 가장 작은 수 찾기
				 */
				for(int i=0; i<array.length; i++) {
					array[i] = Math.abs(array[i]);   // 절대값 명령어
				}
				Arrays.sort(array);                  // 정렬 명령어
				System.out.println(array[array.length-1] - array[0]); // 이미 정렬했으므로 처음수와 마지막수를 빼주면 됨
				System.out.println("(" + array[array.length-1] + "," + array[0] + ")");
		
	}
}