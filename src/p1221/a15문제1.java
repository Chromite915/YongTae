package p1221;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class a15문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자바클래스 내보내기
		// write
		
		/* Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;                  // ?
		int c;                                   // ?
		try { // try란 
			fout = new FileWriter("C:/Temp/phone.txt");
			// 저장할 파일명까지 입력
			while(true) {
				String line = scanner.nextLine(); // 라인별로 입력받는다
				if(line.length() == 0) // 아무것도 안치고 엔터 누르면 break
					break;
				fout.write(line, 0, line.length()); // 0의 의미는 입력한 내용의 0번째부터 길이만큼 출력한다는 뜻
				// fout.write(line, 2, line.length()-2); // 입력한 글자의 인덱스 2번째부터 출력하겠다는 뜻(앞의 2글자는 출력 안함)
				// -2 안붙이면 범위 초과해서 에러난다
				fout.write("\r\n", 0, 2); // 한줄 띄기 위해, 굳이 따지면 \r\n만 있어도 됨
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
		scanner.close(); */
		
		Scanner sc = new Scanner(System.in);
		FileWriter fout = null;              // int a=0; 처럼 FileWriter가 fout라는 객체를 정의했는데 그 값이 없다는 뜻.
		System.out.println("전화번호 입력 프로그램");

		int c;
		try {
			fout = new FileWriter("C:\\Temp\\phone.txt"); // fout에 내용물 부여
			while (true) {
				
				System.out.print("이름 전화번호 >> ");
				String line = sc.nextLine();
				if (line.equals("그만"))              // ==연산자는 안되는 이유 : equals는 내용비교, ==는 주소비교
					break;
				fout.write(line);
				fout.write("\r\n"); // 위로 복귀
			}
			fout.close();
			System.out.print("C:\\Temp\\phone.txt에 저장하였습니다.");
		} catch (IOException e) {
			System.out.print("입출력 오류");
		}
		sc.close();
	}
}
