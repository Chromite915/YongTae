package p1205;

import java.util.Arrays;
import java.util.Scanner;

public class 배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열구성물 수 직접 입력받고 순서도 정해주기
		
		Scanner s = new Scanner(System.in);
		System.out.println("array의 값 갯수를 입력하세요.");
		int n = s.nextInt();
		int array[] = new int[n];
		System.out.println(n + "개");
		// 직접 입력이니 입력할 정수도 따로 직접 입력해줘야
		
		for(int i=0; i<n; i++) {
			array[i] = s.nextInt();
		}
			for(int i=array.length-1; i>0; i--) {  // 정렬을 할수록 필요횟수가 감소하니까
				for(int j=0; j<i; j++) {           // i가 줄어들수록 j도 줄어든다
					if(array[j] > array[j+1]) {
						int temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
					}
				}
			}
			System.out.println(Arrays.toString(array));
	}
}
		

	


