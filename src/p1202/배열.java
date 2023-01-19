package p1202;

public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [[[객체명은 값 자체가 아닌 값의 주소를 다룬다]]]
		
		int a[] = {3, 5, 10, 13, 17, 20, 23, 25, 30}; // 선언과 동시에 초기화.
		// a라는 배열이 9개의 값을 가지고있음.
		
		System.out.println(a[0]); // a값중 첫번째 값. 인덱스는 0부터 시작하기 때문에
		System.out.println(a[3]); // 4번째 값.
		System.out.println(a[8]); // 9번째 값.
		System.out.println();
		System.out.println("[a배열의 값들 나열]");
		for(int i=0; i<a.length; i++) { // a.length = 배열a의 값들 갯수]]]
			System.out.println(a[i]);
		}
		System.out.println("a값의 전체 갯수 = " + a.length); // a가 가진 값들의 수
	}
        // a[i] = 나열
	    // length = 갯수
}
