package p1216;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class a07Math클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = Math.PI;
		
		System.out.println("PI(원주율) = " + Math.PI);
		System.out.println("원주율 ceil(올림) = " + Math.ceil(a)); // 올림
		System.out.println("원주율 floor(내림) = " + Math.floor(a)); // 내림
		System.out.println("sqrt(9) (9의 제곱근) = " + Math.sqrt(9)); // 9의 제곱근
		System.out.println("exp(2) (Math.E의 2승) = " + Math.exp(2)); // e(euler)의 2승
		System.out.println("pow(2,3) (2의 3승) = " + Math.pow(2, 3)); // 2의 3승
		System.out.println("round(3.14) (3.14의 반올림) = " + Math.round(3.14)); // 반올림
		
		// [1, 45] 사이의 정수형 난수 5개 발생
		System.out.println();
		System.out.println("이번주 행운의 번호는 ");
		Random ra = new Random();
		int lotto[] = new int[5];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = ra.nextInt(45)+1;
			for(int j=0; j<i; j++) {        // 뽑힌 수 안에서만 비교하면 되므로 j<i
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
	}

}
