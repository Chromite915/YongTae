package p1214;

public class a04for문쉽게쓰기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {1, 5, 2, 9, 3};
		
		
		
		// 출력이 번거로우나, 중간 수정이 용이함.
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		// 단순 풀력에 유리함. 중간 수정이 어려움.
		for(int a : array) {
			System.out.println(a);
		}

	}

}
