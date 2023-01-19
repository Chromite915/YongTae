package p1205;

public class 배열MinIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가장 작은 index의 자리를 찾기
		
		int array[] = {3,5,2,1,4}; // index 0 ~ 4
		int minindex = 0; // 가장 작은수의 자리
		
		for(int i=1; i<array.length; i++) {
			if(array[i-1] > array[i]) { // i와 i+1로 하면 범위를 벗어난다. i가 1부터 시작했으니까
				minindex = i; // 
			} else {
				minindex = i-1; // 크지 않으면 minindex 변경x
			}
		}
		System.out.println("(전체 0번째~4번째)" + minindex + "번째 값인 " + array[minindex] + "이 최소값");

	}

}
