package p230104;

public class a07상속의개념 {
	/* 스윙의 페이늩 메터니즘
	 * 자신을 그리는것은 페인트 컴포넌트
	 * paintComponent() -> paintBorder() -> paintChildren()
	 * 자식들을 그리는것은 paintChildren()
	 * 칠드런시 자식패널의 paint() 호출(자식패널의 컴포 -> 보더 -> 칠드런 또 반복)
	 * 폰카 그림 참조
	 * 
	 * extends
	 * 부모에서 선언 / 정의를 모두하며 자식은 메소드 / 변수를 그대로 사용할 수 있음
	 * 
	 * implements (interface 구현)
     * 부모 객체는 선언만 하며, 정의(내용)은 자식에서 오버라이딩 (재정의) 해서 사용해야함
     * 자바는 다중상속이 안되지만 그 대용
     * 
     * abstract
     * extends와 interface 혼합. extends하되 몇 개는 추상 메소드로 구현되어 있음
     * 
     * extends는 일반 클래스와 abstract 클래스 상속에 사용되고, implement는 interface 상속에 사용된다.
     * 
	 */

}
