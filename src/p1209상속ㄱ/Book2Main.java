package p1209상속ㄱ;

public class Book2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book2 littleprince = new Book2("어린왕자", "생텍쥐페리");
		Book2 lovestory = new Book2("춘향전");
		Book2 Genshin = new Book2("Genshin_Impact", "HoYo", 2020);
		Book2 Genshins = new Book2(); // 클래스에 기본생성자(괄호속이 공백인) 없으면 출력 못함
		
		System.out.println(littleprince.title + " " + littleprince.author);
		System.out.println(lovestory.title + " " + lovestory.author + " " + lovestory.year);
		System.out.println(Genshin.title + " " + Genshin.author + " " + Genshin.year);
		System.out.println(Genshins.title + ", " + Genshins.author + ", " + Genshins.year);

	}

}
