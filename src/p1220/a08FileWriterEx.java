package p1220;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class a08FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자바클래스 내보내기
		
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try { // try란 
			fout = new FileWriter("C:\\Users\\tj-bu-09\\Desktop\\Genshins.txt");
			// 저장할 파일명까지 입력
			while(true) {
				String line = scanner.nextLine(); // 라인별로 입력받는다
				if(line.length() == 0) // 아무것도 안치고 엔터 누르면 break
					break;
				// fout.write(line, 0, line.length()); // 0의 의미는 입력한 내용의 0번째부터 길이만큼 출력한다는 뜻
				fout.write(line, 2, line.length()-2); // 입력한 글자의 인덱스 2번째부터 출력하겠다는 뜻(앞의 2글자는 출력 안함)
				// -2 안붙이면 범위 초과해서 에러난다
				fout.write("\r\n", 0, 2); // 한줄 띄기 위해, 굳이 따지면 \r\n만 있어도 됨
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
		scanner.close();
	}
}
// 콘솔에 내용 입력하고 [[[엔터 두번 치면]]] 파일 생성됨