package p1213;

public class a132추상메소드구체화 extends a131추상메소드{
	// 추상메소드를 구체화함

	// [[[a13MiniCalc 단어 위에 마우스 올려서 만들음]]]
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum / a.length; // 배열a의 평균
	}

}
