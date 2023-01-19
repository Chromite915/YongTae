package p1221;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class a13바이너리카피Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long beforeTime = System.currentTimeMillis();                       // 시간측정
		
		File src = new File("C:\\Users\\tj-bu-09\\Downloads\\tumblr_e00bc9639a879a14537d804c975850da_5799cfe8_540.gif"); // 원본
        File dest = new File("c:\\Temp\\copyimg.jpg"); // 여기로 복사할 예정
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+ "를 " + dest.getPath()+ "로 복사하였음");
			long afterTime = System.currentTimeMillis();                   // 시간측정
			double secDiffTime = (double) (afterTime - beforeTime) / 1000; // 시간측정
			System.out.println("시간차이(m) : " + secDiffTime);              // 시간측정
		} catch (IOException e) {
					System.out.println("파일 복사 오류");
		}

	}

}
