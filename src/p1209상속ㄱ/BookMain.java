package p1209상속ㄱ;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book Genshins = new Book();
		Book lovestory = new Book("이건메인거");
		Book littleprince = new Book("2", "3");
		Book Genshin = new Book("4", "5", 6);
		
		System.out.println(Genshins.title + ", " + Genshins.author + ", " + Genshins.year);
		System.out.println(lovestory.title + ", " + lovestory.author);
		System.out.println(littleprince.title + ", " + littleprince.author + ", " + littleprince.year);
		System.out.println(Genshin.title + ", " + Genshin.author + ", " + Genshin.year);

	}

}
