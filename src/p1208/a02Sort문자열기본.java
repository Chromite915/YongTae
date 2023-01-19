package p1208;

import java.util.Arrays;

public class a02Sort문자열기본 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[] = {"Orange", "Apple", "Banna", "Watermelon", "Kiwi"};
		Arrays.sort(array);
		System.out.println("단어의 첫자 알파벳 순으로 정렬 = " + Arrays.toString(array)); // 첫글자 알파벳 순서로 정렬
		System.out.println("해당번째 단어의 알파벳 수 = " + array[2].length()); // => 4(Kiwi의 글자수는 4개)
		
		//글자수 순서로 오름차순 정렬하기
		/*내가 한것
		 for(int i=1; i<=array.length; i++) {
			for(int j=1; j<i; j++) {
				if(array[j].length() < array[j-1].length()) {
					int tmep = array[j].length();
					array[j].length() = array[j-1].length();
					array[j].length() = temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(array));
		내가 한것*/
		
		// 답
		for(int i=1; i<array.length; i++) {
			for(int j=i; j>0; j--) {
				if(array[j].length() < array[j-1].length()) {
					String temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
		System.out.print("단어의 알파벳 수 순으로 정렬 = ");
		System.out.println(Arrays.toString(array));
	}

}
