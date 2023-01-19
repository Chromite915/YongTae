package p1220;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class a06FileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// C:\Users\tj-bu-09\Desktop
		
		// FileReader fin = new FileReader("C:\\Users\\tj-bu-09\\Desktop\\Genshin.txt");
		FileReader fin = new FileReader("C:/windows/system.ini");
		// 경로 지정시 \\는 /로 대체 가능
		
		int c;
		
		while((c = fin.read()) != -1) { // 파일 끝까지 바이트씩 c에 읽어들임. 계속 읽다가 -1이 리턴되면
			System.out.print((char)c); // 바이트 c를 문자로 변환하여 화면에 출력
		}
		fin.close(); // 스트림을 닫음. 파일도 닫힘.

	}

}
