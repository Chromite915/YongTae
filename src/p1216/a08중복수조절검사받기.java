package p1216;

import java.util.Arrays;
import java.util.Random;

public class a08중복수조절검사받기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자 하나당 2개까지만 중복 가능
		
		Random ra = new Random();
		int lotto[] = new int[10];
		int count = 0;
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = ra.nextInt(8)+1;
			for(int j=i-1; j>=0; j--) {  
				if(lotto[i] == lotto[j]) {
					if(count > 0) {
						i--;
						break;
					} else {
						count++;
					}
				}
			}
			count = 0;
		}
		System.out.println(Arrays.toString(lotto));
	}

}
