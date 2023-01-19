package p1221;

import java.io.File;

public class a11FileEx {
	
	public static void listDirectory(File dir) { // 호출시 dir보냄
		System.out.println("-----" + dir.getPath() +  // getPath로 dir의 경로 나옴
				"의 서브 리스트 입니다.-----");
		File[] subFiles = dir.listFiles(); // 배열에 temp 하위경로에 있는 파일들 리스트를 담는다
		for(int i=0; i<subFiles.length; i++) {
			File f = subFiles[i]; // f에 담는다
			long t = f.lastModified(); // f의 시간정보
			System.out.print(f.getName()); // 이름 출력
			System.out.print("\t파일 크기: " + f.length()); // 파일 크기
			System.out.printf("\t수정한 시간: %tb %td %ta %tT\n",t, // % => 시간 관련
										t, t, t);      // StringFormat
			// 이걸 파일 수만큼 반복
		}
	}

	public static void main(String[] args) {
		
		File f1 = new File("c:\\windows\\system.ini"); // 생성
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + 
								f1.getName()); // 각 get의 의미 파악하기
		String res=""; // 파일 or 디렉토리
		if(f1.isFile()) res = "파일"; // 파일인 경우
		else if(f1.isDirectory()) res = "디렉토리"; // 디렉토리인 경우
		System.out.println(f1.getPath() + "은 " + res + "입니다.");
		//여기까지가 콘솔의 셋째줄
		
		File f2 = new File("c:\\Temp\\java_sample"); // 생성
		if(!f2.exists()) { // 존재하지 않으면
			f2.mkdir(); // mkdir = make diretory
		}
		listDirectory(new File("c:\\Temp")); 
		f2.renameTo(new File("c:\\Temp\\javasample")); // f2에 있는 파일을 javasample로 rename
		listDirectory(new File("c:\\Temp"));
	}
}