package p1215;

import java.util.Scanner;

// 책 2권을 담는 배열을 만들고, 2권의 제목과 저자를 입력하고, 출력

class Book{
	String title, author;
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class a01BookArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book[] book = new Book[2];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<book.length; i++){
			System.out.println("제목>>");
			String title = scanner.nextLine();
			System.out.println("저자>>");
			String author = scanner.nextLine();
			book[i] = new Book(title, author); // 배열의 내용물에 구체적인 내용 부여
		}
		for(Book b : book) { // 신 양식
			System.out.println("(" + b.title + ", " + b.author + ")");
		}

	}

}
