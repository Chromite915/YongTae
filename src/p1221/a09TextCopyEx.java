package p1221;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class a09TextCopyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 마저 완성하기 
		 * 하나씩 읽고 쓰기때문에 글자가 많으면 과부하 걸린다
		 * 이럴때 버퍼를 쓰는것이 효율적*/
		
		File src = new File("C:\\Users\\tj-bu-09\\Desktop\\Genshin.txt");
        File dest = new File("c:\\Temp\\Genshin.txt");
		int c;
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			while((c = fr.read()) != -1) {
				fw.write((char)c);
			}
			fr.close(); fw.close();
			System.out.println(src.getPath()+ "를 " + dest.getPath()+ "로 복사함");
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

}
