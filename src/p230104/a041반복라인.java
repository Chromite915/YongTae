package p230104;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class a041반복라인 extends JFrame {
	
	private MyPanel panel = new MyPanel();
	
	public a041반복라인() {
		setTitle("JPanle의 paintComponent() 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//setContentPane(panel);							// 이렇게 해도 밑에 두줄이랑 똑같은 문법임
		Container c = getContentPane();
		c.add(panel);
		
		setSize(600, 600);
		setVisible(true);
	}
	class MyPanel extends JPanel {						// 패널에 그림 그렸다
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			
			/* 오답
			int j = 0;
			int l = 0;
			for(int i=1; i<100; i++) {
				g.drawLine(0, 20+j, panel.WIDTH, 20+j);
				j = j+20;
			}
			for(int k=1; k<100; k++) {
				g.drawLine(20+l, 0, 20+l, panel.HEIGHT);
				l = l+20;
			} */
			
			int dw = getWidth()/10;			// 얼마로 나누는지는 상관없으나, i의 반복수를 맞춰줘야 결과물이 보기 좋음
			for(int i=1; i<10; i++) {
				g.drawLine(i*dw, 0, i*dw, getHeight());
			}
			int dh = getHeight()/10;
			for(int i=1; i<10; i++) {
				g.drawLine(0, i*dh, getWidth(), i*dh);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a041반복라인();
	}
}
