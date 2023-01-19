package p1221;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class a15문제34 {
	// 카페에 정답 있음

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/* 하나씩 출력해도 되고, */ 
		
		File file = new File("c:\\windows\\system.ini");
		FileReader fr = new FileReader(file);
		
		try {
			int c;
			char array[] = new char[(int) file.length()];
			int i = 0;
			// 3번문제. 대문자
			while ((c = fr.read()) != -1) { 
				array[i++] = (char)c;
			} // fr.read(array);
			String str = new String(array);
			System.out.print(str.toUpperCase());
			
			// 4번 문제. 각 라인 번호
			System.out.println();
			String strArray[] = str.split("\n"); // \n별로 자르겠다
			int sIdex = 1;
			for(String s : strArray) {
				System.out.print(sIdex++ + " : " + s); // 출력하면서 계속 번호를 붙인다
			}
			
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/* FileReader fin = new FileReader("C:/windows/System.ini"); // FileReader는 고유어, fin
		
		int c;
		
		while((c = fin.read()) != -1) { // read는 고유어
			System.out.print((char)c); // 파일을 읽어 소문자를 전부 대문자로 변환하기
		}
		fin.close(); */

	}

}
