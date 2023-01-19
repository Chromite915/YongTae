package p230104;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class a042반복배열 extends JFrame {
	
	private MyPanel panel = new MyPanel();
	
	public a042반복배열() {
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
			/* 오답
			int []x = {getHeight()/2, 0, getHeight()/2, 0};		// 좌우 점
			int []y = {0, getWidth()/2, 0, getWidth()/2};		// 상하 점
				g.drawPolygon(x, y, 4); // 다이아몬드, 4=꼭지점의 수 */
			
			int [] x = new int [4];
			int [] y = new int [4];
			x[0] = getWidth()/2;
			y[0] = 0;
			x[1] = getWidth();
			y[1] = getHeight()/2;
			x[2] = x[0];
			y[2] = getHeight();
			x[3] = 0;
			y[3] = y[1];
			for(int i=0; i<10; i++) {
				g.drawPolygon(x, y, 4);
				y[0] = y[0] + 10;
				x[1] = x[1] - 10;
				y[2] = y[2] - 10;
				x[3] = x[3] + 10;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a042반복배열();
	}
}
