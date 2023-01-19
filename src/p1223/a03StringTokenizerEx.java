package p1223;

//""속의 문자를 기준으로 나눔. 문자 여러개 등록 가능

import java.util.StringTokenizer;

public class a03StringTokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("100+200-300*400/500", "+-*/", true);
		while (st.hasMoreTokens()) // hsaMore = 다음순서가 있는지 없는지 파악하라. 없으면
			System.out.println(st.nextToken()); // nextToken = 다음 요소

	}

}
