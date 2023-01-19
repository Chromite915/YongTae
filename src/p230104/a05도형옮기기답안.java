package p230104;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class a05도형옮기기답안 extends JFrame {
	public a05도형옮기기답안(){
		super("test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300,300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		//선언단계 
		private ImageIcon icon = new ImageIcon("images/back.jpg");
		private Image img = icon.getImage();
		private int ovalX=100, ovalY=100; // 좌표 예정값 선언
		private final int RADIUS = 20; // 반지름 예정값 선언
		// 아직은 아무 역할도 없는 숫자일 뿐
		
		public MyPanel() {
			// 리스너단계
			addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseDragged(MouseEvent e) {
					ovalX = e.getX(); // 드래그 한 위치를 원의 좌표로 선언?
					ovalY = e.getY();
					repaint(); // 밑의 그리기단계를 다시 호출하여 새로 그리기
				}
			});
		}
		// 그리기단계
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			g.setColor(Color.GREEN);
			g.fillOval(ovalX, ovalY, RADIUS, RADIUS); //선언한 수치들로 원 생성	 
		}
	}
	
	static public void main(String[] args) {
		new a05도형옮기기답안();
	}
}