package p1212;

public class a05카페ArrayTest {
	// 카페에 있음
	
	/* 메소드 호출시 레퍼런스(객체)를 보내는 경우와, 일반 데이터타입을 보내는 경우의 차이. -> 일반 객체 + 배열의 특징 이해.
	 * static메소드, 변수의 특징 ( static은 final과 자주 함께 쓰인다.)
	 */
	
	static int one = 1200; // static = one을 모든 개체가 공유한다.(가족중 누군가가 차를 고장내면 다른 가족이 타도 고장난 차이다.)
	// static final 로 고치면, one은 절대 고칠 수 없는 상태가 됨.
	int two = 1200;
	
	static void increase(int[] array) {
		for(int i=0; i<array.length; i++) {
			array[i]++;
		}
	}
}