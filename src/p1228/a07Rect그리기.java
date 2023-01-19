package p1228;
// 폰카 설명 참조
// 레이아웃 없음, 패널이 전체를 차지하고있다
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class a07Rect그리기 extends JFrame {
	private MyPanel panel = new MyPanel();
	public a07Rect그리기() {
		setTitle("JPanle의 paintComponent() 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(250, 220);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawRect(10, 10, 50, 50); // 10, 10의 위치에 50,50 크기의 네모
			g.drawRect(50,  50,  50,  50);
			g.setColor(Color.MAGENTA);
			g.drawRect(90,  90,  50,  50);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a07Rect그리기();

	}

}
