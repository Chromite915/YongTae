package p1221;

import java.io.FileInputStream;
import java.io.IOException;

public class a06번역 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// FileInputStreamEx
		// a05에서 만든걸 읽기
		
		byte b[] = new byte [6];
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\tj-bu-09\\Desktop\\Genshinss.txt");
			int n = 0, c;
			while((c = fin.read()) != -1) {
				b[n] = (byte)c; // 음수를 input해도 양수형태로 저장되기에 음수로 출력하도록 형변환 한것
				n++;
			}
			System.out.println("C:\\Users\\tj-bu-09\\Desktop\\Genshinss.txt 에서 읽은 배열을 출력");
			for(int i=0; i<b.length; i++) System.out.print(b[i] + " ");
			System.out.println();
			fin.close();
		} catch(IOException e) {
			System.out.println("C:\\Users\\tj-bu-09\\Desktop\\Genshinss.txt 에서 읽지 못함. 경로명을 다시 체크하시오.");
		}

	}

}
