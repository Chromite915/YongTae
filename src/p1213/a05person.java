package p1213;

public class a05person {
	private int weight; // 이 클래스 내에서만 접근 가능
	int age;            // 아무것도 안쓰면 default. 동일패키지 내에서만 접근 가능
	protected int height; // 동일패키지 or 자식클래스만 접근 가능
	public String name;
	
	public void setWeight(int weight) { // pirvate에 접근하기 위한 우회법
		this.weight = weight; 
	}
	public int getWeight() {
		return this.weight;
	}
}
