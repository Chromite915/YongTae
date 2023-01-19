package p1228;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

import p1228.a10Draw도형모음.MyPanel;

public class a10Draw도형모음 extends JFrame {
	private MyPanel panel = new MyPanel();
	public a10Draw도형모음() {
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
			g.drawLine(20, 20, 100, 100); // 20, 20과 100, 100을 이은 선
			g.setColor(Color.MAGENTA);
			g.drawOval(20, 20, 80, 80); // Oval = 원
			g.setColor(Color.GREEN);
			g.drawRect(20, 20, 80, 80); // 네모
			g.setColor(Color.BLACK);
			g.drawRoundRect(20, 150, 120, 80, 40, 60); // RoundRect = 모서리 둥근 네모 / 가로로 40, 세로로 60만큼 모서리 깎아라
			g.setColor(Color.RED);
			g.fillRoundRect(20, 240, 120, 80, 40, 60); // fill = 도형속을 색으로 체우기
			g.drawArc(20, 350, 80, 80, 90, 270); // 미완성 원
			int []x = {230, 190, 230, 270};
			int []y = {40, 120, 200, 120};
			g.drawPolygon(x, y, 4); // 다이아몬드, 4=꼭지점의 수
			g.fillArc(150, 350, 80, 80, 270, -270);
			int []x2 = {280, 240, 280, 320};
			int []y2 = {200, 270, 350, 270};
			g.fillPolygon(x2, y2, 4); // 다이아몬드, 4=꼭지점의 수
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a10Draw도형모음();
	}
}
