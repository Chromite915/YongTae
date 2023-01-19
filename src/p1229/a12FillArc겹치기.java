package p1229;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class a12FillArc겹치기 extends JFrame {
	private MyPanel panel = new MyPanel();
	public a12FillArc겹치기() {
		setTitle("JPanle의 paintComponent() 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(600, 600);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.fillArc(150, 150, 200, 200, 0, 90);
			g.setColor(Color.RED);
			g.fillArc(150, 150, 200, 200, 90, 90);
			g.setColor(Color.YELLOW);
			g.fillArc(150, 150, 200, 200, 180, 90);
			g.setColor(Color.GREEN);
			g.fillArc(150, 150, 200, 200, 270, 90);
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a12FillArc겹치기();
	}
}
