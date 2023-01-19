package p1216;

import java.util.Arrays;
import java.util.Random;

public class a08답안 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자 하나당 2개까지만 중복 가능
		
		Random ra = new Random();
		int lotto[] = new int[10];
		System.out.print("번호는 ");
		int array[] = new int[10];
		int cnt = 0;
		for(int i=0; i<array.length; i++){
			array[i] = (int)(Math.random()*10 + 1);
			for(int j=i-1; j>=0 ; j--) { 
				if(array[j] == array[i]) {
					if(cnt > 0) {
						i--;
						break;
					} else {cnt++;}
				} 
			}
			cnt = 0;
		}
		System.out.println(Arrays.toString(array)); 
	}

}
