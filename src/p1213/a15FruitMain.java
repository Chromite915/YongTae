package p1213;

public class a15FruitMain {
	
	static void FruitSave(a15Fruit fruit) {
		if(fruit instanceof a15Orange) {
			System.out.println("오렌지 박스에 담기");
		} else if(fruit instanceof a15Banana) {
			System.out.println("바나나 박스에 담기");
		} else if(fruit instanceof a15Kiwi) {
			System.out.println("키위 박스에 담기");
		} 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a15Fruit banana = new a15Banana("바나나", "노란색");
		a15Fruit orange = new a15Orange("오렌지", "주황색");
		a15Fruit kiwi = new a15Kiwi("키위", "초록색");
		
		FruitSave(banana);
		FruitSave(orange);
		FruitSave(kiwi);
	}

}
