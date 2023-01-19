package p1222스윙ㄱ;

import javax.swing.JFrame;

public class a01MyFrame extends JFrame { // JFrame도 생성자가 존재한다
	public a01MyFrame() {
		setTitle("300x300 스윙 프레임 만들기"); // 제목
		setSize(300,300); // 프레임 크기
		setVisible(true); // 프레임 출력
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a01MyFrame frame = new a01MyFrame(); // 창 하나
		a01MyFrame frame2 = new a01MyFrame(); // 창 둘

	}

}
// 만든 창 안에도 객체단위로 넣는다
