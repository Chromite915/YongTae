
package p1221;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class a15문제2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// read
		
		File f = new File("C:\\Temp\\phone.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br1 = new BufferedReader(fr);
		System.out.println("C:\\Temp\\phone.txt를 출력합니다.");

		while (true) {
			String s = br1.readLine();
			if (s == null)
				break;
			System.out.println(s);
		}
		
		/* FileReader fin = new FileReader("C:\\Users\\tj-bu-09\\Desktop\\Genshin.txt");
		FileReader fin = new FileReader("C:/Temp/phone.txt");
		// 경로 지정시 \\는 /로 대체 가능
		
		int c;
		
		while((c = fin.read()) != -1) { // 파일 끝까지 바이트씩 c에 읽어들임. 계속 읽다가 -1이 리턴되면
			System.out.print((char)c); // 바이트 c를 문자로 변환하여 화면에 출력
		}
		fin.close(); // 스트림을 닫음. 파일도 닫힘. */

	}

}
