package p1208;

import java.util.Arrays;
import java.util.Scanner;

public class a08예제마지막문제틀림 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 1-1번 문제 [자력해결]
		 * Scanner클래스를 통해 6개의 공간을 가지는 int형 배열에 값을 입력한다.
		 * 단 0 이하의 숫자를 입력할 경우, 저장하지 않고 1이상의 숫자를 입력하라는 안내문구를 출력하기
		 */
		Scanner s = new Scanner(System.in);
		int array[] = new int[6];                                      // 여기서는 구성물 갯수
		System.out.println("배열 array 안에 입력할 숫자(1 이상) 6개를 입력하시오.");
		for(int i=0; i<array.length; i++) {                            // 여기서는 구성물 주소
			array[i] = s.nextInt();
			if(array[i] <= 0) {
				System.out.println("1 이상의 숫자를 입력하세요.");
				i--;
			}
		}
		System.out.println("배열 array의 구성");
		System.out.println(Arrays.toString(array));
		System.out.println();
		
		
		// 1-2번 문제 [자력해결]
		for(int i=0; i<array.length; i++) {
			if(array[i] % 2 == 1) {
				array[i] = -array[i];
			}
		}
		System.out.println("배열값 중 홀수들만 음수로 바꾸면");
		System.out.println(Arrays.toString(array));
		System.out.println();
		
		
		/* 1-3번 문제 [자력해결]
		 * 배열 내 양수의 평균을 구한다
		 */
		int sum = 0;
		int count = 0;
		for(int i=0; i<array.length; i++) {
			if(array[i] > 0) {
				sum += array[i];
				count++;
			}
		}
		System.out.println("배열 내 양수의 합의 평균은");
		System.out.println(sum / count);
		System.out.println();

		
		/*1-4번 문제 [자력해결]
		 * 배열 내 음수의 개수 구하기
		 * 생략
		 */
		
		
		/*1-5번 문제 [자력해결 실패]
		 * 배열 내 수를 재정렬하기
		 * {양, 음, 양, 음, ...} 이런식으로
		 * 순서는 그대로
		 */
		int plusArray[] = new int[array.length];   // 배열 추가
		int minArray[] = new int[array.length];    // 배열 추가
		int index = 0;
		for(int i=0; i<array.length; i++) {        // -> 방향으로 스캔해서
			if(array[i] > 0) {                     // 양수 걸리면
				plusArray[index] = array[i];       // 걸린 숫자 plusArray배열 index++번째에 체우기
				index++;                           // 반복해서 또 양수 나올때마다 plusArray배열의 index++ 자리에 체우기
			}
		}
		int index2 = 0;
		for(int i=0; i<array.length; i++) {        // <- 방향으로 스캔해서
			if(array[i] < 0) {                     // 음수 걸리면
				minArray[index2] = array[i];       // 걸린 숫자 minArray배열 index2++번째에 체우기
				index2++;                          // 반복해서 또 음수 나올때마다 minArray배열의 index2++ 자리에 체우기
			}
		}
		int newArray[] = new int[array.length];    // 배열 추가
		index = 0;
		for(int i=0; i<array.length; i++) {        // -> 방향으로 array번 스캔
			if(plusArray[i] != 0) {                // -> 방향으로 plusArray배열 스캔해서 0이 아닌 수 걸릴때마다
				newArray[index++] = plusArray[i];  // -> 걸린 숫자 newArray배열에  체우기
			}
			if(minArray[i] != 0) {                 // -> 방향으로 minArray배열 스캔해서 0이 아닌 수 걸릴때마다
				newArray[index++] = minArray[i];   // -> 걸린 숫자 newArray배열에  체우기
			}
		}
		System.out.println("배열 내 수를 음, 양, 음, 양 순으로 정렬하면");
		System.out.println(Arrays.toString(newArray));
		System.out.println();

		
		/*1-6번 문제 [해결 실패]
		 * 배열 내에서 2개의 수의 차가 가장 큰 경우를 구하기.
		 * 단 음수는 절대값을 씌운다.(양수로 바꾼다는 뜻)
		 * ex) 가장 큰 수의 20과 작은 수인 3(-3이면 3으로 규정)을 선정.
		 * 1. 절대값 씌우기
		 * 2. 가장 큰 수와 가장 작은 수 찾기
		 */
		int maxnum = 0;
		int minnum = -9999;
		for(int i=1; i<newArray.length; i++) {
			if(newArray[i] < 0) {
				newArray[i] = -(newArray[i]);
				// 절대값까진 잘 나왔는데
			}
		}
		System.out.println("절대값화 후 배열 구성 = " + Arrays.toString(newArray));
		
		for(int i=1; i<newArray.length; i++) {     // 1<5 = 1~4 = 5번
			if(newArray[i] < newArray[i-1]) {
				newArray[i] = minnum;
			}
		}
		for(int i=1; i<newArray.length; i++) {
			if(newArray[i] > newArray[i-1]) {
				newArray[i] = maxnum;
			}
		}
		System.out.println("절대값화 후 배열 내 가장 큰 수 = " + maxnum + ", 가장 작은 수 = " + minnum);
		System.out.println("배열 내 가장 큰 수와 가장 작은 수의 차는");
		System.out.println(maxnum - minnum);
		System.out.println();
	}
}