package p1221;

import java.io.*;
import java.util.Scanner;

public class a08BufferedIOEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("C:\\Users\\tj-bu-09\\Desktop\\Genshin.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5); // 버퍼가 5개 찰때마다 출력
			while((c = fin.read()) != -1) {
				System.out.print((char)c); // 버퍼가 어느시점에 출력되는지 확이나기 위해 넣은 줄
				out.write(c); // 버퍼가 꽉 찰때 문자가 화면에 출력
			}
			// 파일 데이터가 모두 출력된 상태
			new Scanner(System.in).nextLine();
			out.flush(); // 버퍼에 남아있던 문자 모두 출력
			fin.close();
			out.close();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
