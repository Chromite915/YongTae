package p1228;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class a11이미지출력위치지정 extends JFrame {
	private MyPanel panel = new MyPanel();
	public a11이미지출력위치지정() {
		setTitle("원본크기로 원하는 위치에 이미지 그리기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 420);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image.jpg");
		private Image img = icon.getImage(); // 이미지 객체
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 20, 20, this);
			// 20, 20의 위치에 출력하기
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a11이미지출력위치지정();
	}
}
