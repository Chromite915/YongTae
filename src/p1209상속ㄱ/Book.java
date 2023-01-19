package p1209상속ㄱ;

public class Book {
	String title = "제목몰라";
	String author = "작가몰라"; // 아무것도 안쓰면 아무것도 안나옴
	int year; // 아무것도 안쓰면 0으로 나옴
	
	public Book() {
		this("", "", 0); // this 괄호 안이 3개라 맨 밑에 매개변수 3개짜리 생성자가 호출됨
	}
	
	public Book(String t) {
		// this(t, "작가갱신"); // this()는 무조건 첫줄이어야함
		this.title = t; 
	}
	public Book(String t, String a) {
		// this("원신", "작가갱신갱신");
		this.title = t; 
		this.author = a;
		this.year = year;
	}
	public Book(String t, String a, int year) {
		this.title = "제목갱신"; 
		this.author = "작가갱신"; 
		this.year = 2020;
	}

}
