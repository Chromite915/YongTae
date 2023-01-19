package p1228;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import p1228.a12Clipping.MyPanel;

public class a12Clipping extends JFrame {
	private MyPanel panel = new MyPanel();
	public a12Clipping() {
		setTitle("클리핑 예제");
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
			g.setClip(100, 20, 150, 150);
			// g.clipRect(80, 20, 140, 130);
			// setClip줄이 있고, clipRect줄도 있으면, 둘의 교집합 부분만 출력됨
			
			g.drawImage(img,  0,  0, getWidth(), getHeight(), this);
			g.setColor(Color.YELLOW);
			g.setFont(new Font("Arial", Font.ITALIC, 40));
			g.drawString("Go Gator!!", 10, 150);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a12Clipping();
	}
}