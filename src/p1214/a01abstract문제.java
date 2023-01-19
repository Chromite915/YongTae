package p1214;

import java.util.Scanner;

abstract class Converter {                         	// 부모
	abstract protected double convert(double src); 	// convert 메소드
	abstract protected String getSrcString(); 		// src = 원, 킬로미터
	abstract protected String getDestString(); 		// dest = 달러, 마일
	protected double ratio; 						// 비율
	
		public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
		System.out.print(getSrcString()+"을 입력하세요>> ");
		double val = scanner.nextDouble();			// val = 입력값
		double res = convert(val);					// res = 변환값
		System.out.println("변환 결과: " + res + getDestString() + "입니다");
	}
}

class Won2Dollar extends Converter {  // 자식
	Won2Dollar(int ratio) {           // 받는것은 원이 아닌 비율
		super.ratio = ratio;         // 부모클래스의 ratio
	}

	// [[[자동으로 추가한것들]]]
	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src/super.ratio;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "원";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "달러";
	}
}

class Km2Mile extends Converter{
	Km2Mile(double ratio){
		super.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src/super.ratio;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "Km";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "mile";
	}
}




public class a01abstract문제 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
		toDollar.run();
		
		Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6km
		toMile.run();
	}
}