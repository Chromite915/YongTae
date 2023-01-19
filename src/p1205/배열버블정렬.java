package p1205;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 배열버블정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 버블정렬 : 계속 옮겨가면서 정렬
		// 숫자 len개 입력하면, 자동으로 순서 정렬
		// 가장 큰 수를 오른쪽으로 보내기
		
		Scanner s = new Scanner(System.in);
		System.out.println("개수를 선택해주세요.");
		int len = s.nextInt();
		System.out.println("숫자를"+ len + "개 입력해주세요.");
		int array[] = new int[len];           // array의 변수 갯수는 len개
		
		for(int i=0; i<len; i++) {
		array[i] = s.nextInt();               // array의 구성물을 직접 입력해준다
		}
		
		for(int i=array.length-1; i>0; i--) { // 정렬은 우측부터
			for(int j=0; j<i; j++) {          // 스캔은 좌측부터
				if(array[j] > array[j+1]) {   // 왼쪽이 오른쪽보다 크면
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;        // 교환하고 다시 스캔
				}
			}
		} 
		System.out.println(Arrays.toString(array)); // 정렬한 array 구성물들을 출력
	}
}