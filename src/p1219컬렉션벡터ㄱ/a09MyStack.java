package p1219컬렉션벡터ㄱ;
// [스택 = LIFO] 라는 개념을 염두하고 보자.
// 스택을 제너릭 클래스로 작성하고, String과 Integer형 스택을 사용하는 예를 보여라

class GStack<T> {
	int tos;
	Object [] stck;
	public GStack() {
		tos = 0; // tos는 인덱스를 의미한다(현재 데이터의 위치)
		stck = new Object [10];
	}
	public void push(T item) {
		if(tos == 5)
			return;
		stck[tos] = item;
		tos++;
	}
	public T pop() {
		if(tos == 0)
			return null;
		tos--; // 빼고
		return (T)stck[tos]; // 리턴, T가 붙는 이유는
	}
}
public class a09MyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GStack<String> stringStack = new GStack<String>(); // 지명이 차곡차곡 쌓인다
		stringStack.push("seoul"); // 5
		stringStack.push("busan"); // 4
		stringStack.push("LA");    // 3
		stringStack.push("tokyo"); // 2
		stringStack.push("pari");  // 1  // 이 밑으로 출력 안됨(tos==5 시 return; 때문에?)
		stringStack.push("london"); // 0, null
		stringStack.push("osaka");  // null
		stringStack.push("incheon"); // null
		stringStack.push("newyork"); // null
		
		for(int n=0; n<9; n++)
			System.out.println(stringStack.pop());
		
		GStack<Integer> intStack = new GStack<Integer>();
		intStack.push(1); // 5
		intStack.push(3); // 4		
		intStack.push(5); // 3
		intStack.push(7); // 2
		intStack.push(9); // 1          // 이 밑으로 출력 안됨(tos==5 시 return; 때문에?)
		intStack.push(11); // 0, null          
		intStack.push(13); // null
		intStack.push(15); // null
		intStack.push(17); // null
		
		for(int n=0; n<9; n++)
			System.out.println(intStack.pop()); // Integer와 String 둘 다 역순으로 출력된다
	}
}
