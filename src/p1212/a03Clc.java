package p1212;

public class a03Clc {
	int x;
	int y;
	String s;
	int a;
	
	public String A3clc(int x, int y, String s) { // 메소드
		if(s.equals("+")) {
			a = x + y;
		} if(s.equals("-")) {
			a = x - y;
		} if(s.equals("*")) {
			a = x * y;
		} if(s.equals("/")) {
			a = x / y;
		} else {
			// return "기호를 다시 확인하시오";
		}
		return ("두 수의 " + s + " 계산 결과는 " + a + " 입니다.");
	//public double getAnswer() {
		
	}

}
