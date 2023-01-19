package p1228;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class a11여러형식이미지출력 extends JFrame {
	private MyPanel panel = new MyPanel();
	public a11여러형식이미지출력() {
		setTitle("이미지 출력 여러 형식 예제");
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
			
			// g.drawImage(img, 20, 20, this); 
			// 원본 이미지를 20, 20 위치에 원본 크기로 그리기
			// 고정크기
			
			// g.drawImage(img, 20, 20, 100, 100, this); 
			// 원본 이미지를 100x100 크기로 조절하여 그리기
			// 고정크기
			
			// g.drawImage(img, 0, 0, getWidth(),getHeight(), this); 
			// 원본 이미지를 패널에 꽉 차도록 그리기 (JPanel의 크기로 조절하여 그리기)
			// 가변크기
			
			g.drawImage(img, 20, 20, 250, 100, 50, 0, 150, 150, this);
			//              (     JPanel     )(    원본이미지    )
			// 원본 이미지의 50, 0에서 150, 150 사각형 부분을 JPanel의 20, 20에서 250, 100 영역에 그리기
			// 고정크기
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a11여러형식이미지출력();
	}
}
