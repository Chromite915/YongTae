package p1220;

public class a03GenericMethodExample {
	// 폰카에 있음
	// Stack임에도 출력을 정순으로 하려는것
	// T가 타입 매개변수인 제너릭 메소드
	public static <T> a03GStack<T> reverse(a03GStack<T> a) { // G스택 객체로 받아서 리턴도 G스택으로
		a03GStack<T> s = new a03GStack<T>(); // 뒤에 더블이라 다 더블
			while(true) {
				T tmp;
				tmp = a.pop(); // 원래 스택에서 요소 하나를 꺼냄, 4.0, 팝했으니 3.0, 2.0, 1.0, 0
				if(tmp == null) // 스택이 비었음, 4는 널이 아니니까 / 널이면 빠져나감
						break;
					else
						s.push(tmp); // 널이 아니니까 새 스택에 요소를 삽입, s에 있는건 4.0, 3.0, 2.0, 1.0 
			}
			return s; // 새 스택을 반환
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Double 타입의 GStack 생성
		a03GStack<Double> gs = new a03GStack<Double>();
		
		// 5개의 요소를 스택에 push
		for(int i=0; i<5; i++){
			gs.push(new Double(i)); // 0.0, 1.0, 2.0, 3.0, 4.0 // 더블에 줄이 쳐지는 이유:자동박싱언박싱
		}
		gs = reverse(gs); // 리버스, tos값은 5인 상태로 들어가있다, 리턴 결과를 go로 정의한다
		for(int i=0; i<5; i++) {
			System.out.println(gs.pop()); // 역순으로 pop
			
		}

	}

}
