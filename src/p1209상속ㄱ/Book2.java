package p1209상속ㄱ;

public class Book2 {
	String title;
	String author;
	int year;
	void show() { System.out.println(title + " " + author); }
	// void show가 뭔데
	
	
	public Book2() {
		this("", "");
		System.out.println("생성자 호출됨");
	}
	
	public Book2(String title) {
		this(title, "작자미상");
	}
	
	public Book2(String title, String author) {
		this.title = "제목종속"; this.author = "작가종속";
	}
	public Book2(String t, String a, int year) {
		this.title = t; 
		this.author = a; 
		this.year = year;
	}

}
