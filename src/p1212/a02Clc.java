package p1212;

public class a02Clc {
	// 카페에 있음
public int c ;
	
	public int sum(int x, int y) { // 수식구역
		return x+y;
	}
	public int sum(int x, int y, int z) {
		return x+y+z;
	}
	public double sum(double x, double y) {
		return x+y;
	}
	
	public String a1ClcMethod(int x, int y, String s) { // 행동구역
		if(s.equals("+")) {
			c = x+y;
		} else if(s.equals("-")) {
			c = x-y;
		} else if(s.equals("*")) {
			c = x*y;
		} else if(s.equals("/")){
			c = x/y;
		} 
		return "두 수의 " + s + " 계산의 결과는 " + c + " 입니다";
	}
}
