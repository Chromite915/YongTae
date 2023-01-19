package p1216;

public class a05String명령어들 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 과정 폰카에 있음
		
		
		String a = new String(" C#");
		String b = new String(",C++ ");
		// 1
		System.out.println(a + "의 길이는 " + a.length());
		
		// 2
		System.out.println(a.contains("#")); // 포함관계(true, false)
		
		// 3
		a = a.concat(b); // 문자열 연결
		System.out.println(a);
		
		// 4
		a = a.trim(); // 문자열 앞 뒤의 공백 제거
		System.out.println(a);
		
		// 5
		a = a.replace("C#", "Javaaa"); // 문자열 대치
		System.out.println(a);
		
		// 6, 7
		String s[] = a.split(","); // 문자열 분리
		for(int i=0; i<s.length; i++) {
			System.out.println("분리된 문자열" + i + ": " + s[i]);
		}
		
		// 8
		a = a.substring(5); // 인덱스 5부터 끝까지 서브 스트링 리턴(시작과 끝 2개를 지정해줄 수도 있음)
		System.out.println(a);
		
		// 9
		char c = a.charAt(2); // 인덱스2번째의 문자 리턴
		System.out.println(c);
	}
}
