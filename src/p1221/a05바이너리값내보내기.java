package p1221;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class a05바이너리값내보내기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream fout = new FileOutputStream("C:\\Users\\tj-bu-09\\Desktop\\Genshinss.txt");
		
		byte b[] = {7,51,3,4,-1,24};
		for(int i=0; i<b.length; i++)
			fout.write(b[i]);
		
		fout.close();
		
		// Genshinss를 열었을때 아무 내용도 없으면 비정상, 알 수 없는 내용이 있으면 정상

	}

}
